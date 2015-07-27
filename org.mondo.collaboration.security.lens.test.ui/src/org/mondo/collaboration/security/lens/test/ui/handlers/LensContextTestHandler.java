package org.mondo.collaboration.security.lens.test.ui.handlers;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.context.MondoLensRuntimeContext;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Injector;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class LensContextTestHandler extends AbstractHandler {
    @Inject
    Injector injector;
    
    @Inject
    private IResourceSetProvider resSetProvider;

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			List<? extends IAdaptable> selectionElements = ((IStructuredSelection) selection).toList();
			
			IFile policyFile = selectionElements.get(2).getAdapter(IFile.class);
			IFile goldFile = selectionElements.get(1).getAdapter(IFile.class);
			IFile frontFile = selectionElements.get(0).getAdapter(IFile.class);
			
			Resource policyResource = parseEMFResource(policyFile);
	        Resource goldResource = parseEMFResource(goldFile);
	        Resource frontResource = parseEMFResource(frontFile);
	
	        AccessControlModel accessControlModel = (AccessControlModel) policyResource.getContents().get(0);
	        SecurityArbiter arbiter = new SecurityArbiter(
	        		accessControlModel.getPolicy(), 
	        		null, 
	        		ImmutableSet.of(goldResource.getResourceSet()), 
	        		new BaseIndexOptions());
	        
	        ModelIndexer goldIndexer = new ModelIndexer(
	        		// security container: parent folder of main resource
	        		URI.createPlatformResourceURI(goldFile./*getParent().*/getFullPath().toString(), false),
	        		goldResource.getResourceSet());
	        
	        ModelIndexer frontIndexer = new ModelIndexer(
	        		// security container: parent folder of main resource
	        		URI.createPlatformResourceURI(frontFile./*getParent().*/getFullPath().toString(), false),
	        		frontResource.getResourceSet());
	        
	        
	        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap(CorrespondenceKey.class);
	        correspondenceTables.put(CorrespondenceKey.EOBJECT, initECoreCorrespondence(goldResource, frontResource));
	        //correspondenceTables.put(CorrespondenceKey.RESOURCE, new LiveTable());
	        
			MondoLensScope scope = new MondoLensScope(arbiter, goldIndexer, frontIndexer, correspondenceTables);
			
			MondoLensRuntimeContext runtimeContext = MondoLensRuntimeContext.create(null, scope);
			
			
			for (IInputKey key : runtimeContext.getInputKeys()) {
				System.out.println();
				System.out.println("-----------------");
				System.out.println("Tuples of key: " + key.getPrettyPrintableName());
				
				final FlatTuple nullSeed = new FlatTuple(new Object[key.getArity()]);
				for (Tuple tuple : runtimeContext.enumerateTuples(key, nullSeed)) {
					System.out.println("\t" + tuple);
				}
			}
			
		
		} catch (Exception ex) {
			throw new ExecutionException("Error in test handler", ex);
		}
		
		return null;
	}

	LiveTable initECoreCorrespondence(Resource goldResource, Resource frontResource) {
		
		final Function<EObject, Object> objectToUniqueIdentifier = new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				if (input instanceof EPackage) {
					return ((EPackage) input).getNsURI();
				} 
				if (input instanceof EFactory) {
					final EFactory eFactory = (EFactory) input;
					return "Factory$" + apply(eFactory.getEPackage());
				}
				if (input instanceof EAnnotation) {
					final EAnnotation annotation = (EAnnotation) input;
					return annotation.getSource() + "@$" + apply(annotation.getEModelElement());
				}
				if (input instanceof ENamedElement) {
					final ENamedElement named = (ENamedElement) input;
					return named.getName() + "$$" + apply(named.eContainer());
				}
				return input;
			}
		};
		
		return EObjectCorrespondence.buildEObjectCorrespondenceTable(
				goldResource.getResourceSet(), 
				frontResource.getResourceSet(), 
				objectToUniqueIdentifier);
	}

	Resource parseEMFResource(IFile file) {
		ResourceSet resourceSet = resSetProvider.get(file.getProject());
        URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
        return resourceSet.getResource(fileURI, true);
	}
}
