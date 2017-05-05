package org.mondo.collaboration.security.mpbl.client.ui.util;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

public class LockValueEditingSupport extends EditingSupport {

    public LockValueEditingSupport(TableViewer viewer) {
        super(viewer);
        this.editor = new TextCellEditor(viewer.getTable());
    }

    private final CellEditor editor;

    
    @Override
    protected CellEditor getCellEditor(Object element) {
        return editor;
    }

    @Override
    protected boolean canEdit(Object element) {
        return true;
    }

    @Override
    protected Object getValue(Object element) {
        return ((LockModel) element).value == null ? "" : ((LockModel) element).value;
    }

    @Override
    protected void setValue(Object element, Object value) {
        if(value.equals(""))
            ((LockModel) element).value = null;
        else 
            ((LockModel) element).value = value;
        getViewer().update(element, null);
    }
    
}
