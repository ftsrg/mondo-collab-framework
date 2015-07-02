package org.mondo.collaboration.client;

import java.util.ArrayList;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class Marker {

	private static IMarker connectionProblem;
	private static IMarker publishProblem;

	private static ArrayList<IMarker> lockWarnings = new ArrayList<IMarker>();

	public static void showConnectionProblem() {
		try {
			if (connectionProblem == null) {
				connectionProblem = ResourcesPlugin.getWorkspace().getRoot()
						.createMarker(IMarker.PROBLEM);
				connectionProblem.setAttribute(IMarker.MESSAGE,
						"Can not connect to EMFGit server.");
				connectionProblem.setAttribute(IMarker.PRIORITY,
						IMarker.PRIORITY_HIGH);

				connectionProblem.setAttribute(IMarker.SEVERITY,
						IMarker.SEVERITY_WARNING);

				connectionProblem.setAttribute(IMarker.TRANSIENT, true);

			}
		} catch (CoreException e) {

			e.printStackTrace();
		}
	}

	public static void cancelConnectionProblem() {
		if (connectionProblem != null) {
			try {
				connectionProblem.delete();
			} catch (CoreException e) {

				e.printStackTrace();
			}
		}
	}

	public static void showPublishProblem() {
		try {
			if (publishProblem == null) {
				publishProblem = ResourcesPlugin.getWorkspace().getRoot()
						.createMarker(IMarker.PROBLEM);
				publishProblem.setAttribute(IMarker.MESSAGE,
						"Can not publish locks.");
				publishProblem.setAttribute(IMarker.PRIORITY,
						IMarker.PRIORITY_HIGH);

				publishProblem.setAttribute(IMarker.SEVERITY,
						IMarker.SEVERITY_WARNING);

				publishProblem.setAttribute(IMarker.TRANSIENT, true);

			}
		} catch (CoreException e) {

			e.printStackTrace();
		}
	}

	public static void cancelPublishProblem() {
		if (publishProblem != null) {
			try {
				publishProblem.delete();
			} catch (CoreException e) {

				e.printStackTrace();
			}
		}
	}

	public static void showLocksWarning(ArrayList<Lock> currentActivatedLocks) {

		lockWarnings.clear();
		try {
			for (Lock lock : currentActivatedLocks) {
				IMarker lockWarning = ResourcesPlugin.getWorkspace().getRoot()
						.createMarker(IMarker.PROBLEM);

				String name = lock.getName();

				lockWarning.setAttribute(IMarker.MESSAGE, "Lock " + name
						+ " activated!");
				lockWarning.setAttribute(IMarker.PRIORITY,
						IMarker.PRIORITY_HIGH);

				lockWarning.setAttribute(IMarker.SEVERITY,
						IMarker.SEVERITY_WARNING);

				lockWarning.setAttribute(IMarker.TRANSIENT, true);

				lockWarnings.add(lockWarning);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cancalLocksWarning() {
		try {
			for (IMarker lockwarning : lockWarnings) {
				lockwarning.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
