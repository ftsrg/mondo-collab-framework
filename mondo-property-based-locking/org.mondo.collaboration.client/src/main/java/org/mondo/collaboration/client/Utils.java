package org.mondo.collaboration.client;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.simple.JSONObject;
import org.mondo.collaboration.client.projectNature.EMFGitProjectnatureHandler;

public class Utils {

	public static String getSelectedProjectName() {

		IProject selectedProject = getSelectedProject();
		if (selectedProject != null) {
			return getSelectedProject().getName();
		}
		return null;
	}
	
	public static IProject getSelectedProject() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			
			if(firstElement instanceof IProject)
			{
				return (IProject) firstElement;
			}
			else if(firstElement instanceof IResource)
			{
				return ((IResource) firstElement).getProject();
			}
		}

		return null;
	}


	public static void createLocksDirIfNotExists(String projectName) {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject myWebProject = myWorkspaceRoot.getProject(projectName);

		IFolder locksDir = myWebProject.getFolder("lock");

		if (!locksDir.exists()) {
			try {
				locksDir.create(IResource.NONE, true, getProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<IProject> getActiveEMFGitProjects() {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject[] projects = myWorkspaceRoot.getProjects();

		List<IProject> list = Arrays.asList(projects);
		list = list
				.stream()
				.filter(p -> p.isOpen() == true
						&& EMFGitProjectnatureHandler
								.isProjectHasEMFGitNature(p))
				.collect(Collectors.toList());

		return list;
	}

	public static IFolder getProjectLockDir(String projectName) {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject project = myWorkspaceRoot.getProject(projectName);

		IFolder locksDir = project.getFolder("lock");

		return locksDir;
	}

	public static IProgressMonitor getProgressMonitor() {

		return new IProgressMonitor() {

			public void worked(int work) {

			}

			public void subTask(String name) {

			}

			public void setTaskName(String name) {

			}

			public void setCanceled(boolean value) {

			}

			public boolean isCanceled() {

				return false;
			}

			public void internalWorked(double work) {

			}

			public void done() {

			}

			public void beginTask(String name, int totalWork) {

			}
		};
	}

	public static Map<String, Long> convertJsonObjectToMap(JSONObject jsonObject) {

		Map<String, Long> map = new HashMap<String, Long>();
		jsonObject.keySet().stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String key) {

				Object value = jsonObject.get(key);
				map.put(key, (Long) value);
			}
		});

		return jsonObject;
	}

	public static Long getFilesModDate(String path) {
		File file = new File(path);
		return file.lastModified();
	}
	
	
	public static String getEobjectsFiled(Object o,String fieldName)
	{
		if (o instanceof EObject) {
            EStructuralFeature feature = ((EObject) o).eClass().getEStructuralFeature(fieldName);
            if (feature != null) {
                Object value = ((EObject) o).eGet(feature);
                if (value != null) {
                    return value.toString();
                }
            }
        }
        return null;
		
	}

	public static EList<Pattern> getPatternsFromFile(URI fileURI) {

		try {
			ResourceSet resourceSet = new ResourceSetImpl();

			Pattern p = null;

			
			Resource patternResource = resourceSet.getResource(fileURI, true);

			if (patternResource != null) {
				if (patternResource.getErrors().size() == 0
						&& patternResource.getContents().size() >= 1) {
					EObject topElement = patternResource.getContents().get(0);
					if (topElement instanceof PatternModel) {

						return ((PatternModel) topElement).getPatterns();

					}
				}
			}

			return null;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
