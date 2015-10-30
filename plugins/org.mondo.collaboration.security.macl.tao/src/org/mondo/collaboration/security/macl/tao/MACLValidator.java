package org.mondo.collaboration.security.macl.tao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.mondo.editor.extensionpoints.ValidationInfo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.PatternInstance;

public class MACLValidator {

	public static class MACLWrapper {
		public String 
				roleIdentifier = null, 
				permission = null, 
				access = null,
				name = null; 
		public EStructuralFeature 
				attribute = null, 
				reference = null;
		
	}
	
	public static Collection<String> availablePermissions = Lists.newArrayList("read", "write", "read/write");
	public static Collection<String> availableAccess = Lists.newArrayList("permit", "deny");
	
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		Map<EClass, List<String>> errors = Maps.newHashMap();
		for (ClassRoleInstance classRoleInstance : pattern.getClassInstances()) {
			EClass eClass = classRoleInstance.getElement();
			MACLWrapper wrapper = MACLModelUtils.collectData(classRoleInstance);
			List<String> collectedErrors = collectErrors(wrapper, eClass);
			if(!collectedErrors.isEmpty()) {
				errors.put(eClass, collectedErrors);
			}
		}
		if(errors.isEmpty())		
			return null;
		return new ValidationInfo(errors, null);
	}

	private List<String> collectErrors(MACLWrapper wrapper, EClass eClass) {
		List<String> errors = Lists.newArrayList();
		if(wrapper.roleIdentifier == null || wrapper.roleIdentifier.isEmpty()) {
			errors.add("Role identifier is not filled");
		}
		if(!availableAccess.contains(wrapper.access)) {
			errors.add("Access attribute is not valid");
		}
		if(!availablePermissions.contains(wrapper.permission)) {
			errors.add("Permission attribute is not valid");
		}
		if(wrapper.attribute != null && wrapper.attribute.eContainer() != eClass) {
			errors.add("Attribute is not valid");
		}
		if(wrapper.reference != null && wrapper.reference.eContainer() != eClass) {
			errors.add("Reference is not valid");
		}
		return errors;
	}
	
}
