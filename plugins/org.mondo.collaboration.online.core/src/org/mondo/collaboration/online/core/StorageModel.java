package org.mondo.collaboration.online.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.google.common.collect.Maps;

public class StorageModel {

	protected final StorageAccess sa;
	private Collection<StorageModelNode> roots;
	
	Map<String, StorageModelNode> mapping = Maps.newHashMap();
	
	public StorageModel(StorageAccess sa) {
		this.sa = sa;
		initializeRoots();
	}
	private void initializeRoots() {
		roots = sa.explore(this, StorageAccess.getRepository(), null, StorageAccess.getRepository());
	}
	protected StorageAccess getStorageAccess() {
		return sa;
	}

	public Map<String, StorageModelNode> getNodeMapping() {
		return mapping;
	}
	
	public static class StorageModelNode {
		
		private final String text;
		private NodeType type;
		private final StorageModelNode parent;
		private final String path;
		private final StorageAccess sa;
		
		private Collection<StorageModelNode> children = null;
		private StorageModel model;
		private String gold;
		
		public StorageModelNode(StorageModel model, String text, String path, NodeType type, StorageModelNode parent, StorageAccess sa, String gold) {
			this.model = model;
			this.text = text;
			this.path = path;
			this.type = type;
			this.parent = parent;
			this.sa = sa;
			this.gold = gold;
			
			model.getNodeMapping().put(path, this);
		}
		
		public String getGold() {
			return gold;
		}
		
		public String getText() {
			return text;
		}
		
		public void setType(NodeType type) {
			this.type = type;
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
				children = sa.explore(model, path, this, gold);
			}
			return children;
		}
		
		public boolean hasChildren() throws Exception {
			if(children == null) {
				children = sa.explore(model, path, this, gold);
			}
			return !children.isEmpty();
		}
		
		public void initChildren() {
			children = new ArrayList<StorageModel.StorageModelNode>();
		}

		public StorageModel getModel() {
			return model;
		}
		
	}

	public Object[] getRoots() {
		return roots.toArray();
	}
	
	public enum NodeType {Repository, Folder, Model}		
}
