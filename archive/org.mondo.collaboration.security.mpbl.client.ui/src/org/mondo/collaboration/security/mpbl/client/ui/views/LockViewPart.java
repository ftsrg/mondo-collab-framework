package org.mondo.collaboration.security.mpbl.client.ui.views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.ViewPart;

import swing2swt.layout.BorderLayout;

public class LockViewPart extends ViewPart {

    public static final String ID = "org.mondo.collaboration.security.mpbl.client.ui.views.LockViewPart"; //$NON-NLS-1$
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private TableViewer table;
    private Button btnLock;
    private Button btnUnlock;
    private Combo comboGroup;
    private Combo comboDefinition;
    private Label lblFileLabel;
    private TableViewerColumn tblclmnPatternVariables;
    private TableViewerColumn tblclmnValues;

    public LockViewPart() {
    }

    /**
     * Create contents of the view part.
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {
        Composite container = toolkit.createComposite(parent, SWT.NONE);
        toolkit.paintBordersFor(container);
        container.setLayout(new BorderLayout(0, 0));
        {
            Composite composite = new Composite(container, SWT.NONE);
            composite.setLayoutData(BorderLayout.NORTH);
            toolkit.adapt(composite);
            toolkit.paintBordersFor(composite);
            composite.setLayout(new FillLayout(SWT.HORIZONTAL));
            {
                Section sctnSelectedModel = toolkit.createSection(composite, Section.TWISTIE | Section.TITLE_BAR);
                toolkit.paintBordersFor(sctnSelectedModel);
                sctnSelectedModel.setText("Selected Model");
                sctnSelectedModel.setExpanded(true);
                {
                    Composite composite_1 = new Composite(sctnSelectedModel, SWT.NONE);
                    toolkit.adapt(composite_1);
                    toolkit.paintBordersFor(composite_1);
                    sctnSelectedModel.setClient(composite_1);
                    composite_1.setLayout(new FillLayout(SWT.VERTICAL));
                    {
                        lblFileLabel = toolkit.createLabel(composite_1, "File Label", SWT.NONE);
                    }
                    {
                        Composite composite_2 = toolkit.createComposite(composite_1, SWT.NONE);
                        toolkit.paintBordersFor(composite_2);
                        composite_2.setLayout(new RowLayout(SWT.HORIZONTAL));
                        {
                            Button btnOpenDialog = new Button(composite_2, SWT.NONE);
                            toolkit.adapt(btnOpenDialog, true, true);
                            btnOpenDialog.setText("Open Dialog");
                        }
                    }
                }
            }
            {
                Section sctnLockDefGroup = toolkit.createSection(composite, Section.TWISTIE | Section.TITLE_BAR);
                toolkit.paintBordersFor(sctnLockDefGroup);
                sctnLockDefGroup.setText("Selected Lock Definition");
                sctnLockDefGroup.setExpanded(true);
                {
                    Composite composite_1 = toolkit.createComposite(sctnLockDefGroup, SWT.NONE);
                    toolkit.paintBordersFor(composite_1);
                    sctnLockDefGroup.setClient(composite_1);
                    composite_1.setLayout(new FillLayout(SWT.VERTICAL));
                    {
                        comboGroup = new Combo(composite_1, SWT.NONE);
                        toolkit.adapt(comboGroup);
                        toolkit.paintBordersFor(comboGroup);
                    }
                    {
                        comboDefinition = new Combo(composite_1, SWT.NONE);
                        toolkit.adapt(comboDefinition);
                        toolkit.paintBordersFor(comboDefinition);
                    }
                }
            }
        }
        {
            Section sctnLockProperties = toolkit.createSection(container, Section.TWISTIE | Section.TITLE_BAR);
            sctnLockProperties.setLayoutData(BorderLayout.CENTER);
            toolkit.paintBordersFor(sctnLockProperties);
            sctnLockProperties.setText("Lock properties");
            sctnLockProperties.setExpanded(true);
            {
                Composite composite = new Composite(sctnLockProperties, SWT.NONE);
                toolkit.adapt(composite);
                toolkit.paintBordersFor(composite);
                sctnLockProperties.setClient(composite);
                composite.setLayout(new FillLayout(SWT.HORIZONTAL));
                
                table = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
                toolkit.adapt(table.getTable());
                toolkit.paintBordersFor(table.getTable());
                table.getTable().setHeaderVisible(true);
                table.getTable().setLinesVisible(true);
                
                tblclmnPatternVariables = new TableViewerColumn(table, SWT.NONE);
                tblclmnPatternVariables.getColumn().setWidth(120);
                tblclmnPatternVariables.getColumn().setText("Pattern Variables");
                
                tblclmnValues = new TableViewerColumn(table, SWT.NONE);
                tblclmnValues.getColumn().setWidth(100);
                tblclmnValues.getColumn().setText("Values");
            }
        }
        {
            Composite composite = new Composite(container, SWT.NONE);
            composite.setLayoutData(BorderLayout.SOUTH);
            toolkit.adapt(composite);
            toolkit.paintBordersFor(composite);
            composite.setLayout(new RowLayout(SWT.HORIZONTAL));
            {
                btnLock = toolkit.createButton(composite, "Lock", SWT.NONE);
            }
            {
                btnUnlock = toolkit.createButton(composite, "Unlock", SWT.NONE);
            }
        }
        createActions();
        initializeToolBar();
        initializeMenu();
        initializeFields();
    }

    private void initializeFields() {
        
    }

    public void dispose() {
        toolkit.dispose();
        super.dispose();
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        // Create the actions
    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager manager = getViewSite().getActionBars().getMenuManager();
    }

    @Override
    public void setFocus() {
        // Set the focus
    }
    
    public Button getBtnLock() {
        return btnLock;
    }
    
    public Button getBtnUnlock() {
        return btnUnlock;
    }
    
    public Combo getComboDefinition() {
        return comboDefinition;
    }
    
    public Combo getComboGroup() {
        return comboGroup;
    }
    
    public TableViewer getTable() {
        return table;
    }
    
    public Label getLblFileLabel() {
        return lblFileLabel;
    }
    
    public TableViewerColumn getTblclmnValues() {
        return tblclmnValues;
    }
    
    public TableViewerColumn getTblclmnPatternVariables() {
        return tblclmnPatternVariables;
    }
}
