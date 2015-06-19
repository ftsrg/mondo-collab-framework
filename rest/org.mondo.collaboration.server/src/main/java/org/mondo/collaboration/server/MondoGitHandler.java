package org.mondo.collaboration.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand.ListMode;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.PushResult;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

public class MondoGitHandler {

	private static final String REPO_URL = "https://github.com/FTSRG/mondo-demo-repo";
	private static final String LOCAL_PATH = "D:\\emfgit\\projects";

	public static MondoGitHandler instance = new MondoGitHandler();
	
	// TODO add collection of GitInstances and their dynamic handling
	private ArrayList<GitInstance> storedRepos;
	
    private MondoGitHandler() {
    	try {
			init();
			initGit("org.mondo.collaboration.demo.example");
		} catch (IOException e) {
			System.out.println("Failed to initialize git.");
			e.printStackTrace();
		}
    }
    
    public void initGit(String projectName) {
 		String repoPath = LOCAL_PATH;// + "/" + projectName;// + "/master";
		System.out.println("Initializing git object for project: " + projectName + " at path: " + repoPath);
		try {
			Repository localRepo = new FileRepository(repoPath + "/.git");
			GitInstance newGitObject = new GitInstance(projectName + "_master", new Git(localRepo));
			storedRepos.add(newGitObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    public void init() throws IOException {
        storedRepos = new ArrayList<GitInstance>();
        // remotePath = "https://github.com/1forintos/mondo_test.git";
    }
    
    /*
    public void addFile(String fileName) throws IOException, GitAPIException {
		File myfile = new File(localPath + "/model/" + fileName);
		System.out.println("add file: " + localPath + "/model/" + fileName);
		myfile.createNewFile();
		git.getGitInstance().add().addFilepattern(fileName).call();
    }
    */
    
    public void commit(String msg, String projectName, String branchName) throws IOException, GitAPIException,
    	JGitInternalException {
    	getGitObject(projectName, branchName).getGitInstance()
    		.commit().setAll(true).setMessage(msg).call();
    }
	
    public void push(String projectName, String branchName, String username, String password) throws IOException, JGitInternalException,
    	GitAPIException {
    	CredentialsProvider cp = new UsernamePasswordCredentialsProvider(username, password);
    	Iterable<PushResult> pushResult = getGitObject(projectName, branchName).getGitInstance().push().setCredentialsProvider(cp).call();
    	System.out.println("Push result: ");
    	for(PushResult res : pushResult) {
    		System.out.println(res.toString());
    	}
    }
    
    public void pull(String projectName, String branchName) throws IOException, GitAPIException {
    	getGitObject(projectName, branchName).getGitInstance().pull().call();
    }
    
    public ArrayList<String> logs(String projectName, String branchName) throws IOException, GitAPIException {
    	ArrayList<String> logs = new ArrayList<String>();
        Iterable<RevCommit> commitLogs = getGitObject(projectName, branchName).getGitInstance().log().call();
        for(RevCommit commitLog : commitLogs) {
        	logs.add(
        		"Author, email, date: " + commitLog.getAuthorIdent() + "\n"
        		+ "Commit message: " + commitLog.getFullMessage() + "\n"
        	);
        }
        return logs;
    }

	public String cloneBranch(String projectName, String branchName) throws IOException, GitAPIException {
		String repoPath = LOCAL_PATH + "\\" + projectName; // + "/" + branchName;
		System.out.println("Initializing git object for project: " + projectName + " at path: " + repoPath);
		try {
			Repository localRepo = new FileRepository(repoPath + "/.git");
			GitInstance newGitObject = new GitInstance(projectName + "_" + branchName, new Git(localRepo));
			storedRepos.add(newGitObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String remotePath = REPO_URL + projectName + ".git";
		System.out.println("branchName - " + branchName);
		String branchPath = LOCAL_PATH + "\\" + projectName;
		System.out.println("Cloning branch [" + branchName + "] to path [" + branchPath + "]");
		// createOrCleanDir(branchPath);
		
		File branchFolder = new File(branchPath);
		if(!branchFolder.exists()) {
		    Git.cloneRepository().setURI(remotePath)
		    	.setDirectory(branchFolder)
		    	.setBranch(branchName).call();
		}
        return branchPath;
    }
	
	public String getBranches(String projectName) {
		String branches = "";
		try {
			List<Ref> bz = getGitObject(projectName, "master").getGitInstance().branchList().setListMode(ListMode.REMOTE).call();
			for (Ref b : bz) {
				String branchName = b.getName().substring(b.getName().lastIndexOf("\\") + 1);
	            System.out.println("cloned branch " + branchName);
	            if(!branches.equals("")) {
	            	branches += ";";
	            } 
	            branches += branchName;
	        }
		} catch (InvalidRemoteException e) {
			e.printStackTrace();
		} catch (TransportException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
		return branches;
	}
    
	private void createOrCleanDir(String path) {
		File dir = new File(path);
		if(dir.exists()) {
			File[] files = dir.listFiles();
		    if(files!=null) { //some JVMs return null for empty dirs
		        for(File f: files) {
		            if(f.isDirectory()) {
		            	createOrCleanDir(f.getPath());
		            } else {
		                f.delete();
		            }
		        }
		    }
		    dir.delete();
		}
		dir.mkdirs();
	}
	
	public GitInstance getGitObject(String projectName, String branchName) {
		String gitObjectName = projectName + "_master"; 
		for(GitInstance g : storedRepos) {
			if(g.getName().equals(gitObjectName)) {
				return g;
			}
		}
		return null;
	}
	
    /*
	public void createRepo() throws IOException {
        Repository newRepo = new FileRepository(localPath + ".git");
        newRepo.create();
    }
	
	public void clone() throws IOException, GitAPIException {
	 	Git.cloneRepository().setURI(remotePath)
	    	.setDirectory(new File(localPath)).call();
	}
	*/
}
