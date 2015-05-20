package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.verifier;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.PolicySetFactory;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.PolicySetQuery;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums.Permission;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums.Target;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.profiles.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternModel;

public class PolicyVerifier {

	Properties config = new Properties();
	PolicySetFactory userPolicies;
	PolicySetFactory groupPolicies;
	ArrayList<PolicySetQuery> actualUserPolicies;
	ArrayList<PolicySetQuery> actualGroupPolicies;
	User actualUser;
	URI modelURI;
	Resource resource;
	SpecificationBuilder builder;
	Integer lastExecutionStep;

	public PolicyVerifier(URI modelURI) {
		userPolicies = new PolicySetFactory(Target.USER);
		groupPolicies = new PolicySetFactory(Target.GROUP);
		this.modelURI = modelURI;
		this.resource = loadModel(modelURI);

		try {
			config.load(this.getClass().getClassLoader().getResourceAsStream("config/config.properties"));
			builder = new SpecificationBuilder();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public PolicyVerifier(Resource resource, User actualUser) {
		userPolicies = new PolicySetFactory(Target.USER);
		groupPolicies = new PolicySetFactory(Target.GROUP);
		this.resource = resource;

		try {
			config.load(this.getClass().getClassLoader().getResourceAsStream("config/config.properties"));
			builder = new SpecificationBuilder();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Resource getResource() {
		return resource;
	}
	
	public Integer getLastExecutionStep(){
		return lastExecutionStep;
	}

	/**
	 * Beállítja a rendszer aktuális felhasználóját
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.actualUser = user;
		actualUserPolicies = userPolicies.getPolicySet(actualUser.getName());
		actualGroupPolicies = groupPolicies.getPolicySet(actualUser.getRole().getRoleName());
	}

	/**
	 * Szabályzat leíró fájlok beolvasása
	 */
	public void loadResources() {
		System.out.println(config.getProperty("policyDir"));
		File policyDir = new File(config.getProperty("policyDir"));
		if (policyDir.exists() && policyDir.isDirectory()) {
			File[] listOfFiles = policyDir.listFiles();

			// JSON fájlok kiszûrése
			for (File file : listOfFiles) {
				if (file.isFile() && file.getName().endsWith(".json")) {
					userPolicies.loadDataFromJson(file.getAbsolutePath());
					groupPolicies.loadDataFromJson(file.getAbsolutePath());
				}
			}
		}
	}

	/**
	 * Ecore modell betöltése
	 * 
	 * @param fileURI
	 * @return
	 */
	protected Resource loadModel(URI fileURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}

	/**
	 * Visszatér egy beazonosított IncQuery mintával
	 * 
	 * @param fileURI
	 *            IncQuery .eiq fájl elérési útvonala
	 * @param fqn
	 *            Pattern azonosítója
	 * @return
	 */
	public static Pattern getPattern(URI fileURI, String fqn) {
		Pattern pattern = null;
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource patternResource = resourceSet.getResource(fileURI, true);

		if (patternResource != null) {
			if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
				EObject topElement = patternResource.getContents().get(0);
				if (topElement instanceof PatternModel) {
					for (Pattern _pattern : ((PatternModel) topElement).getPatterns()) {
						if (fqn.equals(CorePatternLanguageHelper.getFullyQualifiedName(_pattern))) {
							pattern = _pattern;
							break;
						}
					}
				}
			}
		}
		return pattern;
	}

	/**
	 * Beregisztálja az aktuális keresési mintákat
	 */
	public void initPatterns() {
		if (actualUser != null) {
			userPolicies.initPolicyPatterns(resource, actualUser.getName());
			groupPolicies.initPolicyPatterns(resource, actualUser.getRole().getRoleName());
		}
	}

	public void init(User user) {
		new DefaultRealm();
		setUser(user);
		initPatterns();
	}

	/**
	 * Kiértékeli a felhasználóhoz és a csoportjához tartozó szabályrendszerket.
	 * A felhasználóhoz tartozó szabályok magasabb prioritásuak.
	 * 
	 * @return
	 */
	public Permission executeAccessControl(int step) {
		if (actualUser != null) {
			lastExecutionStep = step;
			
			Permission userPermission = userPolicies.executeAccessControl(resource,
					actualUser.getName());
			Permission groupPermission = groupPolicies.executeAccessControl(resource, actualUser
					.getRole().getRoleName());

			if (userPermission != null) {
				return userPermission;
			}
			if (groupPermission != null) {
				return groupPermission;
			}
			return Permission.ALLOW;
		} else {
			System.err.println("Hiba: nincs beállítva aktuális felhasználó!");
			return Permission.DENY;
		}
	}

	public Permission printExecutedResult(int step) {
		Permission p = executeAccessControl(step);
		System.out.println("Hozzáférési jogosultság ellenõrzése");
		System.out.println("\tFelhasználó: " + actualUser.getName());
		System.out.println("\tCsoport: " + actualUser.getRole().getRoleName());
		if(p.equals(GlobalEnums.Permission.ALLOW)){
			System.out.println("Hozzáférés: Engedélyezve!");
		} else {
			System.err.println("Hozzáférés: MEGTAGADVA!");
		}
		return p;
	}
}
