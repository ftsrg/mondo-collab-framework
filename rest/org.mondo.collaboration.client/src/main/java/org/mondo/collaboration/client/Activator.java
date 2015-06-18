package org.mondo.collaboration.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.merge.DSEMergeManager;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.emf_compare.EMFCompareTranslator;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.ModelFactory;
import org.mondo.collaboration.wstracker.adapter.WSTrackerContentAdapter;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

import es.ikerlan.WTSpec4M.WTSpec4MPackage;
import es.ikerlan.dse.merge.wt.AddAttributeMatch;
import es.ikerlan.dse.merge.wt.AddAttributeMatcher;
import es.ikerlan.dse.merge.wt.AddReferenceMatch;
import es.ikerlan.dse.merge.wt.AddReferenceMatcher;
import es.ikerlan.dse.merge.wt.CreateMatch;
import es.ikerlan.dse.merge.wt.CreateMatcher;
import es.ikerlan.dse.merge.wt.DeleteMatch;
import es.ikerlan.dse.merge.wt.DeleteMatcher;
import es.ikerlan.dse.merge.wt.RemoveAttributeMatch;
import es.ikerlan.dse.merge.wt.RemoveAttributeMatcher;
import es.ikerlan.dse.merge.wt.RemoveReferenceMatch;
import es.ikerlan.dse.merge.wt.RemoveReferenceMatcher;
import es.ikerlan.dse.merge.wt.SetAttributeMatch;
import es.ikerlan.dse.merge.wt.SetAttributeMatcher;
import es.ikerlan.dse.merge.wt.SetReferenceMatch;
import es.ikerlan.dse.merge.wt.SetReferenceMatcher;
import es.ikerlan.dse.merge.wt.operations.AddAttributeOperation;
import es.ikerlan.dse.merge.wt.operations.AddReferenceOperation;
import es.ikerlan.dse.merge.wt.operations.CreateOperation;
import es.ikerlan.dse.merge.wt.operations.DeleteOperation;
import es.ikerlan.dse.merge.wt.operations.RemoveAttributeOperation;
import es.ikerlan.dse.merge.wt.operations.RemoveReferenceOperation;
import es.ikerlan.dse.merge.wt.operations.SetAttributeOperation;
import es.ikerlan.dse.merge.wt.operations.SetReferenceOperation;
import es.ikerlan.dse.merge.wt.util.AddAttributeQuerySpecification;
import es.ikerlan.dse.merge.wt.util.AddReferenceQuerySpecification;
import es.ikerlan.dse.merge.wt.util.CreateQuerySpecification;
import es.ikerlan.dse.merge.wt.util.DeleteQuerySpecification;
import es.ikerlan.dse.merge.wt.util.GoalPatternQuerySpecification;
import es.ikerlan.dse.merge.wt.util.Id2objectQuerySpecification;
import es.ikerlan.dse.merge.wt.util.RemoveAttributeQuerySpecification;
import es.ikerlan.dse.merge.wt.util.RemoveReferenceQuerySpecification;
import es.ikerlan.dse.merge.wt.util.SetAttributeQuerySpecification;
import es.ikerlan.dse.merge.wt.util.SetReferenceQuerySpecification;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "mondo.collab.client"; //$NON-NLS-1$
	static Client client;
	
	// The shared instance
	private static Activator plugin;

	private static String localRepoPath = "D:\\emfgit_local\\projects\\";
	
	public static User user;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		plugin = this;
		user = new User();
		client = new Client();
		{
			String url = "http://localhost:9090/services/emfgit/collaboration";

			WebResource resource = client.resource(url);
			try {
				Builder builder = resource.accept("application/json");
				String helloString = builder.get(String.class);
				System.out.println(helloString);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceChangeListener listener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				System.out.println("IResourceChangeListener");
			}
		};
		workspace.addResourceChangeListener(listener);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addPartListener(new IPartListener() {
			
			private Map<EditingDomain, WSTrackerContentAdapter> map = Maps.newHashMap();

			@Override
			public void partOpened(IWorkbenchPart part) {
				if (part instanceof IEditingDomainProvider) {
					IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
					EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
					map.put(editingDomain, new WSTrackerContentAdapter(editingDomain));
				}
			}
			
			@Override
			public void partDeactivated(IWorkbenchPart part) {
				
			}
			
			@Override
			public void partClosed(IWorkbenchPart part) {
				if (part instanceof IEditingDomainProvider) {
					IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
					EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
					map.remove(editingDomain);
				}
			}
			
			@Override
			public void partBroughtToTop(IWorkbenchPart part) {
				
			}
			
			@Override
			public void partActivated(IWorkbenchPart part) {
				
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static Client getClient() {
		return client;
	}

	public static String getLocalRepositoryPath() {
		return localRepoPath;
	}

	public static boolean modelFolderIsEmpty(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelDirPath = workspace.getRoot().getLocation().toString() + "/" + projectName + "/model/";
		File modelDir = new File(modelDirPath);
		if(modelDir.exists()) {
			String[] models = modelDir.list();
			if(models.length < 1) {
				return true;
			}
		}
		return false;
	}

	// returns the merged model of the altered model in the project
	// and the corresponding model in the local repository
	public static EObject merge(URI localChanges, URI original, URI remote) throws IncQueryException {
		Resource originalModel = new ResourceSetImpl().getResource(original, true);
		Resource remoteModel = new ResourceSetImpl().getResource(remote, true);
		
		
		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		IComparisonScope scopeOR = EMFCompare.createDefaultScope(remoteModel, originalModel);
		Comparison comparisonOR = comparator.compare(scopeOR);

		ChangeSet changeSetOR = EMFCompareTranslator.translate(comparisonOR);
		ChangeSet changeSetOL = null;
		boolean hasLocalChanges = new File(localChanges.toFileString()).exists(); 
		if(hasLocalChanges) {
			changeSetOL = (ChangeSet) new ResourceSetImpl().getResource(localChanges, true).getContents().get(0);
			EList<Change> changes = changeSetOL.getChanges();
			for (Change change : changes) {
				change.setExecutable(true);
			}
		} else {
			changeSetOL = ModelFactory.eINSTANCE.createChangeSet();
		}
		
		Collection<DSETransformationRule<?,?>>rules = Lists.<DSETransformationRule<?,?>>newArrayList(
		new DSETransformationRule<CreateMatch,CreateMatcher>(CreateQuerySpecification.instance(), new CreateOperation()),
		new DSETransformationRule<DeleteMatch,DeleteMatcher>(DeleteQuerySpecification.instance(), new DeleteOperation()),
		new DSETransformationRule<SetReferenceMatch,SetReferenceMatcher>(SetReferenceQuerySpecification.instance(), new SetReferenceOperation()),
		new DSETransformationRule<AddReferenceMatch,AddReferenceMatcher>(AddReferenceQuerySpecification.instance(), new AddReferenceOperation()),
		new DSETransformationRule<RemoveReferenceMatch,RemoveReferenceMatcher>(RemoveReferenceQuerySpecification.instance(), new RemoveReferenceOperation()),
		new DSETransformationRule<SetAttributeMatch,SetAttributeMatcher>(SetAttributeQuerySpecification.instance(), new SetAttributeOperation()),
		new DSETransformationRule<AddAttributeMatch,AddAttributeMatcher>(AddAttributeQuerySpecification.instance(), new AddAttributeOperation()),
		new DSETransformationRule<RemoveAttributeMatch,RemoveAttributeMatcher>(RemoveAttributeQuerySpecification.instance(), new RemoveAttributeOperation()));

		Collection<IQuerySpecification<?>>goals = Lists.<IQuerySpecification<?>>newArrayList(
				GoalPatternQuerySpecification.instance()
		);		

		
		DSEMergeManager manager = DSEMergeManager.create(originalModel.getContents().get(0), changeSetOL, changeSetOR);
		manager.setMetamodel(WTSpec4MPackage.eINSTANCE);
		manager.setId2EObject(Id2objectQuerySpecification.instance());
		manager.setRules(rules);
		manager.setObjectives(goals);

		Collection<Solution> solutions = manager.start();
		EObject merged = solutions.iterator().next().getScope().getOrigin();
		return merged;		
	}
	
	public static String getBranchName(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		File branchDir = new File(workspaceDirectory.getPath() + "\\" + projectName);
		if(branchDir.exists()) {
			File[] files = branchDir.listFiles();
			return files[0].getName();
		}
		return "master";
	}
	
	public static void saveFile(File fileToSave, String savePath) {
		try {
			System.out.println(savePath.substring(0, savePath.lastIndexOf("\\")));
			createOrCleanDir(savePath.substring(0, savePath.lastIndexOf("\\")));
			File f = new File(savePath);
			f.deleteOnExit();
			byte[] bytes = readContentIntoByteArray(fileToSave);
			FileOutputStream fos = new FileOutputStream(savePath);
			fos.write(bytes);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProjectNameFromUser() {
		JPanel panel = new JPanel();
		
		JLabel projectLabel = new JLabel("Project name:");
		JTextField projectField = new JTextField(10);
		panel.add(projectLabel);
		panel.add(projectField);
		projectField.setText("org.mondo.collaboration.demo.example");
		
		String[] options = new String[]{"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, panel, "Checkout project",
             JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
             null, options, options[0]);
		
		if(option == 0) { // pressing OK button
			return projectField.getText();
		}
		return null;
	}
	
	private static void createOrCleanDir(String path) {
		File dir = new File(path);
		if(dir.exists()) {
			File[] files = dir.listFiles();
		    if(files!=null) { //some JVMs return null for empty dirs
		        for(File f: files) {
		            if(f.isDirectory()) {
		            	createOrCleanDir(f.getPath());
		            } else {
//		                f.delete();
		            }
		        }
		    }
		    dir.delete();
		}
		dir.mkdirs();
	}
	
	private static byte[] readContentIntoByteArray(File file) {
		 FileInputStream fileInputStream = null;
		 byte[] bFile = new byte[(int) file.length()];
		 try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		 }
		 catch (Exception e) {
		    e.printStackTrace();
		 }
		 return bFile;
	}
}
