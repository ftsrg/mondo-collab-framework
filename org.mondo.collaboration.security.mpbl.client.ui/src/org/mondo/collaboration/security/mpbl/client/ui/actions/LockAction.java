package org.mondo.collaboration.security.mpbl.client.ui.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.mondo.collaboration.security.mpbl.client.MondoCollaborationClient;
import org.mondo.collaboration.security.mpbl.client.ui.Activator;
import org.mondo.collaboration.security.mpbl.client.ui.views.LockViewPart;
import org.mondo.collaboration.security.mpbl.client.ui.wizards.MondoPreferencePage;

import com.google.common.collect.Lists;

public class LockAction implements IActionDelegate {

    @Override
    public void run(IAction action) {
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        try {
            processSelection(selection);
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    private void processSelection(ISelection selection) throws PartInitException {
        if (selection instanceof StructuredSelection) {
            StructuredSelection structuredSelection = (StructuredSelection) selection;
            if (structuredSelection.isEmpty())
                return;

            Object element = structuredSelection.getFirstElement();
            if (element instanceof IFile) {
                IFile file = (IFile) element;
                if (getExtensions().contains(file.getFileExtension())) {
                    processFile(file);
                }
            } else if (element instanceof IProject) {
                IProject project = (IProject) element;
                ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(),
                        new WorkbenchLabelProvider(), new WorkbenchContentProvider());

                dialog.setValidator(new ISelectionStatusValidator() {
                    
                    @Override
                    public IStatus validate(Object[] selection) {
                        if(selection.length == 0)
                            return new Status(Status.INFO, Activator.PLUGIN_ID, "Please select a File");
                        if(selection.length > 1) {
                            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Only one element is supported");
                        }
                        Object object = selection[0];
                        if(!(object instanceof IFile))
                            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Only Files are supported");
                        
                        IFile file = (IFile) object;
                        if(!getExtensions().contains(file.getFileExtension()))
                            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Unsupported extension!");
                        
                        return Status.OK_STATUS;
                    }
                });
                dialog.setInput(project);
                dialog.setAllowMultiple(false);

                if (dialog.open() == Window.OK) {
                    IFile file = (IFile) dialog.getFirstResult();
                    processFile(file);
                }
            }
        }
    }

    private void processFile(IFile file) throws PartInitException {
        openEditor(file);
        openView(file);
    }

    private void openView(IFile file) throws PartInitException {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        LockViewPart view = (LockViewPart) page.showView(LockViewPart.ID);
        
        Combo comboDefinition = view.getComboDefinition();
        
        
        Combo comboGroup = view.getComboGroup();
        comboGroup.setItems(MondoCollaborationClient.instance().getDefinitions().keySet().toArray(new String[0]));
        comboGroup.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                int index = comboGroup.getSelectionIndex();
                String item = comboGroup.getItem(index);
                PatternModel model = MondoCollaborationClient.instance().getDefinitions().get(item);
                if(model == null) {
                    comboDefinition.setItems(new String[0]);
                }
                else {
                    ArrayList<String> list = Lists.newArrayList();
                    for(Pattern pattern : model.getPatterns()) {
                        list.add(pattern.getName());
                    }
                    comboDefinition.setItems(list.toArray(new String[0]));
                }
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                int index = comboGroup.getSelectionIndex();
                String item = comboGroup.getItem(index);
                PatternModel model = MondoCollaborationClient.instance().getDefinitions().get(item);
                if(model == null) {
                    comboDefinition.setItems(new String[0]);
                }
                else {
                    ArrayList<String> list = Lists.newArrayList();
                    for(Pattern pattern : model.getPatterns()) {
                        list.add(pattern.getName());
                    }
                    comboDefinition.setItems(list.toArray(new String[0]));
                }
            }
        });
    }

    private void openEditor(IFile file) throws PartInitException {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorDescriptor editor = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
        page.openEditor(new FileEditorInput(file), editor.getId());
    }

    private List<String> getExtensions() {
        return Arrays.asList(Activator.getDefault().getPreferenceStore()
                .getString(MondoPreferencePage.MONDO_EXTENSIONS_PROPERTY).split(MondoPreferencePage.separator));
    }

    private Shell getShell() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
    }
}
