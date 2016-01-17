package org.mondo.collaboration.online.rap.widgets;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageLoader;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class ModelExplorerLabelProvider extends LabelProvider {

	private static final long serialVersionUID = -4242396315862060731L;

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
