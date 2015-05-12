package org.mondo.collaboration.client;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mondo.collaboration.client.preference.Preferences;
import org.mondo.collaboration.client.ui.EMFGitLocksView;
import org.osgi.framework.BundleContext;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "mondo.collab.client.skeleton"; //$NON-NLS-1$
	static Client client;

	private static final String eiqPostFix = ".eiq";
	private static final String bindPostFix = ".binds";
	// The shared instance
	private static Activator plugin;

	private static ServerPooler pooler;

	private static IPreferenceStore preferenceStore;

	public static IPreferenceStore getPreferences() {

		if (preferenceStore == null) {
			preferenceStore = getDefault().getPreferenceStore();

		}

		return preferenceStore;
	}

	/**
	 * The constructor
	 */
	public Activator() {

	}

	public void start(BundleContext context) throws Exception {
		plugin = this;

		System.out.println("EMFGit started");

	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static Client getClient() {
		return client;
	}

	@Override
	public void earlyStartup() {

		Preferences.setProperties(getPreferences());

		client = new Client();

		pooler = new ServerPooler();
		pooler.start();

		IPartListener2 listener = new IPartListener2() {

			@Override
			public void partVisible(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partOpened(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partInputChanged(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partHidden(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
				
			}

			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {

			}

			@Override
			public void partActivated(IWorkbenchPartReference partRef) {
				
				activateLockView(partRef.getPart(false));

			}
		};

		final IWorkbench workbench = PlatformUI.getWorkbench();

		workbench.getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = workbench.getActiveWorkbenchWindow()
						.getActivePage();

				try {
					IWorkbenchPart activePart = workbench
							.getActiveWorkbenchWindow().getActivePage()
							.getActiveEditor();

					activateLockView(activePart);
				} catch (Exception e) {
					
					
				}

				
				if (page != null) {

					page.addPartListener(listener);
				}
			}
		});

	}

	private String lastModelName;

	private void activateLockView(IWorkbenchPart partRef) {

		if (partRef != null) {

			if (partRef instanceof IEditorPart) {

				IEditorPart editor = ((IEditorPart)partRef);

				if (editor instanceof IEditingDomainProvider) {

					System.out.println("activate");
					IEditingDomainProvider ed = (IEditingDomainProvider) editor;

					EList<Resource> list = ed.getEditingDomain()
							.getResourceSet().getResources();

					IFile eiqFile = null;
					IFile bindFile = null;

					String modelName = null;

					// IEditingDomainProvider editor=null;
					for (Resource r : list) {
						IPath path = new Path(r.getURI().toString()
								.replace("platform:/resource/", ""));

						IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin
								.getWorkspace().getRoot();

						IFile file = myWorkspaceRoot.getFile(path);
						IProject project = file.getProject();

						IFolder lockFolder = project.getFolder("lock");

						String fileName = file.getName();

						String fileExtension = file.getFileExtension();

						if (fileExtension == null) {
							modelName = fileName;
						} else {
							if (fileExtension.equals("")) {
								modelName = fileName.substring(0,
										fileName.length() - 2);
							} else {
								modelName = fileName.substring(0,
										fileName.lastIndexOf(fileExtension));
								modelName = modelName.substring(0,
										modelName.lastIndexOf("."));
							}
						}

						eiqFile = lockFolder.getFile(modelName + eiqPostFix);
						bindFile = lockFolder.getFile(modelName + bindPostFix);

						// we only intrested in the first resource's path
						break;
					}

					refreshLockView(eiqFile, bindFile,
							(IEditingDomainProvider) editor, modelName);
				}
			}
		}
	}

	private void refreshLockView(IFile eiqFile, IFile bindFile,
			IEditingDomainProvider editor, String currentModelName) {

		IWorkbench workbench = PlatformUI.getWorkbench();

		IViewPart part = workbench.getActiveWorkbenchWindow().getActivePage()
				.findView(EMFGitLocksView.ID);

		if (part instanceof EMFGitLocksView) {

			EMFGitLocksView view = (EMFGitLocksView) part;

			if (lastModelName == null) {
				lastModelName = currentModelName;
				view.refresh(eiqFile, bindFile, editor);
			} else if (lastModelName.equals(currentModelName)) {

				if (view.isUIVisible() == false) {
					view.refresh(eiqFile, bindFile, editor);
				}
				view.setEditingDomainProvider(editor);
				
				
			} else if (!lastModelName.equals(currentModelName)) {
				lastModelName = currentModelName;
				view.refresh(eiqFile, bindFile, editor);
			}
			

		}
	}

}
