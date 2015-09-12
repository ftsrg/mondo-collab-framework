package org.mondo.collaboration.security.mpbl.client.ui;

import org.eclipse.jface.resource.ImageDescriptor;

public class ImageDescriptorCollection {

    private ImageDescriptorCollection() {
        // disable ctor
    }
    
    public static ImageDescriptor MONDO_LOGO_32 = ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32.png"));
    public static ImageDescriptor MONDO_LOGO_64 = ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/64.png"));
    public static ImageDescriptor MONDO_LOGO_ORIGINAL = ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/base_icon.png"));

}
