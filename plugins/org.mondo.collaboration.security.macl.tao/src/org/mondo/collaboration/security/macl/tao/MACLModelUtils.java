package org.mondo.collaboration.security.macl.tao;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.mondo.collaboration.security.macl.tao.MACLValidator.MACLWrapper;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.TypeFeatureRoleInstance;

public class MACLModelUtils {

	public static void createGenModel(final EPackage rootPackage, final IPath ecorePath, final IResource genmodelResource) {

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK60_LITERAL);
		genModel.setModelDirectory(ecorePath.removeLastSegments(1).toString());
		genModel.getForeignModel().add(ecorePath.lastSegment());
		genModel.setModelName(rootPackage.getName());
		genModel.setRootExtendsInterface("");
		genModel.initialize(Collections.singleton(rootPackage));

		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genPackage.setPrefix("");

		try {
			URI genModelURI = URI.createURI(genmodelResource.getLocationURI().toString());
			final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
			genModelResource.getContents().add(genModel);
			genModelResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static MACLWrapper collectData(ClassRoleInstance classRoleInstance) {
		MACLWrapper wrapper = new MACLValidator.MACLWrapper();
		for (FeatureRoleInstance featureRoleInstance : classRoleInstance.getFeatureInstances()) {
			if(featureRoleInstance instanceof InstanceFeatureRoleInstance) {
				InstanceFeatureRoleInstance instanceFeature= (InstanceFeatureRoleInstance) featureRoleInstance;
				String value = instanceFeature.getValue();
				if(instanceFeature.getRole().getRef().get(0).getName().equals("roleIdentifier")) {
					wrapper.roleIdentifier = value;
				}
				if(instanceFeature.getRole().getRef().get(0).getName().equals("access")) {
					wrapper.access = value;
				}
				if(instanceFeature.getRole().getRef().get(0).getName().equals("permission")) {
					wrapper.permission = value;
				}
			}
			if(featureRoleInstance instanceof TypeFeatureRoleInstance) {
				TypeFeatureRoleInstance typeFeature = (TypeFeatureRoleInstance) featureRoleInstance;
				EAttribute value = typeFeature.getElement();
				if(typeFeature.getRole().getRef().get(0).getName().equals("attribute")) {
					wrapper.attribute = value;
				}
			}
		}
		for (ReferenceRoleInstance referenceRoleInstance : classRoleInstance.getReferenceInstances()) {
			EReference value = referenceRoleInstance.getElement();
			if(referenceRoleInstance.getRole().getRef().getName().equals("reference")) {
				wrapper.reference = value;
			}
		}
		return wrapper;
	}
	
}
