package org.mondo.collaboration.security.mpbl.client.ui.wizards;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.mondo.collaboration.security.mpbl.client.ui.Activator;

public class MondoPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    public final String MONDO_PREFIX = "org.mondo.collaboration.security.mpbl.client";
    public final String MONDO_ADDRESSES_PROPERTY = MONDO_PREFIX + ".addresses";
    public final String MONDO_EXTENSIONS_PROPERTY = MONDO_PREFIX + ".extenstions";
    public final String MONDO_TEMP_PROPERTY = MONDO_PREFIX + ".temp";
    public final String MONDO_ENABLE_PROPERTY = MONDO_PREFIX + ".enable-lock";
    public final String MONDO_DELAY_PROPERTY = MONDO_PREFIX + ".delay";

    private IPreferenceStore store;
    private StringListEditor serverAddress;
    private StringListEditor extensions;
    private DirectoryFieldEditor tempFolder;
    private BooleanFieldEditor enableLock;
    private IntegerFieldEditor lockUpdateDelay;

    /**
     * Create the preference page.
     */
    public MondoPreferencePage() {
        super(FieldEditorPreferencePage.GRID);
        store = Activator.getDefault().getPreferenceStore();
        setPreferenceStore(store);
    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {
        
        serverAddress = new StringListEditor(MONDO_ADDRESSES_PROPERTY, "Server Addresses", getFieldEditorParent());
        extensions = new StringListEditor(MONDO_EXTENSIONS_PROPERTY, "Extensions", getFieldEditorParent());
        tempFolder = new DirectoryFieldEditor(MONDO_TEMP_PROPERTY, "Temp folder", getFieldEditorParent());
        enableLock = new BooleanFieldEditor(MONDO_ENABLE_PROPERTY, "Enable live-lock", getFieldEditorParent());
        lockUpdateDelay = new IntegerFieldEditor(MONDO_DELAY_PROPERTY, "Lock update delay [ms] (0 = manually)",
                getFieldEditorParent());
        lockUpdateDelay.setValidRange(0, 100000);

        
        addField(serverAddress);
        addField(extensions);
        addField(tempFolder);
        addField(enableLock);
        addField(lockUpdateDelay);
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        store.setDefault(MONDO_ADDRESSES_PROPERTY, "http://mt.bme.hu/mondo");
        store.setDefault(MONDO_DELAY_PROPERTY, 10000);
        store.setDefault(MONDO_ENABLE_PROPERTY, true);
        store.setDefault(MONDO_EXTENSIONS_PROPERTY, "ecore;xmi;wtspec4m");
        store.setDefault(MONDO_TEMP_PROPERTY, "../temp");
    }
    
    private class StringListEditor extends ListEditor {

        public static final char separator = ';';
        
        public StringListEditor(String name, String labelText, Composite parent) {
            init(name, labelText);
            createControl(parent);
        }
        
        @Override
        protected String createList(String[] items) {
            StringBuffer path = new StringBuffer("");//$NON-NLS-1$

            for (int i = 0; i < items.length; i++) {
                path.append(items[i]);
                path.append(separator);
            }
            return path.toString();
        }

        @Override
        protected String getNewInputObject() {
            InputDialog dialog = new InputDialog(getShell(), "Add Mondo Server", "Add additional Mondo Server address", "http://", new IInputValidator() {
                
                @Override
                public String isValid(String newText) {
                    return null;
                }
            });
            if(dialog.open() == InputDialog.OK) {
                return dialog.getValue().trim();
            }
            
            return null;
        }

        @Override
        protected String[] parseString(String stringList) {
            StringTokenizer st = new StringTokenizer(stringList, separator
                    + "\n\r");//$NON-NLS-1$
            ArrayList<Object> v = new ArrayList<Object>();
            while (st.hasMoreElements()) {
                v.add(st.nextElement());
            }
            return v.toArray(new String[v.size()]);
        }
    }
    
}
