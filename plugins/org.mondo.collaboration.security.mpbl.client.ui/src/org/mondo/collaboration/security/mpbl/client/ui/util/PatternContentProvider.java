package org.mondo.collaboration.security.mpbl.client.ui.util;

import java.util.Collection;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.google.common.collect.Lists;

public class PatternContentProvider implements IStructuredContentProvider {

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        
    }

    @Override
    public Object[] getElements(Object inputElement) {
        if(inputElement instanceof Pattern) {
            Pattern pattern = (Pattern) inputElement;
            Collection<LockModel> rowList = Lists.newArrayList();
            for (Variable var : pattern.getParameters()) {
                rowList.add(new LockModel(var));
            }
            return rowList.toArray();
        }
        return null;
    }
}
