package org.mondo.collaboration.online.rap.widgets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.eclipse.ui.part.EditorPart;
import org.mondo.collaboration.online.core.LensSessionManager;
import org.mondo.collaboration.online.core.OnlineLeg;
import org.mondo.collaboration.online.core.StorageAccess;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;

public class MONDOTextEditor extends EditorPart {


	private boolean dirty = false;

	private String content;
	private File file;
	private Text text;

	private URI uri;
	
	public MONDOTextEditor() {
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		try {
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write(text.getText());
			printWriter.close();
			
			StorageAccess currentStorageAccess = ModelExplorer.getCurrentStorageAccess();
			String username = currentStorageAccess.getUsername();
			String password = currentStorageAccess.getPassword();
			
			String commitMessage = "";
			// add other supported extensions here for with corresponding commit messages
			if (uri.fileExtension().equals("eiq")) {
				commitMessage = "Auto message, queries file committed.";
			} else if (uri.fileExtension().equals("macl")) {
				commitMessage = "Auto message, Lock file committed.";
			} else if (uri.fileExtension().equals("mpbl")) {
				commitMessage = "Auto mesage, Lock file committed.";
			}
			
			currentStorageAccess.commit(uri.toString(), commitMessage, username, password);
			
			List<Resource> policyAndLockModels = currentStorageAccess.loadPolicyAndLockModels();
			Resource policy = policyAndLockModels.get(0);
			Resource lock = policyAndLockModels.get(1);
			
			Collection<OnlineLeg> onlineLegs = LensSessionManager.getAllOnlineLegs();
			Set<OnlineCollaborationSession> onlineSessions = new HashSet<OnlineCollaborationSession>();
			for (OnlineLeg onlineLeg : onlineLegs) {
				OnlineCollaborationSession onlineCollaborationSession = onlineLeg.getOnlineCollaborationSession();
				if(!onlineSessions.contains(onlineCollaborationSession)){
					onlineSessions.add(onlineCollaborationSession);
					onlineCollaborationSession.reinitializeWith(policy, lock);
				}
			}
			setDirty(false);
		} catch (IOException | IncQueryException e) {
			Logger.getLogger(getClass()).error(e.getMessage());
		}
	}

	@Override
	public void doSaveAs() {
		doSave(null);
	}

	@Override
	public void init(IEditorSite arg0, IEditorInput arg1) throws PartInitException {
		URIEditorInput uriInput = (URIEditorInput) arg1;

		uri = uriInput.getURI();
		file = new File(uri.path());

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			Logger.getLogger(getClass()).error(e.getMessage());
		}

		content = "";

		String line = null;
		try (BufferedReader reader = new BufferedReader(fileReader)) {
			line = reader.readLine();
			while (line != null) {

				content = content.concat(line);
				line = reader.readLine();
				
				if (line != null) {
					content = content.concat(System.lineSeparator());
				}
			}

			reader.close();
		} catch (IOException e) {
			Logger.getLogger(getClass()).error(e.getMessage());
		}

		setSite(arg0);
		setInput(arg1);
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// only the save operation is allowed
		return false;
	}

	@SuppressWarnings("serial")
	@Override
	public void createPartControl(Composite arg0) {
		text = new Text(arg0, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);

		Font boldFont = new Font(arg0.getDisplay(), new FontData("Courier", 14, SWT.None));
		text.setFont(boldFont);

		text.setText(content);

		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				setDirty(true);
			}
		});
		
		setPartName(uri.lastSegment());
		
		WorkbenchMessages.get().EditorManager_saveChangesQuestion = "There are uncommitted changes. Commit now?"; 

	}

	@Override
	public void setFocus() {
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		firePropertyChange(PROP_DIRTY);
	}

}
