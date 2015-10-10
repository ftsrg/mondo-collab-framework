package org.mondo.collaboration.client;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFileModificationValidator;
import org.eclipse.core.resources.team.FileModificationValidationContext;
import org.eclipse.core.resources.team.FileModificationValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class FileModTest extends FileModificationValidator {

	@Override
	public IStatus validateEdit(IFile[] files,
			FileModificationValidationContext context) {
		// TODO Auto-generated method stub
		System.out.println("EDIT HOOK");
		
		for(IFile item : files)
		{
			System.out.println(item.getName());
		}
		return null;
		
		//new s
		
		//return Status.OK;
	//	return IStatus.OK;
		//return null;
	}

	
}
