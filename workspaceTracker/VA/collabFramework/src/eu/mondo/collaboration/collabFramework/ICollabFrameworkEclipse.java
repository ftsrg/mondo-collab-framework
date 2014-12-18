package eu.mondo.collaboration.collabFramework;

import org.eclipse.core.resources.IFile;


public interface ICollabFrameworkEclipse extends IModelCollaboration<IFile> {
	
	IFile getFile(String filePath);

}
