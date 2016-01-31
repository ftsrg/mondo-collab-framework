package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("serial")
public class CommitMessageDialog extends TitleAreaDialog {

	private Text txtCommitMessage;
	private String commitMessage;

	public CommitMessageDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Committing changes to SVN");
		setMessage("Enter a commit message (leave blank for default the default \"Changes during onlie collaboration\"):", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(1, false);
		container.setLayout(layout);

		GridData commitMessageGridData = new GridData();
		commitMessageGridData.grabExcessHorizontalSpace = true;
		commitMessageGridData.horizontalAlignment = GridData.FILL;
		commitMessageGridData.grabExcessVerticalSpace = true;
		commitMessageGridData.verticalAlignment = GridData.FILL;

		txtCommitMessage= new Text(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		txtCommitMessage.setLayoutData(commitMessageGridData);

		return area;
	}


	@Override
	protected void okPressed() {
		commitMessage = txtCommitMessage.getText();
		super.okPressed();
	}

	public String getCommitMessage() {
		return commitMessage;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

}