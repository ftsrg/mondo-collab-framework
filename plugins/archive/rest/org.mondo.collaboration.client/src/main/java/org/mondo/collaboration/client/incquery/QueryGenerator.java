package org.mondo.collaboration.client.incquery;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.QuerySpecificationRegistry;

public class QueryGenerator {

	String modelFilePath;
	String eiqFilePath;

	String patternFQN;

	public QueryGenerator() {

	}

	public void setEiqFilePath(String eiqFilePath) {
		this.eiqFilePath = eiqFilePath;
	}

	public void setModelFilePath(String modelFilePath) {
		this.modelFilePath = modelFilePath;
	}

	public void setPatternFQN(String patternFQN) {
		this.patternFQN = patternFQN;
	}
	
	public void run()
	{
		executeQuery(URI.createFileURI(modelFilePath), 
				URI.createFileURI(eiqFilePath), patternFQN);
	}
	
	
	public void evmrun()
	{
		
		
		
	}
	

	public String executeQuery(URI modelURI, URI fileURI,
			String patternFQN) {
		final StringBuilder results = new StringBuilder();
		Resource resource = loadModel(modelURI);
		if (resource != null) {
			try {
				// get all matches of the pattern
				// create an *unmanaged* engine to ensure that noone else is
				// going
				// to use our engine
				AdvancedIncQueryEngine engine = AdvancedIncQueryEngine
						.createUnmanagedEngine(resource);
				// instantiate a pattern matcher through the registry, by only
				// knowing its FQN
				// assuming that there is a pattern definition registered
				// matching 'patternFQN'

				Pattern p = null;

				// Initializing Xtext-based resource parser
				new EMFPatternLanguageStandaloneSetup()
						.createInjectorAndDoEMFRegistration();

				// Loading pattern resource from file
				ResourceSet resourceSet = new ResourceSetImpl();

				Resource patternResource = resourceSet.getResource(fileURI,
						true);

				// navigate to the pattern definition that we want
				if (patternResource != null) {
					if (patternResource.getErrors().size() == 0
							&& patternResource.getContents().size() >= 1) {
						EObject topElement = patternResource.getContents().get(
								0);
						if (topElement instanceof PatternModel) {
							for (Pattern _p : ((PatternModel) topElement)
									.getPatterns()) {
								if (patternFQN.equals(CorePatternLanguageHelper
										.getFullyQualifiedName(_p))) {
									p = _p;
									System.out.println(CorePatternLanguageHelper
										.getFullyQualifiedName(_p));
									break;
								}
							}
						}
					}
				}
				if (p == null) {
					throw new RuntimeException(String.format(
							"Pattern %s not found", patternFQN));
				}
				SpecificationBuilder builder = new SpecificationBuilder();
				
				
			
				
				final IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification = builder
						.getOrCreateSpecification(p);
				
				
				
				QuerySpecificationRegistry
						.registerQuerySpecification(specification);

				// Initialize matcher from specification
				IncQueryMatcher<? extends IPatternMatch> matcher = engine
						.getMatcher(specification);

				if (matcher != null) {
					Collection<? extends IPatternMatch> matches = matcher
							.getAllMatches();
					
				
					prettyPrintMatches(results, matches);
					
				}
				
				System.out.println("QueryRes:");
				System.out.println(results.toString());

				// wipe the engine
				engine.wipe();
				// after a wipe, new patterns can be rebuilt with much less
				// overhead than
				// complete traversal (as the base indexes will be kept)

				// completely dispose of the engine once's it is not needed
				engine.dispose();
				resource.unload();
			} catch (IncQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		} else {
			results.append("Resource not found");
		}
		return results.toString();
	}

	protected Resource loadModel(String modelPath) {
		URI fileURI = URI.createFileURI(modelPath);
		return loadModel(fileURI);
	}

	protected Resource loadModel(URI fileURI) {
		// Loads the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}

	protected void prettyPrintMatches(StringBuilder results,
			Collection<? extends IPatternMatch> matches) {
		for (IPatternMatch match : matches) {
			results.append(match.prettyPrint() + "; ");
		}
		if (matches.size() == 0) {
			results.append("Empty match set");
		}
		results.append("\n");
	}

}
