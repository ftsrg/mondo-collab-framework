package org.mondo.collaboration.client.command.lock;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import school.Course;
import school.School;
import school.SchoolPackage;

public class EMFchangeDetectTester implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
//	
//	IChangeListener icl=new IChangeListener() {
//		
//		@Override
//		public void update(boolean changed) {
//			// TODO Auto-generated method stub
//			
//		}
//	};
	
	INotifyChangedListener incl=new INotifyChangedListener() {
		
		@Override
		public void notifyChanged(Notification notification) {
			System.out.println(">>INCL");
			
		}
	};

	
	
	AdapterImpl adapter3 = new AdapterImpl() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			
			System.out.println("adapter3");
			
		}
			
		};
	AdapterImpl adapter2 = new AdapterImpl() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);

			int event = notification.getEventType();

			switch (event) {
			case Notification.REMOVING_ADAPTER:
				System.out.println("REMOVING_ADAPTER");
				break;
			case Notification.MOVE:
				System.out.println("Move");
				break;
			case Notification.ADD:
				System.out.println("ADD");
				break;
			case Notification.ADD_MANY:
				System.out.println("ADD MANY");
				break;
			case Notification.REMOVE:
				System.out.println("REMOve");
				break;
			case Notification.REMOVE_MANY:
				System.out.println("REMOVE MANY");
				break;
			case Notification.RESOLVE:
				System.out.println("RESOLVE");
				break;
			case Notification.UNSET:
				System.out.println("UNSET");
				break;
			case Notification.SET:
				System.out.println("SET");
				break;
			}

			System.out
					.println("ADAPTER2");
		}

		//
	};

	EContentAdapter adapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			System.out.println("noti");
			EObject notifier = (EObject) notification.getNotifier();
			int event = notification.getEventType();

			System.out.println(event);
			switch (event) {
			case Notification.REMOVING_ADAPTER:

				break;
			case Notification.MOVE:
				break; // currently no support for ordering
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
			case Notification.RESOLVE:
			case Notification.UNSET:
			case Notification.SET:
				// DO Something
				break;
			}
		}

		@Override
		protected void addAdapter(Notifier notifier) {
			super.addAdapter(notifier);

			// DO Something
		}

		@Override
		protected void removeAdapter(Notifier notifier) {
			super.removeAdapter(notifier);

			// DO Something
		}
	};
	
	
	 TransactionalEditingDomain domain;
	 EditingDomain e;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		SchoolPackage.eINSTANCE.eClass();

		ArrayList<IFile> emfFiles = getProjectsEMFFiles();

		for (IFile file : emfFiles) {
			System.out.println(file.getName());
			School school = load(file.getFullPath().toString());
			school.eAdapters().add(adapter2);
			
			EList<Course> courses = school.getCourses();
			for (Course c : courses) {
				System.out.println(c.toString());
			}
			courses.remove(0);
			
//			
//			EditingDomain e=AdapterFactoryEditingDomain.getEditingDomainFor(school);
//			
//			e.getCommandStack().addCommandStackListener(new CommandStackListener() {
//				
//				@Override
//				public void commandStackChanged(EventObject event) {
//					System.out.println("cmdsetChange");
//				}
//			});
			//EditingDomain edp = getEditingDomainFor(school);
			
			//edp.getResourceSet().eAdapters().add(adapter3);

		}
		
		

		return null;
	}

	Resource resource;

	public School load(String filePath) {
		// Initialize the model
		// WebsitePackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("website", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource

		// resSet.eAdapters().add(adapter2);

		Resource resource = resSet.getResource(URI.createURI(filePath), true);

		// resource.eAdapters().add(adapter2);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		School myWeb = (School) resource.getContents().get(0);
		return myWeb;
	}

	public ArrayList<IFile> getProjectsEMFFiles() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);

				IPath path = project.getFullPath();
				IResource folder = project.getFolder("emf");

				return Publish.getAllFile(folder);
			}
		}

		return null;
	}

	public boolean isEnabled() {

		return true;
	}

	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	static public EditingDomain getEditingDomainFor(EObject object) {
		Resource resource = object.eResource();
		if (resource != null) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) EcoreUtil
					.getExistingAdapter(resource, IEditingDomainProvider.class);
			if (editingDomainProvider != null) {
				return editingDomainProvider.getEditingDomain();
			} else {
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet instanceof IEditingDomainProvider) {
					EditingDomain editingDomain = ((IEditingDomainProvider) resourceSet)
							.getEditingDomain();
					return editingDomain;
				} else if (resourceSet != null) {
					editingDomainProvider = (IEditingDomainProvider) EcoreUtil
							.getExistingAdapter(resourceSet,
									IEditingDomainProvider.class);
					if (editingDomainProvider != null) {
						return editingDomainProvider.getEditingDomain();
					}
				}
			}
		}

		return null;
	}
}
