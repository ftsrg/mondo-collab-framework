package org.eclipse.viatra.dse.merge.ui.subversive;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.dse.merge.ui.Properties;
import org.eclipse.viatra.dse.merge.ui.interpreter.ICompareEditorInputInterpreter;

public class SvnInterpreter implements ICompareEditorInputInterpreter {

    @Override
    public boolean isInterpreterForType(Object input) {
        if (input instanceof DiffNode)
            return true;
        return false;
    }

    @Override
    public void interpretEditorInput(Object input, CompareConfiguration config) {
        DiffNode node = (DiffNode) input;
        Resource ancestor = getResource(node.getAncestor());
        config.setProperty(Properties.ANCESTOR, ancestor);
        Resource left = getResource(node.getLeft(), null);
        config.setProperty(Properties.LEFT, left);
        Resource right = getResource(node.getRight());
        config.setProperty(Properties.RIGHT, right);
        config.setProperty(Properties.READY_TO_COMPARE, null);
    }
    
    public Resource getResource(ITypedElement element) {
        return getResource(element, UUID.randomUUID() + "." + element.getType());
    }
    
    @SuppressWarnings("restriction")
    public Resource getResource(ITypedElement element, String uri) {
        if(element instanceof BufferedResourceNode) {
            BufferedResourceNode node = (BufferedResourceNode) element;
            ResourceSet rSet = new ResourceSetImpl();
            if(uri == null) {
                String location = node.getResource().getFullPath().toString();
            }
            Resource resource = rSet.createResource(URI.createURI(uri));
            try {
                resource.load(node.getContents(), Collections.emptyMap());
            } catch (IOException | CoreException e) {
                e.printStackTrace();
            }
            return resource;
        }
        return null;
    }    
}
