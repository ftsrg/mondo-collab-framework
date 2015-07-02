package org.mondo.collaboration.client.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class EMFGitPerspectie implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				(float) 0.26, editorArea);
		left.addView(IPageLayout.ID_NAVIGATE_ACTION_SET);

		left.addView(IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, (float) 0.26, editorArea);

		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);

		bottom.addView(EMFGitLocksView.ID);

		bottom.addView(IPageLayout.ID_PROP_SHEET);
	}

}
