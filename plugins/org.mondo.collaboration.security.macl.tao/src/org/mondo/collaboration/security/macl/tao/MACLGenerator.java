package org.mondo.collaboration.security.macl.tao;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.ClassType;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.EClassifierConstraint;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.EMFPatternLanguageFactory;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PackageImport;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.ReferenceType;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Annotation;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.AnnotationParameter;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PathExpressionConstraint;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PathExpressionHead;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PathExpressionTail;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternBody;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternLanguageFactory;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.StringValue;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.VariableReference;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.VariableValue;
import org.eclipse.viatra.query.tooling.core.project.ProjectGenerationHelper;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.mondo.collaboration.security.incquery.IncQuerySecurity;
import org.mondo.collaboration.security.macl.tao.MACLValidator.MACLWrapper;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.PatternInstance;

public class MACLGenerator extends AbstractHandler {
	
	private final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	public static String[] natureIds = new String[] {JavaCore.NATURE_ID};
	public static List<String> dependencies = ImmutableList.<String> of(
			Activator.PLUGIN_ID, IncQuerySecurity.PLUGIN_ID,
			"org.mondo.collaboration.security.macl.xtext",
			"org.mondo.collaboration.security.macl.xtext.ui");
	
	@Inject
    private IResourceSetProvider resourceSetProvider;

    public boolean generate(EPackage ePack, PatternInstance pattern, IPath diagramPath, IProgressMonitor monitor) throws IOException, CoreException {
		IResource diagramResource = root.getFileForLocation(diagramPath);
		IProject modelingProject = diagramResource.getProject();		
		
		//Check *.ecore
		IPath ecorePath = diagramPath.removeFileExtension().addFileExtension("ecore");
		IResource ecoreResource = root.getFileForLocation(ecorePath);
		if(!ecoreResource.exists()) {
			ModelUtils.saveModel(ecoreResource.getLocationURI().toString(), ePack);
			modelingProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
		
		//Check *.genmodel
		IPath genmodelPath = diagramPath.removeFileExtension().addFileExtension("genmodel");
		IResource genmodelResource = root.getFileForLocation(genmodelPath);
		if(!genmodelResource.exists()) {
			MACLModelUtils.createGenModel(ePack, ecorePath, genmodelResource);
			modelingProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
		
		//Check MACL project
		IProject macProject = root.getProject(modelingProject.getName() + ".macp");
		if (!macProject.exists()) {
			createMACLPluginProject(macProject, monitor);
		}
		
		//Check *.eiqgen
		IFile eiqGenmodel = macProject.getFile("generator.eiqgen");
		if(!eiqGenmodel.exists()) {
			String genmodelLocation = genmodelResource.getProject().getName() + "/" + genmodelResource.getProjectRelativePath().toString();
			URI platformURI = URI.createPlatformResourceURI(genmodelLocation, true);			
			eiqGenmodel.create(new ByteArrayInputStream( ("genmodel \"" + platformURI.toString()+ "\"").getBytes() ), true, monitor);
		}
		
		//Check pattern file
		String packageName = macProject.getName().replace('.', '/') + "/patterns";
		IPath eiqPath = macProject.getFolder("src").getFullPath().append(packageName + "/" + "queries.eiq");
        IFile eiqFile = root.getFile(eiqPath);
		if(!eiqFile.exists()) {
			createEiqFile(macProject, eiqPath, ImmutableList.<EPackage>of(ePack));
		}
		
		//Create patterns
		createPatterns(pattern, eiqPath, macProject);
		
		return true;
	}
	
	private void createPatterns(PatternInstance patternInstance, IPath eiqPath, IProject macProject) throws IOException {
		ResourceSet resourceSet = resourceSetProvider.get(macProject);
		String fullPath = eiqPath.toString();
		URI fileURI = URI.createPlatformResourceURI(fullPath, false);        
		Resource resource = resourceSet.getResource(fileURI, true);
		PatternModel pm = (PatternModel) resource.getContents().get(0);
		
		String patternName = "generated" + patternInstance.getIdent().trim().replace(" ", "");
		for (Pattern p : pm.getPatterns()) {
			if(p.getName().equals(patternName))
				return;
		}
		ClassRoleInstance classRoleInstance = patternInstance.getClassInstances().get(0);
		MACLWrapper wrapper = MACLModelUtils.collectData(classRoleInstance);
					
        Pattern pattern = PatternLanguageFactory.eINSTANCE.createPattern();
        pattern.setName(patternName);
        PatternBody body = PatternLanguageFactory.eINSTANCE.createPatternBody();
        
        Variable src = addSourceVariable(classRoleInstance, pattern, body);
        if(wrapper.reference != null) {
        	addValueVariable(classRoleInstance, pattern, body, src, wrapper.reference, "trg");
		}
        if(wrapper.attribute != null) {
            addValueVariable(classRoleInstance, pattern, body, src, wrapper.attribute, "value");
	    }   
        
        if(wrapper.reference == null && wrapper.attribute == null) {
        	addObjectAnnotation(pattern, src);
        }
        if(wrapper.reference != null) {
        	addReferenceAnnotation(pattern, wrapper.reference);
        }
        if(wrapper.attribute != null) {
        	addAttributeAnnotation(pattern, wrapper.attribute);
        }
        
        pattern.getBodies().add(body);
        pm.getPatterns().add(pattern);
		
        resource.save(Collections.emptyMap());
	}

	private void addAttributeAnnotation(Pattern pattern, EStructuralFeature attribute) {
		Annotation annotation = PatternLanguageFactory.eINSTANCE.createAnnotation();
		annotation.setName("SecurityAttribute");
		
		AnnotationParameter feature = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		feature.setName("feature");
		StringValue featureValue = PatternLanguageFactory.eINSTANCE.createStringValue();
		featureValue.setValue(attribute.getName());
		feature.setValue(featureValue);
		
		AnnotationParameter source = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		source.setName("src");
		VariableReference srcRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		srcRef.setVariable(pattern.getParameters().get(0));
		srcRef.setVar("src");
		VariableValue sourceValue = PatternLanguageFactory.eINSTANCE.createVariableValue();
		sourceValue.setValue(srcRef);
		source.setValue(sourceValue);
		
		annotation.getParameters().add(feature);
		annotation.getParameters().add(source);
		pattern.getAnnotations().add(annotation);
	}
	
	private void addReferenceAnnotation(Pattern pattern, EStructuralFeature reference) {
		Annotation annotation = PatternLanguageFactory.eINSTANCE.createAnnotation();
		annotation.setName("SecurityReference");
		
		AnnotationParameter feature = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		feature.setName("feature");
		StringValue featureValue = PatternLanguageFactory.eINSTANCE.createStringValue();
		featureValue.setValue(reference.getName());
		feature.setValue(featureValue);
		
		AnnotationParameter source = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		source.setName("src");
		VariableReference srcRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		srcRef.setVariable(pattern.getParameters().get(0));
		srcRef.setVar("src");
		VariableValue sourceValue = PatternLanguageFactory.eINSTANCE.createVariableValue();
		sourceValue.setValue(srcRef);
		source.setValue(sourceValue);
		
		AnnotationParameter target = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		target.setName("trg");
		VariableReference trgRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		trgRef.setVariable(pattern.getParameters().get(1));
		trgRef.setVar("trg");
		VariableValue targetValue = PatternLanguageFactory.eINSTANCE.createVariableValue();
		targetValue.setValue(trgRef);
		target.setValue(targetValue);
		
		annotation.getParameters().add(feature);
		annotation.getParameters().add(source);
		annotation.getParameters().add(target);
		pattern.getAnnotations().add(annotation);
	}
	
	private void addObjectAnnotation(Pattern pattern, Variable src) {
		Annotation annotation = PatternLanguageFactory.eINSTANCE.createAnnotation();
		annotation.setName("SecurityObject");
		AnnotationParameter obj = PatternLanguageFactory.eINSTANCE.createAnnotationParameter();
		obj.setName("object");
		
		VariableReference srcRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		srcRef.setVariable(src);
		srcRef.setVar("src");
		VariableValue variableValue = PatternLanguageFactory.eINSTANCE.createVariableValue();
		variableValue.setValue(srcRef);
		
		obj.setValue(variableValue);
		
		annotation.getParameters().add(obj);
		pattern.getAnnotations().add(annotation);
	}

	private void addValueVariable(ClassRoleInstance classRoleInstance, Pattern pattern,
			PatternBody body, Variable src, EStructuralFeature feature, String varName) {
		Variable value = PatternLanguageFactory.eINSTANCE.createVariable();
		value.setName(varName);
		
		VariableReference srcRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		srcRef.setVariable(src);
		srcRef.setVar("src");
		VariableReference valueRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
		valueRef.setVariable(value);
		valueRef.setVar(varName);
		
		ClassType srcType = EMFPatternLanguageFactory.eINSTANCE.createClassType();
		srcType.setClassname(classRoleInstance.getElement());
		
		PathExpressionHead expressionHead = PatternLanguageFactory.eINSTANCE.createPathExpressionHead();
		PathExpressionTail expressionTail = PatternLanguageFactory.eINSTANCE.createPathExpressionTail();
		PathExpressionConstraint pathExpressionConstraint = PatternLanguageFactory.eINSTANCE.createPathExpressionConstraint();
		
		VariableValue variableValue = PatternLanguageFactory.eINSTANCE.createVariableValue();
		variableValue.setValue(valueRef);
		
		expressionHead.setSrc(srcRef);
		expressionHead.setDst(variableValue);
		expressionHead.setType(srcType);
		expressionHead.setTail(expressionTail);
		
		ReferenceType refType = EMFPatternLanguageFactory.eINSTANCE.createReferenceType();
		refType.setRefname(feature);
		
		expressionTail.setType(refType);
		pathExpressionConstraint.setHead(expressionHead);
		body.getConstraints().add(pathExpressionConstraint);
		
		pattern.getParameters().add(value);
	}

	private Variable addSourceVariable(ClassRoleInstance classRoleInstance, Pattern pattern, PatternBody body) {
		Variable src;
		{
	        src = PatternLanguageFactory.eINSTANCE.createVariable();
	        ClassType srcType = EMFPatternLanguageFactory.eINSTANCE.createClassType();
	        srcType.setClassname(classRoleInstance.getElement());
	        src.setName("src");
	        src.setType(srcType);
	        
	        VariableReference srcRef = PatternLanguageFactory.eINSTANCE.createVariableReference();
	        srcRef.setVariable(src);
	        srcRef.setVar("src");
	        
	        EClassifierConstraint classifierConstraint = EMFPatternLanguageFactory.eINSTANCE.createEClassifierConstraint();
	        classifierConstraint.setType(srcType);
	        classifierConstraint.setVar(srcRef);
	        
	        body.getConstraints().add(classifierConstraint);
	        pattern.getParameters().add(src);
	    }
		return src;
	}

	private void createMACLPluginProject(final IProject macProject, IProgressMonitor monitor) throws CoreException {
		final IWorkspaceRunnable command = new IWorkspaceRunnable(){

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				 final IProjectDescription desc = macProject.getWorkspace().newProjectDescription(macProject.getName());
				 ProjectGenerationHelper.createProject(desc, macProject, dependencies, monitor);
			}			
		};
		
		command.run(monitor);
	}
	
	private void createEiqFile(final IProject macProject, IPath eiqPath, List<EPackage> imports) throws IOException, CoreException {
        IResource containerResource = macProject.getFolder("src");
        ResourceSet resourceSet = resourceSetProvider.get(macProject);

        String fullPath = eiqPath.toString();
        URI fileURI = URI.createPlatformResourceURI(fullPath, false);
        Resource resource = resourceSet.createResource(fileURI);

        PatternModel pm = EMFPatternLanguageFactory.eINSTANCE.createPatternModel();

        // Setting package name
        String packageName = macProject.getName() + ".patterns";
		pm.setPackageName(packageName);
        pm.setImportPackages(EMFPatternLanguageFactory.eINSTANCE.createXImportSection());
        
        // Setting imports
        for (EPackage importedPackage : imports) {
            PackageImport importDecl = EMFPatternLanguageFactory.eINSTANCE.createPackageImport();
            importDecl.setEPackage(importedPackage);
            pm.getImportPackages().getPackageImport().add(importDecl);
        }
        resource.getContents().add(pm);
        resource.save(Collections.EMPTY_MAP);
        containerResource.refreshLocal(0, new NullProgressMonitor());
    }

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String contextId = event.getParameter(MACLCommandContext.ID);
		final MACLCommandContext context = Activator.get(contextId);			
		
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				try {
					generate(context.ePack, context.pattern, context.iPath, monitor);
				} catch (IOException e) {
					e.printStackTrace();
					monitor.setCanceled(true);
				}
			}
		};
		
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		try {
			dialog.run(true, true, operation);
			if(dialog.getProgressMonitor().isCanceled())
				return false;
		} catch (InvocationTargetException | InterruptedException e) {
			return false;
		}
		return true;
	}
	
}
