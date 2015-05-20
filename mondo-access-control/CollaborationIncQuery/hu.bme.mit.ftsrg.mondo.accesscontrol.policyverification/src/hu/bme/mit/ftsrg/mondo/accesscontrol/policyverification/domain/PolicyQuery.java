package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.verifier.PolicyVerifier;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.QuerySpecificationRegistry;

public class PolicyQuery extends Policy{
	private IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification;
	private Collection<? extends IPatternMatch> matches;
	private Collection<? extends IPatternMatch> originalMatches;
	private IncQueryMatcher<? extends IPatternMatch> matcher;
	private IncQueryMatcher<? extends IPatternMatch> originalMatcher;
	private Pattern pattern;
	
	public PolicyQuery(Policy policy){
		super(policy);
		this.specification = null;
		this.matches = null;
		this.originalMatches = null;
		this.matcher = null;
		this.originalMatcher = null;
		
		this.pattern = PolicyVerifier.getPattern(URI.createFileURI(getQuery().getPath()), getPattern());
	}

	public PolicyQuery(String name, File query, String pattern) {
		super(name, query, pattern);
		this.specification = null;
		this.matches = null;
		this.originalMatches = null;
		this.matcher = null;
		this.originalMatcher = null;
		
		this.pattern = PolicyVerifier.getPattern(URI.createFileURI(getQuery().getPath()), getPattern());
	}
	
	public PolicyQuery(String name, Permission permission, File query, String pattern){
		super(name, permission, query, pattern);
		this.specification = null;
		this.matches = null;
		this.originalMatches = null;
		this.matcher = null;
		this.originalMatcher = null;
		
		this.pattern = PolicyVerifier.getPattern(URI.createFileURI(getQuery().getPath()), getPattern());
	}
	
	public void setSpecification(IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification){
		this.specification = specification;
	}
	
	public IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> getSpecification(){
		return specification;
	}
		
	/**
	 * Kiértékel egy keresési mintát, hogy van-e találat. Csak az számít találatnak, ha eltér a korábbi eredménytõl és a találatok száma nagyobb mint 0.
	 * Ha nem létezik még a patternhez specifikáció, akkor létrehozza és beregisztrálja.
	 * @param resource			Aktuálisan szerkesztett modell
	 * @param initialization	Minta inicializálása, vagy futtatása
	 * @return
	 * @throws IncQueryException
	 */
	public boolean executeQueryOnPattern(Resource resource, boolean initialization) throws IncQueryException {
			
		@SuppressWarnings("deprecation")
		AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(resource);
		
		if(pattern != null){
			if(specification == null){
				SpecificationBuilder builder = new SpecificationBuilder();
				IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification = builder.getOrCreateSpecification(pattern);
				if(QuerySpecificationRegistry.getQuerySpecification(getPattern()) == null){
					QuerySpecificationRegistry.registerQuerySpecification(specification);
				}
				
				setSpecification(specification);
			}

			if(initialization){
				originalMatcher = getMatcher(engine);
				originalMatches = originalMatcher.getAllMatches();
			} else {
				matcher = getMatcher(engine);
				matches = matcher.getAllMatches();
			}
					
			//Döntés, hogy van-e találat, illetve történt-e változás a korábbi kiértékelés óta
			if(originalMatches != null || matches != null){
				//Ha nincs elõzmény
				if((originalMatches == null && matches != null) || originalMatches != null && matches == null){
					return true;
				}
				//Ha van és volt is találat, de nem azonos a találatok száma
				if(originalMatches.size() != matches.size()){
					return true;
				}
				//Ha van és volt is találat, de azonos a találatok száma, meg kell vizsgálni a találatok azonosságát
				if(originalMatches.size() == matches.size()){
					if(matches.size() == 0){
						return false;
					}

					//A korábbi és aktuális találati lista azonossáágnak ellenõrzése
					final ArrayList<IPatternMatch> compatibleCounter = new ArrayList<IPatternMatch>();
					matcher.forEachMatch(new IMatchProcessor<IPatternMatch>() {
						@Override
						public void process(IPatternMatch match) {							
							for (IPatternMatch prevMatch : originalMatches) {
								if(match.isCompatibleWith(prevMatch)){
									compatibleCounter.add(match);
								}
							}
						}
					});
					if(compatibleCounter.size() == matches.size()){
						return false;
					} else {
						return true;
					}
				}		
			}
		}
		return false;
	}
		
	public IncQueryMatcher<? extends IPatternMatch> getMatcher(AdvancedIncQueryEngine engine) throws IncQueryException{
		IncQueryMatcher<? extends IPatternMatch> matcher = null;
		if(specification != null && engine != null){
			matcher = engine.getMatcher(specification);
		}
		return matcher;
	}

}
