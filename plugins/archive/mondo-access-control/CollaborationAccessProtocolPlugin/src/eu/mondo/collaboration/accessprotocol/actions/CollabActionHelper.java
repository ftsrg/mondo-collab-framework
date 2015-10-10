package eu.mondo.collaboration.accessprotocol.actions;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class CollabActionHelper {
	
	public static String getWokspacePath(){
		String path = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    if (window != null)
	    {
	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        Object firstElement = selection.getFirstElement();
	        if (firstElement instanceof IAdaptable)
	        {
	            //get object which represents the workspace  
	            IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	            //get location of workspace (java.io.File)  
	            File workspaceDirectory = workspace.getRoot().getLocation().toFile();
	            path = workspaceDirectory.getAbsolutePath();
	        }
	    }
	    return path;
	}
	
	public static String getSelectedProjectPath(){
		String path = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    if (window != null)
	    {
	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        Object firstElement = selection.getFirstElement();
	        if (firstElement instanceof IAdaptable)
	        {
	            IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
	            IPath projectPath = project.getFullPath();
	            
	            //get object which represents the workspace  
	            IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	            //get location of workspace (java.io.File)  
	            File workspaceDirectory = workspace.getRoot().getLocation().toFile();
	            
	            File projectDirectory = new File(workspaceDirectory, projectPath.toString());
	            path = projectDirectory.getAbsolutePath();
	        }
	    }
	    return path;
	}
}
