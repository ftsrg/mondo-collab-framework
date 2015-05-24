package org.mondo.collaboration.client;

import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.mondo.collaboration.client.command.Download;
import org.mondo.collaboration.client.preference.Preferences;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class ServerPooler {

	private Download lockerSync;

	private static Job job;

	public ServerPooler() {

		lockerSync = new Download();

		if (job == null) {
			prepareJob();
		}

	}

	public static void start() {
		if (job != null) {
			if (Preferences.PoolingEnabled) {
				job.schedule();
			}
		}
	}

	public static void stop() {
		if (job != null) {
			if (Preferences.PoolingEnabled == false) {
				job.cancel();
			}
		}
	}

	private void prepareJob() {
		job = new Job("Check locks on server") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {

					monitor.beginTask("Check locks ", 1);

					refreshActiveProjectsLocks();

					monitor.done();
					return Status.OK_STATUS;
				} finally {
					schedule(Preferences.PoolingInterval);
				}
			}
		};

		job.setPriority(Job.SHORT);
		job.setSystem(true);
	}

	private void refreshActiveProjectsLocks() {

		try {
			List<IProject> projects = Utils.getActiveEMFGitProjects();

			for (IProject project : projects) {

				lockerSync.syncLockFiles(project);

			}

			Marker.cancelConnectionProblem();
		} catch (Exception e) {
			Marker.showConnectionProblem();
		}

	}

}
