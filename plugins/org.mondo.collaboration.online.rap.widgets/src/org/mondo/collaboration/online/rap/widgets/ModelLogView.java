package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ModelLogView extends ViewPart {

	private Composite container;
	private FillLayout layout;
	
	public static final String ID = "org.mondo.collaboration.online.rap.widgets.ModelLog";
	private Text logText;
	private String lineDelimiter;
	
	public ModelLogView() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		layout = new FillLayout(SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		container.setLayout(layout);

		logText= new Text(container, SWT.NONE | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		
		logText.setEditable(false);
		
		
		
		logText.setText("Model log");
		lineDelimiter = logText.getLineDelimiter();
		
		RWT.getUISession().setAttribute("dummy", this);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	public void setLogString(){
		
	}

}
