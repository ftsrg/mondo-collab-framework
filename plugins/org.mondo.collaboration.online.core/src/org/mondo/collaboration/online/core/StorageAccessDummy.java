package org.mondo.collaboration.online.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class StorageAccessDummy extends StorageAccess {

	private String internalEiqFile = "/home/marci/git/mondo-demo-wt/Demo/macl.project/src/macl/project/queries.eiq";
	private String internalMaclFile = "/home/marci/git/mondo-demo-wt/Demo/macl.project/src/macl/project/rules.macl";
	private String filepath = "/home/marci/git/mondo-demo-wt/Demo/demo.project/simplified-example.wtspec4m";
	private StorageModelNode node;

	public StorageAccessDummy(String username, String password) throws FileNotFoundException, IOException {
		super(username, password);
	}

	@Override
	public String login() {
		return null;
	}

	@Override
	public Collection<StorageModelNode> explore(StorageModel model, String path, StorageModelNode parent, String gold) {
		node = new StorageModelNode(model, "example.wtspec4m", filepath, NodeType.NoModification, null, this, "/dummyLocation");
		return Arrays.asList(node);
	}

	@Override
	public URI startSession(String path) throws Exception {
		return URI.createFileURI(path);
	}

	@Override
	public void finishSession(String path) {
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
	public StorageModelNode updateNode(String path) {
		return node;
	}
	
	@Override
	public StorageModelNode updateNode(StorageModelNode node) {
		return node;
	}

	@Override
	public void commit(String path, String message) {
		// nop
	}
}
