package org.mondo.collaboration.security.mpbl.client.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.security.mpbl.client.MondoCollaborationClient;
import org.mondo.collaboration.security.mpbl.client.ui.Activator;
import org.mondo.collaboration.security.mpbl.client.ui.wizards.MondoPublishLockDefinitionWizard;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDTO;

public class PublishLockDefinitionHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        MondoPublishLockDefinitionWizard wizard = new MondoPublishLockDefinitionWizard();
        WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
        
        dialog.setHelpAvailable(false);
        
        if (dialog.open() == WizardDialog.OK) {
            final String username = wizard.getUsername();
            final String password = wizard.getPassword();
            final PatternModel model = wizard.getModel();
            final String front = wizard.getFrontRepository();
            final String desc = wizard.getDesc();
            
            Job job = new Job("Publishing Lock Definition") {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    ResponseLockDTO response = MondoCollaborationClient.instance().publishLockDefinition(model, username, password, desc, front);
                    if(response.isSuccess())
                        return Status.OK_STATUS;
                    return new Status(Status.ERROR, Activator.PLUGIN_ID, response.getMessage());
                }                
            };
            job.schedule();
        }
        
        return null;
    }

}
