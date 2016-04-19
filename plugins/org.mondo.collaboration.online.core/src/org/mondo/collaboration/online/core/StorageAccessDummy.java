package org.mondo.collaboration.online.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class StorageAccessDummy extends StorageAccess {

	private StorageModelNode file;
	private StorageModelNode lock;
	private StorageModelNode rule;
	private StorageModelNode query;
	private String internalEiqFile = "/home/meres/git/mondo-demo-wt/Demo/macl.project/src/macl/project/queries.eiq";
	private String internalMaclFile = "/home/meres/git/mondo-demo-wt/Demo/macl.project/src/macl/project/rules.macl";
	private String internalMpblFile = "/home/meres/git/mondo-demo-wt/Demo/macl.project/src/macl/project/lock.mpbl";
	private String filepath = "/home/meres/git/mondo-demo-wt/Demo/demo.project/simplified-example.wtspec4m";

	public StorageAccessDummy(String username, String password) throws FileNotFoundException, IOException {
		super(username, password);
	}

	@Override
	public String login() {
		return null;
	}

	@Override
	public Collection<StorageModelNode> explore(StorageModel model, String path, StorageModelNode parent, String gold) {
		file = new StorageModelNode(model, "example.wtspec4m", filepath, NodeType.Model, null, this, "/file");
		lock = new StorageModelNode(model, "lock.mpbl", internalMpblFile, NodeType.Model, null, this, "/lock");
		rule = new StorageModelNode(model, "rule.macl", internalMaclFile, NodeType.Model, null, this, "/rule");
		query = new StorageModelNode(model, "query.eiq", internalEiqFile, NodeType.Model, null, this, "/query");
		return Arrays.asList(file, lock, rule, query);
	}

	@Override
	public URI startSession(String path) throws Exception {
		return URI.createFileURI(path);
	}

	@Override
	public void finishSession(URI goldConfimentUri, String ownerUsername, String ownerPassword) {
	}
	
	@Override
	protected URI getInternalEiqFile() {
		return URI.createFileURI(internalEiqFile);
	}

	@Override
	protected URI getInternalMaclFile() {
		return URI.createFileURI(internalMaclFile);
	}

	@Override
	protected URI getInternalMpblFile() {
		return URI.createFileURI(internalMpblFile);
	}

	@Override
	public ExecutionResponse commit(String path, String message, OnlineLeg leg) {
		return new ExecutionResponse(Collections.emptyList(), Collections.emptyList());
	}

	@Override
	public FileStatus checkFileStatus(String path) throws Exception {
		return FileStatus.Normal;
	}

	@Override
	public ExecutionResponse commit(String path, String message, String username, String password) {
		return new ExecutionResponse(Collections.emptyList(), Collections.emptyList());
	}

	@Override
	public ExecutionResponse revert(String path, String username, String password) {
		return new ExecutionResponse(Collections.emptyList(), Collections.emptyList());
	}
}
