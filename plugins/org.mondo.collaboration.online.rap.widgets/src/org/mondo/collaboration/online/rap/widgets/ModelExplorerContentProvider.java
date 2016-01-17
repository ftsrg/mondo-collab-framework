package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.mondo.collaboration.online.core.StorageModel;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class ModelExplorerContentProvider implements ITreeContentProvider {

	private static final long serialVersionUID = 8829665175630228011L;
	private StorageModel model;

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if(newInput instanceof StorageModel) {
			StorageModel model = (StorageModel) newInput;
			this.model = model;
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return model.getRoots();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof StorageModel)
			return model.getRoots();
		if(parentElement instanceof StorageModelNode) {
			StorageModelNode storageModelNode = (StorageModelNode) parentElement;
			try {
				return storageModelNode.getChildren().toArray();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof StorageModel)
			return null;
		if(element instanceof StorageModelNode) {
			StorageModelNode storageModelNode = (StorageModelNode) element;
			return storageModelNode.getParent();
		} 
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof StorageModel)
			return model.getRoots().length > 0;
		if(element instanceof StorageModelNode) {
			StorageModelNode storageModelNode = (StorageModelNode) element;
			if(storageModelNode.getType() == NodeType.Folder)
				try {
					if (!storageModelNode.getChildren().isEmpty() ) 
						return true;
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return false;
	}

}
