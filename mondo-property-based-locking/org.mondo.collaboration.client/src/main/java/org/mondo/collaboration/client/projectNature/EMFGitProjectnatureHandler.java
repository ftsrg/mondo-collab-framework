package org.mondo.collaboration.client.projectNature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class EMFGitProjectnatureHandler {

	private final static String idFileName = ".emfgit";

	public static void setNatureToProject(IProject project) {
		try {
			IProjectDescription description = project.getDescription();

			if (!description.hasNature(EMFGitPorjectNature.ID)) {
				String[] natures = description.getNatureIds();
				String[] newNatures = new String[natures.length + 1];
				
				System.arraycopy(natures, 0, newNatures, 0, natures.length);

				newNatures[natures.length] = EMFGitPorjectNature.ID;
				description.setNatureIds(newNatures);
				project.setDescription(description, null);

				createProjectID(project);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeNatureFromProject(IProject project) {
		try {
			IProjectDescription description = project.getDescription();

			if (description.hasNature(EMFGitPorjectNature.ID)) {
				String[] natures = description.getNatureIds();

				ArrayList<String> list = new ArrayList<String>(
						Arrays.asList(natures));

				list.remove(EMFGitPorjectNature.ID);

				String[] newNatures = (String[]) list.toArray(new String[list
						.size()]);

				description.setNatureIds(newNatures);
				project.setDescription(description, null);

				removeProjectID(project);
			}

		} catch (CoreException e) {

			e.printStackTrace();

		}
	}

	public static boolean isProjectHasEMFGitNature(IProject project) {

		IProjectDescription description;
		try {
			description = project.getDescription();
			if (description.hasNature(EMFGitPorjectNature.ID)) {
				return true;
			}
		} catch (CoreException e) {

			

			return false;
		}

		return false;
	}

	public static String getProjectID(IProject project) {

		if (isProjectHasEMFGitNature(project)) {

			IFile file = project.getFile(idFileName);
			File fileToRead = file.getRawLocation().toFile();
			
			if (fileToRead.exists()) {
				
				try {
					BufferedReader in = new BufferedReader(new FileReader(
							fileToRead));
					String id = in.readLine();

					in.close();

					if (id != null) {
						return id;
					}

				} catch (IOException e) {

					e.printStackTrace();
					return null;
				}

				return null;
			}
		}
		return null;
	}

	private static void createProjectID(IProject project)
			throws FileNotFoundException {
		UUID uuid = java.util.UUID.randomUUID();

		String id = uuid.toString();

		IFile resource = project.getFile(idFileName);

		File file = resource.getRawLocation().toFile();

		PrintWriter out = new PrintWriter(file);
		out.println(id);
		out.flush();
		out.close();
	}

	private static void removeProjectID(IProject project) throws CoreException {
		IFile resource = project.getFile(idFileName);
		resource.delete(true, null);
	}
}
