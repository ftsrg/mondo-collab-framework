package eu.mondo.collaboration.collabFramework;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface ICollabFrameworkEMF extends IModelCollaboration<ResourceSet> {

	ResourceSet getResourseSet(String path);
}
