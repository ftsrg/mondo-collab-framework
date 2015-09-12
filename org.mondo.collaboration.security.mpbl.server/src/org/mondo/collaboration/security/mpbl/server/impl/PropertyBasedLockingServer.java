package org.mondo.collaboration.security.mpbl.server.impl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.patternLanguage.Modifiers;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.mondo.collaboration.security.mpbl.server.IPropertyBasedLockingServer;
import org.mondo.collaboration.security.mpbl.server.LockQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.LockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.LockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockQueryDTO;
import org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLockingStandaloneSetup;

import com.google.common.collect.Lists;
import com.google.common.io.Files;

public class PropertyBasedLockingServer implements IPropertyBasedLockingServer {

    private static PropertyBasedLockingServer INSTANCE;

    final String svnURL = System.getProperty("svnURL");
    final String goldRepoPath = System.getProperty("goldRepoPath");
    final String adminUser = System.getProperty("adminUser");
    final String adminPassword = System.getProperty("adminPassword");
    final String tempFolder = System.getProperty("tempFolder");

    final String SVN_CHECKOUT_COMMAND = "svn checkout %s/%s %s/%s --username %s --password %s --quiet --non-interactive";
    final String SVN_ADD_COMMAND = "svn add --force %s --auto-props --parents --depth infinity -q";
    final String SVN_COMMIT_COMMAND = "svn commit %s -m \"%s\" --username %s --password %s --quiet --non-interactive";
    final String SVN_DELETE_COMMAND = "svn delete %s";
    final String SVN_LIST_COMMAND = "svn list %s@0 --username %s --password %s --non-interactive";

    private PropertyBasedLockingServer(boolean offline) {
//        if (offline) {
            EMFPatternLanguageStandaloneSetup.doSetup();
            MondoPropertyBasedLockingStandaloneSetup.doSetup();
//        }
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
        if(!result.isSuccess())
            return result;
        
        checkoutGoldRepository();

        String fileName = calculateFileName();

        // all the patterns will be stored in the root of the gold repository
        serialize(lock.getLockDefinitionModel(),
                Paths.get(tempFolder, goldRepoPath, ".pbl-patterns", lock.getUser(), fileName + ".eiq"));

        commitGoldRepository("New lock definition published");
        cleanup();

        return new ResponseLockDTO(true, "");
    }

    @Override
    public ResponseLockDTO unpublishLock(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if(!result.isSuccess())
            return result;
        
        checkoutGoldRepository();

        String fileName = calculateFileName();
        // all the patterns are stored in the root of the gold repository
        deletePattern(Paths.get(tempFolder, goldRepoPath, ".pbl-patterns", lock.getUser(), fileName + ".eiq"));

        commitGoldRepository("Existing lock definition unpublished");
        cleanup();

        return new ResponseLockDTO(true, "");
    }

    @Override
    public ResponseLockDTO lock(LockDTO lock) {
        ResponseLockDTO result = validateUser(lock.getUser(), lock.getPassword(), lock.getFrontRepository());
        if(!result.isSuccess())
            return result;
        
        checkoutGoldRepository();

        String lockDefinitionFileName = lock.getLockDefinitionId();
        Path lockDefinitionOriginalPath = Paths.get(tempFolder, goldRepoPath, ".pbl-patterns", lock.getUser(),
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
        if(!result.isSuccess())
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
            String cmd = String.format(SVN_COMMIT_COMMAND, Paths.get(tempFolder, goldRepoPath).toString(), message,
                    adminUser, adminPassword);
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
            return process.exitValue() == 0;
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

//    private String calculateFileName(String description) {
//        return Normalizer.normalize(description, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
//                .replaceAll(" ", "_").toLowerCase();
//    }

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
        Collection<Pattern> lockDefinitions = Lists.newArrayList();
        File lockDefinitionFolder = Paths.get(tempFolder, goldRepoPath, ".pbl-patterns").toFile();
        File[] files = lockDefinitionFolder.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".eiq");
            }
        });

        for (File file : files) {
            PatternModel model = loadLockDefinition(file);
            lockDefinitions.addAll(
                    model.getPatterns().stream().filter(new PublicPatternPredicate()).collect(Collectors.toList()));
        }

        cleanup();
        return new ResponseLockDefinitionQueryDTO(lockDefinitions);
    }

    @Override
    public ResponseLockQueryDTO queryLocks(LockQueryDTO query) {
        // TODO Auto-generated method stub
        return null;
    }

    private PatternModel loadLockDefinition(File file) {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getPath().toString()), true);
        return (PatternModel) resource.getContents().get(0);
    }

    private class PublicPatternPredicate implements Predicate<Pattern> {

        @Override
        public boolean test(Pattern t) {
            return t.getModifiers().stream().anyMatch(new PublicModidiferPredicate());
        }

        private class PublicModidiferPredicate implements Predicate<Modifiers> {

            @Override
            public boolean test(Modifiers t) {
                return !t.isPrivate();
            }

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
