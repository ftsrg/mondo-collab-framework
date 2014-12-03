package eu.mondo.collaboration.collabFramework;

import java.util.Set;

import javax.management.Query;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class ExampleCollabFramework implements ICollabFrameworkEMF {

	public ResourceSet checkoutModel(ILoginData loginData, IVersion version,
			IModel selectedModel) {
		System.out.println("Checkout the accessible model.");
		return null;
	}

	public ResourceSet checkoutModel(ILoginData loginData, IVersion version,
			IModel selectedModel, Query query) {
		System.out.println("Checkout the query selected elements.");
		return null;
	}

	public ResourceSet merge(ResourceSet rootModel, ResourceSet modelA,
			ResourceSet modelB) {
		System.out.println("Tree way merge.");
		return null;
	}

	public ResourceSet update(ILoginData loginData, IVersion version,
			String query, ResourceSet rootModel, ResourceSet modelA,
			ResourceSet modelB) {
		System.out.println("Update: chekout latest and merge");
		return null;
	}

	public int commit(ILoginData loginData, ResourceSet editedModeol,
			String commitMessage) {
		System.out.println("Commit: Save the modell changes");
		return 0;

	}

	public int lock(ILoginData loginData, ILockQuery lockQuery) {
		System.out.println("Locking model element");
		return 0;
	}

	public int unlock(ILoginData loginData, int lockID) {
		System.out.println("Delete the selected lock");
		return 0;
	}

	public Set<Integer> listLock(ILoginData loginData) {
		System.out.println("Active lock IDs.");
		return null;
	}

	public Set<String> log() {
		System.out.println("Get log");
		return null;
	}

	public int setPermission(String loginData, IPermissionRule permissionRule) {
		System.out.println("Add new permission");
		return 0;
	}

	public int removePermission(String loginData, int permissionID) {
		System.out.println("Remove permission");
		return 0;
	}

	public Set<Integer> listPermissions(String loginData) {
		System.out.println("Get permission IDs");
		return null;
	}

}
