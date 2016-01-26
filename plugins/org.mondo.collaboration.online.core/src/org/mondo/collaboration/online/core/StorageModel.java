package org.mondo.collaboration.online.core;

import java.util.ArrayList;
import java.util.Collection;

public class StorageModel {

	protected final StorageAccess sa;
	private Collection<StorageModelNode> roots;
	
	public StorageModel(StorageAccess sa) throws Exception {
		this.sa = sa;
		initializeRoots();
	}
	private void initializeRoots() throws Exception {
		roots = sa.explore(StorageAccess.getRepository(), null);
	}
	protected StorageAccess getStorageAccess() {
		return sa;
	}

	public static class StorageModelNode {
		
		private final String text;
		private final NodeType type;
		private final StorageModelNode parent;
		private final String path;
		private final StorageAccess sa;

		private Collection<StorageModelNode> children = null;
		
		public StorageModelNode(String text, String path, NodeType type, StorageModelNode parent, StorageAccess sa) {
			this.text = text;
			this.path = path;
			this.type = type;
			this.parent = parent;
			this.sa = sa;
		}
		
		public String getText() {
			return text;
		}
		
		public NodeType getType() {
			return type;
		}
		
		public String getPath() {
			return path;
		}
		
		public StorageModelNode getParent() {
			return parent;
		}
		
		public Collection<StorageModelNode> getChildren() throws Exception {
			if(children == null) {
				children = sa.explore(path, this);
			}
			return children;
		}
		
		public boolean hasChildren() throws Exception {
			if(children == null) {
				children = sa.explore(path, this);
			}
			return !children.isEmpty();
		}
		
		public void initChildren() {
			children = new ArrayList<StorageModel.StorageModelNode>();
		}
		
	}

	public Object[] getRoots() {
		return roots.toArray();
	}
	
	public enum NodeType {Repository, Folder, ModelInSession, ModelNoSession, ModelOwnSession}		
}
