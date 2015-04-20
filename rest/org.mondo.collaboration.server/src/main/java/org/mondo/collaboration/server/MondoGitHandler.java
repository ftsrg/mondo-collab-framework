package org.mondo.collaboration.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.PushResult;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

public class MondoGitHandler {

	private String localPath, remotePath;
    private Repository localRepo;
    private Git git;
	
    public MondoGitHandler() {
    	try {
			init();
		} catch (IOException e) {
			System.out.println("Failed to initialize git.");
			e.printStackTrace();
		}
    }
    
    public void init() throws IOException {
        localPath = "D:/emfgit/mondo_test";
        remotePath = "https://github.com/1forintos/mondo_test.git";
        localRepo = new FileRepository(localPath + "/.git");
        git = new Git(localRepo);
    }
    
    public void addFile(String fileName) throws IOException, GitAPIException {
		File myfile = new File(localPath + "/model/" + fileName);
		System.out.println("add file: " + localPath + "/model/" + fileName);
		myfile.createNewFile();
		git.add().addFilepattern(fileName).call();
    }
    
    public void commit(String msg) throws IOException, GitAPIException,
    	JGitInternalException {
    	git.commit().setAll(true).setMessage(msg).call();
    }
	
    public void push() throws IOException, JGitInternalException,
    	GitAPIException {
    	CredentialsProvider cp = new UsernamePasswordCredentialsProvider("1forintos", "Buzievagy1");
    	Iterable<PushResult> pushResult = git.push().setCredentialsProvider(cp).call();
    	System.out.println("Push result: ");
    	for(PushResult res : pushResult) {
    		System.out.println(res.toString());
    	}
    }
    
    public void pull() throws IOException, GitAPIException {
        git.pull().call();
    }
    
    public ArrayList<String> logs() throws IOException, GitAPIException {
    	ArrayList<String> logs = new ArrayList<String>();
        Iterable<RevCommit> commitLogs = git.log().call();
        for(RevCommit commitLog : commitLogs) {
        	logs.add(
        		"Author, email, date: " + commitLog.getAuthorIdent() + "\n"
        		+ "Commit message: " + commitLog.getFullMessage() + "\n"
        	);
        }
        return logs;
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
