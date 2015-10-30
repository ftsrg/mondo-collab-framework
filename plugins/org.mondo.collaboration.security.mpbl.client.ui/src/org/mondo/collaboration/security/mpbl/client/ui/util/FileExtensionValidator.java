package org.mondo.collaboration.security.mpbl.client.ui.util;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.mondo.collaboration.security.mpbl.client.ui.Activator;

public class FileExtensionValidator implements ISelectionStatusValidator {
    
    private Collection<String> extensions;

    public FileExtensionValidator(Collection<String> extensions) {
        this.extensions = extensions;
    }
    
    @Override
    public IStatus validate(Object[] selection) {
        if (selection.length == 0)
            return new Status(Status.INFO, Activator.PLUGIN_ID, "Please select a File");
        if (selection.length > 1) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Only one element is supported");
        }
        Object object = selection[0];
        if (!(object instanceof IFile))
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Only Files are supported");

        IFile file = (IFile) object;
        if (!extensions.contains(file.getFileExtension()))
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Unsupported extension!");

        return Status.OK_STATUS;
    }
}
