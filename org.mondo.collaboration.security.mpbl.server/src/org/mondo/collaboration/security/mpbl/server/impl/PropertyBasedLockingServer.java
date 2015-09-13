package org.mondo.collaboration.security.mpbl.server.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.mondo.collaboration.security.mpbl.server.IPropertyBasedLockingServer;
import org.mondo.collaboration.security.mpbl.server.LockQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.LockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.LockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockQueryDTO;
import org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLockingStandaloneSetup;

import com.google.common.collect.Maps;
import com.google.common.io.Files;

public class PropertyBasedLockingServer implements IPropertyBasedLockingServer {

    private static final String PBL_LOCK_DEF_FOLDER = ".pbl-patterns";

    private static PropertyBasedLockingServer INSTANCE;

    final String svnURL = System.getProperty("svnURL");
    final String goldRepoPath = System.getProperty("goldRepoPath");
    final String adminUser = System.getProperty("adminUser");
    final String adminPassword = System.getProperty("adminPassword");
    final String tempFolder = Paths.get(System.getProperty("tempFolder"), "mondo-server").toString();

    final String SVN_CHECKOUT_COMMAND = "svn checkout %s/%s %s/%s --username %s --password %s --quiet --non-interactive";
    final String SVN_ADD_COMMAND = "svn add --force %s --auto-props --parents --depth infinity -q";
    final String SVN_COMMIT_COMMAND = "svn commit ./ -m \"%s\" --username %s --password %s --quiet --depth infinity --non-interactive";
    final String SVN_DELETE_COMMAND = "svn delete %s";
    final String SVN_LIST_COMMAND = "svn list %s@0 --username %s --password %s --non-interactive";

    private PropertyBasedLockingServer(boolean offline) {
        // if (offline) {
        EMFPatternLanguageStandaloneSetup.doSetup();
        MondoPropertyBasedLockingStandaloneSetup.doSetup();
        // }
    }

    public static PropertyBasedLockingServer instanceOffline() {
        if (INSTANCE == null) {
            INSTANCE = new PropertyBasedLockingServer(true);
        }
        return INSTANCE;
    }

    public static PropertyBasedLockingServer instance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertyBasedLockingServer(false);
        }
        return INSTANCE;
    }

    @Override
    public ResponseLockDTO publishLockDefinition(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if (!result.isSuccess())
            return result;

        checkoutGoldRepository();

        String fileName = calculateFileName();

        // all the patterns will be stored in the root of the gold repository
        serialize(lock.getLockDefinitionModel(),
                Paths.get(tempFolder, goldRepoPath, PBL_LOCK_DEF_FOLDER, lock.getUser(), fileName + ".eiq"));

        saveContent(lock.getDescription(),
                Paths.get(tempFolder, goldRepoPath, PBL_LOCK_DEF_FOLDER, lock.getUser(), fileName + ".desc"));

        commitGoldRepository("New lock definition published");
        cleanup();

        return new ResponseLockDTO(true, "");
    }

    @Override
    public ResponseLockDTO unpublishLock(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if (!result.isSuccess())
            return result;

        checkoutGoldRepository();

        String fileName = calculateFileName();
        // all the patterns are stored in the root of the gold repository
        deletePattern(Paths.get(tempFolder, goldRepoPath, PBL_LOCK_DEF_FOLDER, lock.getUser(), fileName + ".eiq"));

        commitGoldRepository("Existing lock definition unpublished");
        cleanup();

        return new ResponseLockDTO(true, "");
    }

    @Override
    public ResponseLockDTO lock(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if (!result.isSuccess())
            return result;

        checkoutGoldRepository();

        String lockDefinitionFileName = lock.getLockDefinitionId();
        Path lockDefinitionOriginalPath = Paths.get(tempFolder, goldRepoPath, PBL_LOCK_DEF_FOLDER, lock.getUser(),
                lockDefinitionFileName + ".eiq");
        Path lockDefinitionResourcePath = Paths.get(tempFolder, goldRepoPath, lock.getResourcePath(),
                lockDefinitionFileName + ".eiq");
        try {
            Files.copy(lockDefinitionOriginalPath.toFile(), lockDefinitionResourcePath.toFile());
        } catch (IOException e) {
            return new ResponseLockDTO(false, "");
        }
        String lockId = UUID.randomUUID().toString();
        Path lockPath = Paths.get(tempFolder, goldRepoPath, lock.getResourcePath(), lockId + ".mpbl");
        serialize(lock.getLockModel(), lockPath);

        commitGoldRepository("New lock created");
        cleanup();

        return new ResponseLockDTO(true, lockId);
    }

    @Override
    public ResponseLockDTO unlock(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if (!result.isSuccess())
            return result;

        checkoutGoldRepository();

        Path lockPath = Paths.get(tempFolder, goldRepoPath, lock.getResourcePath(), lock.getLockId() + ".mpbl");
        deleteLock(lockPath);

        commitGoldRepository("Lock removed");
        cleanup();

        return new ResponseLockDTO(true, "");
    }

    private boolean checkoutGoldRepository() {
        try {
            String cmd = String.format(SVN_CHECKOUT_COMMAND, svnURL, goldRepoPath, tempFolder, goldRepoPath, adminUser,
                    adminPassword);
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
            return process.exitValue() == 0;
        } catch (IOException | InterruptedException e) {
            return false;
        }
    }

    private boolean commitGoldRepository(String message) {
        try {
            String cmd = String.format(SVN_ADD_COMMAND, Paths.get(tempFolder, goldRepoPath).toString());
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
            if (process.exitValue() != 0)
                return false;
        } catch (IOException | InterruptedException e) {
            return false;
        }
        try {
            String cmd = String.format(SVN_COMMIT_COMMAND, message, adminUser, adminPassword);
            Process process = Runtime.getRuntime().exec(cmd, null, Paths.get(tempFolder, goldRepoPath).toFile());
            process.waitFor();
            if (process.exitValue() != 0) {
                return false;
            }
            return true;
        } catch (IOException | InterruptedException e) {
            return false;
        }
    }

    private void cleanup() {
        delete(new File(tempFolder));
    }

    private boolean serialize(EObject model, Path path) {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(URI.createFileURI(path.toString()));
        resource.getContents().add(model);
        try {
            resource.save(Collections.emptyMap());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean deletePattern(Path path) {
        try {
            String cmd = String.format(SVN_DELETE_COMMAND, path.toString());
            int exitValue = Runtime.getRuntime().exec(cmd).exitValue();
            return exitValue == 0;
        } catch (IOException e) {
            return false;
        }
    }

    private boolean deleteLock(Path path) {
        try {
            String cmd = String.format(SVN_DELETE_COMMAND, path.toString());
            int exitValue = Runtime.getRuntime().exec(cmd).exitValue();
            return exitValue == 0;
        } catch (IOException e) {
            return false;
        }
    }

    // private String calculateFileName(String description) {
    // return Normalizer.normalize(description, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
    // .replaceAll(" ", "_").toLowerCase();
    // }

    private String calculateFileName() {
        return "lockDefinition" + new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
    }

    public static boolean delete(File file) {

        File[] flist = null;

        if (file == null) {
            return false;
        }

        if (file.isFile()) {
            return file.delete();
        }

        if (!file.isDirectory()) {
            return false;
        }

        flist = file.listFiles();
        if (flist != null && flist.length > 0) {
            for (File f : flist) {
                if (!delete(f)) {
                    return false;
                }
            }
        }

        return file.delete();
    }

    @Override
    public ResponseLockDefinitionQueryDTO queryLockDefinitions(LockDefinitionQueryDTO query) {
        checkoutGoldRepository();
        Map<String, PatternModel> lockDefinitions = Maps.newHashMap();
        File lockDefinitionFolder = Paths.get(tempFolder, goldRepoPath, PBL_LOCK_DEF_FOLDER).toFile();
        Collection<File> files = listFileTree(lockDefinitionFolder);

        for (File file : files) {
            if(Files.getFileExtension(file.getName()).equals("eiq")) {
            PatternModel model = loadLockDefinition(file);
            String desc = loadDescription(file);
            if (desc != null && !desc.isEmpty())
                lockDefinitions.put(desc, model);
            }
        }

        cleanup();
        return new ResponseLockDefinitionQueryDTO(lockDefinitions);
    }

    public static Collection<File> listFileTree(File dir) {
        if (null == dir || !dir.isDirectory()) {
            return Collections.emptyList();
        }
        final Set<File> fileTree = new HashSet<File>();
        for (File entry : dir.listFiles()) {
            if (entry.isFile()) {
                fileTree.add(entry);
            } else {
                fileTree.addAll(listFileTree(entry));
            }
        }
        return fileTree;
    }

    @Override
    public ResponseLockQueryDTO queryLocks(LockQueryDTO query) {
        return null;
    }

    private PatternModel loadLockDefinition(File file) {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getPath().toString()), true);
        return (PatternModel) resource.getContents().get(0);
    }

    private String loadDescription(File parent) {
        File folder = parent.getParentFile();
        String file = Files.getNameWithoutExtension(parent.toPath().toString()) + ".desc";
        Path path = Paths.get(folder.getPath(), file);
        try {
            return Files.toString(new File(path.toString()), Charset.forName("UTF-8"));
        } catch (IOException e) {
        }
        return "";
    }

    // private class PublicPatternPredicate implements Predicate<Pattern> {
    //
    // @Override
    // public boolean test(Pattern t) {
    // return t.getModifiers().stream().anyMatch(new PublicModidiferPredicate());
    // }
    //
    // private class PublicModidiferPredicate implements Predicate<Modifiers> {
    //
    // @Override
    // public boolean test(Modifiers t) {
    // return !t.isPrivate();
    // }
    //
    // }
    // }

    private void saveContent(String content, Path path) {
        try {
            PrintWriter writer = new PrintWriter(path.toFile());
            writer.print(content);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ResponseLockDTO validateUser(String username, String password, String front) {
        try {
            String cmd = String.format(SVN_LIST_COMMAND, front, username, password);
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
            return new ResponseLockDTO(process.exitValue() == 0, "Invalid user credentials");
        } catch (IOException | InterruptedException e) {
            return new ResponseLockDTO(false, "Unhandled execption occurred");
        }
    }
}
