package org.mondo.collaboration.offline.management.client.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class MondoPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String USER_NAME_PREFERENCE = "username";

	@Override
	public void init(IWorkbench workbench) { 
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        setPreferenceStore(store);	
        setDescription("Preference page to set MONDO preferences");
	}

	@Override
	protected void createFieldEditors() {
		 addField(new StringFieldEditor(USER_NAME_PREFERENCE, "User name:", getFieldEditorParent()));
	}

}
