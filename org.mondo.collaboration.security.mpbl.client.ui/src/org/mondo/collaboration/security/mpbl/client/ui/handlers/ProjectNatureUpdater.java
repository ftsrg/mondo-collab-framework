package org.mondo.collaboration.security.mpbl.client.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ProjectNatureUpdater extends AbstractHandler {

    public static final String MONDO_NATURE_ID = "org.mondo.collaboration.security.mpbl.client";
    private static final QualifiedName KEY = new QualifiedName("org.mondo.collaboration.security.mpbl", "client");
    
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);

        if (currentSelection instanceof IStructuredSelection) {
            for (Object element : ((IStructuredSelection) currentSelection).toList()) {
                IProject project = null;
                if (element instanceof IProject) {
                    project = (IProject) element;
                } else if (element instanceof IAdaptable) {
                    project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
                }
                if (project != null) {
                    final NatureUpdaterJob job = new NatureUpdaterJob(project);
                    job.schedule();
                }
            }
        }
        return null;
    }

    private class NatureUpdaterJob extends Job {

        private IProject project;

        public NatureUpdaterJob(IProject project) {
            super(String.format("Updating project %s", project.getName()));
            this.project = project;
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            try {
                String property = project.getPersistentProperty(KEY);
                if(property == null || property.equals("false"))
                    project.setPersistentProperty(KEY, "true");
                else
                    project.setPersistentProperty(KEY, "false");
            } catch (CoreException e) {
                e.printStackTrace();
            }
            return Status.OK_STATUS;
        }

    }
}
