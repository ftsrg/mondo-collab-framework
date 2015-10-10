package org.mondo.collaboration.client.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.dnd.SwtUtil;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.client.Lock;
import org.mondo.collaboration.client.LockHandler;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class EMFGitLocksView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.mondo.collaboration.client.views.SampleView";

	private static String rowType = "row";
	private static String nameType = "name";
	private static String patternType = "pattern";
	private static String bindsType = "binds";
	private static String enableType = "enable";
	private static String type = "type";

	private static String uiCreated = "UICREATED";

	private LockHandler lockHandler;

	public EMFGitLocksView() {

		lockHandler = new LockHandler();
	}

	private Composite c;

	public void createPartControl(Composite parent) {

		ScrolledComposite sc = new ScrolledComposite(parent, SWT.H_SCROLL
				| SWT.V_SCROLL);
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		c = new Composite(sc, SWT.NONE);
		c.setLayout(new GridLayout(1, true));

		sc.setContent(c);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setMinSize(c.computeSize(SWT.DEFAULT, SWT.DEFAULT));

	}

	private void addTools() {

		Composite row = new Composite(c, SWT.NONE);

		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);

		rowLayout.marginTop = 10;
		rowLayout.marginBottom = 10;
		rowLayout.marginLeft = 5;
		rowLayout.marginRight = 5;
		rowLayout.spacing = 10;
		rowLayout.center = true;

		rowLayout.wrap = true;

		row.setLayout(rowLayout);

		Button addRow = new Button(row, SWT.PUSH);
		addRow.setText("Add Row");

		addRow.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// addRow(currentEiq, null);

				addRow();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button deleteRow = new Button(row, SWT.PUSH);
		deleteRow.setText("Delete Row(s)");

		deleteRow.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				deleteSelectedRows();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button load = new Button(row, SWT.PUSH);
		load.setText("Reload");

		load.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				IFile eiq = currentEiq;
				IFile bind = currentBind;
				addTable(eiq, bind);
				loadLockFromFile(eiq, bind);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button save = new Button(row, SWT.PUSH);
		save.setText("Save");

		save.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				saveLockToFile(currentBind);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button activate = new Button(row, SWT.PUSH);
		activate.setText("Activate");

		activate.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				lockHandler.activateLocks(currentEiq, collectLockDetails(),
						currentEditor);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button deActivate = new Button(row, SWT.PUSH);
		deActivate.setText("Dectivate");

		deActivate.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				lockHandler.deactivateLocks();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

	}

	private void deleteSelectedRows() {
		IStructuredSelection selection = (IStructuredSelection) tableViewer
				.getSelection();

		Lock[] currentLocks = (Lock[]) tableViewer.getInput();

		ArrayList<Lock> currentLocksList = new ArrayList<Lock>(
				Arrays.asList(currentLocks));

		currentLocksList.removeAll(selection.toList());

		tableViewer.setInput(currentLocksList.toArray(new Lock[currentLocksList
				.size()]));

		// tableViewer.remove(selection.toArray());
		// tableViewer.re
		tableViewer.refresh();
	}

	private void addRow() {
		Object input = tableViewer.getInput();

		Lock[] locks = ((Lock[]) input);

		ArrayList<Lock> list = new ArrayList<Lock>();

		if (locks != null) {
			List<Lock> data = Arrays.asList(locks);
			list.addAll(data);
		}
		list.add(new Lock());

		tableViewer.setInput(list.toArray(new Lock[list.size()]));

	}

	IFile currentEiq;
	IFile currentBind;
	IEditingDomainProvider currentEditor;

	public void setEditingDomainProvider(IEditingDomainProvider editor) {
		currentEditor = editor;

	}

	public void refresh(IFile eiq, IFile bind, IEditingDomainProvider editor) {
		currentBind = bind;
		currentEiq = eiq;
		currentEditor = editor;

		System.out.println("view refresh");

		for (Control control : c.getChildren()) {
			control.dispose();
		}

		addTools();

		addTable(eiq, bind);
		loadLockFromFile(eiq, bind);

		c.layout(true);

		c.setData(uiCreated, true);
	}

	public final class ExampleTableLabelProvider extends LabelProvider
			implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			Lock data = (Lock) element;
			switch (columnIndex) {
			case 0:
				return data.getName();
			case 1:
				return data.getPattern();
			case 2:
				return data.getBinds();
			case 3:
				if (data.isEnabled() == null) {
					return Boolean.toString(false);
				}
				return Boolean.toString(data.isEnabled());
			default:
				return "";
			}
		}

	}

	public enum FieldType {
		NAMEFIELD, BINDFIELD, PATTERNFIELD, ENABLEFIELD
	}

	public class ExampleEditingSupport extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private TextCellEditor textCellEditor;

		FieldType type;

		private ExampleEditingSupport(ColumnViewer viewer, String[] comboData,
				FieldType type) {
			super(viewer);

			this.type = type;

			if (type == FieldType.PATTERNFIELD) {
				cellEditor = new ComboBoxViewerCellEditor(
						(Composite) getViewer().getControl(), SWT.READ_ONLY);
				cellEditor.setLabelProvider(new LabelProvider());
				cellEditor.setContenProvider(new ArrayContentProvider());

				cellEditor.setInput(comboData);
			} else if (type == FieldType.ENABLEFIELD) {

				cellEditor = new ComboBoxViewerCellEditor(
						(Composite) getViewer().getControl(), SWT.READ_ONLY);
				cellEditor.setLabelProvider(new LabelProvider());
				cellEditor.setContenProvider(new ArrayContentProvider());

				cellEditor.setInput(new String[] { "true", "false" });
			} else {
				textCellEditor = new TextCellEditor((Composite) getViewer()
						.getControl(), SWT.SINGLE);

			}

		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			if (type == FieldType.PATTERNFIELD) {
				return cellEditor;
			} else if (type == FieldType.ENABLEFIELD) {

				return cellEditor;
			} else {
				return textCellEditor;
			}
		}

		@Override
		protected boolean canEdit(Object element) {

			return true;
		}

		@Override
		protected Object getValue(Object element) {

			if (element instanceof Lock) {
				if (this.type == FieldType.NAMEFIELD) {
					return ((Lock) element).getName();
				} else if (this.type == FieldType.PATTERNFIELD) {
					return ((Lock) element).getPattern();
				}

				else if (this.type == FieldType.BINDFIELD) {
					return ((Lock) element).getBinds();
				} else if (this.type == FieldType.ENABLEFIELD) {
					return ((Lock) element).isEnabled();

				}

			}

			return null;
		}

		@Override
		protected void setValue(Object element, Object value) {

			if (element instanceof Lock) {
				Lock lock = (Lock) element;

				if (value != null) {
					if (this.type == FieldType.NAMEFIELD) {
						lock.setName((String) value);
					}

					else if (this.type == FieldType.PATTERNFIELD) {
						lock.setPattern((String) value);
					}

					else if (this.type == FieldType.BINDFIELD) {
						lock.setBinds((String) value);
					} else if (this.type == FieldType.ENABLEFIELD) {
						if (value.equals("false")) {
							lock.setEnabled(false);
						} else if (value.equals("true")) {
							lock.setEnabled(true);
						}
					}
				}

				tableViewer.refresh();
			}

		}

	}

	TableViewer tableViewer;

	private void addTable(IFile eiq, IFile bind) {
		if (tableViewer != null) {
			tableViewer.getTable().dispose();
		}

		if (!eiq.getRawLocation().toFile().exists()) {
			return;
		}

		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(1));
		tableLayout.addColumnData(new ColumnWeightData(3));
		tableLayout.addColumnData(new ColumnWeightData(4));
		tableLayout.addColumnData(new ColumnWeightData(1));

		Table baseTable = new Table(c, SWT.BORDER | SWT.FULL_SELECTION
				| SWT.MULTI | SWT.V_SCROLL);
		baseTable.setLinesVisible(true);
		baseTable.setHeaderVisible(true);
		baseTable.setLayout(tableLayout);

		tableViewer = new TableViewer(baseTable);

		tableViewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		TableViewerColumn nameColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		nameColumn.getColumn().setText("Name");

		EditingSupport nameEditingSupport = new ExampleEditingSupport(
				nameColumn.getViewer(), null, FieldType.NAMEFIELD);
		nameColumn.setEditingSupport(nameEditingSupport);

		TableViewerColumn patternColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		patternColumn.getColumn().setText("Pattern");

		ArrayList<String> patterns = lockHandler.getPatterNames(eiq);
		EditingSupport exampleEditingSupport = new ExampleEditingSupport(
				patternColumn.getViewer(), patterns.toArray(new String[patterns
						.size()]), FieldType.PATTERNFIELD);
		patternColumn.setEditingSupport(exampleEditingSupport);

		TableViewerColumn bindsColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		bindsColumn.getColumn().setText("Binds");

		EditingSupport bindsEditingSupport = new ExampleEditingSupport(
				bindsColumn.getViewer(), null, FieldType.BINDFIELD);

		bindsColumn.setEditingSupport(bindsEditingSupport);

		TableViewerColumn enableColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		enableColumn.getColumn().setText("Enable");

		EditingSupport enableEditingSupport = new ExampleEditingSupport(
				enableColumn.getViewer(), null, FieldType.ENABLEFIELD);

		enableColumn.setEditingSupport(enableEditingSupport);

		tableViewer.setContentProvider(new ArrayContentProvider());

		tableViewer.setLabelProvider(new ExampleTableLabelProvider());

		tableViewer.refresh();

		// tableViewer.addSelectionChangedListener(new
		// ISelectionChangedListener() {
		//
		// @Override
		// public void selectionChanged(SelectionChangedEvent event) {
		// Object source = event.getSource();
		//
		// TableViewer table = ((TableViewer) source);
		// IStructuredSelection selection = (IStructuredSelection)table
		// .getSelection();
		//
		// for(Object item:selection.toList())
		// {
		// table.refresh(item);
		// }
		// table.removeSelectionChangedListener(this);
		// table.setSelection(selection, true);
		// table.addSelectionChangedListener(this);
		//
		//
		//
		// }
		// });

	}

	public boolean isUIVisible() {
		Boolean isUICreated = (Boolean) c.getData(uiCreated);

		if (isUICreated == null) {
			return false;
		} else {
			return isUICreated;
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}

	private ArrayList<Lock> collectLockDetails() {

		Object input = tableViewer.getInput();

		if (input instanceof Lock[]) {
			ArrayList<Lock> list = new ArrayList<Lock>();
			list.addAll(Arrays.asList(((Lock[]) input)));

			list = (ArrayList<Lock>) list.stream()
					.filter(l -> !l.getName().equals(""))
					.collect(Collectors.toList());
			return list;
		}

		return null;
	}

	boolean validAction = true;

	private void saveLockToFile(IFile bindFile) {
		lockHandler.saveLockToFile(bindFile, collectLockDetails());
	}

	private void loadLockFromFile(IFile eiqFile, IFile bindFile) {

		ArrayList<Lock> locks = lockHandler.loadLockFromFile(eiqFile, bindFile);

		if (locks != null) {
			tableViewer.setInput(locks.toArray(new Lock[locks.size()]));

		}

	}

}