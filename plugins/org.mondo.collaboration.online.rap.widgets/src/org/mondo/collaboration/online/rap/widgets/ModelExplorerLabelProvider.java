package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class ModelExplorerLabelProvider extends LabelProvider {

	private static final long serialVersionUID = -4242396315862060731L;

	public static final String JOIN_SESSION = "Join";
	public static final String CREATE_SESSION = "";
	public static final String OWNER_SESSION = "Owner";
	
	@Override
	public String getText(Object element) {
		if(element instanceof StorageModelNode) {
			StorageModelNode node = (StorageModelNode) element;
			String ret = node.getText();
			if(node.getParent() == null) {
				ret += " " + node.getPath();
			}
			return ret;
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if(element instanceof StorageModelNode) {
			StorageModelNode node = (StorageModelNode) element;
			if(node.getType() == NodeType.Folder) {
				return Activator.getDefault().getImageRegistry().get("folder");
			} else {
				return Activator.getDefault().getImageRegistry().get("file");
			}
		}
			
		return super.getImage(element);
	}
}
