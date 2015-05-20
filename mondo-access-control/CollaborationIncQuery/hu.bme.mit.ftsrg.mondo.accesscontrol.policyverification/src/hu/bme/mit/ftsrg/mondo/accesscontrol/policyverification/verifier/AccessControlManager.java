package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.verifier;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.profiles.User;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.UnionSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.QuerySpecificationRegistry;

public class AccessControlManager extends EContentAdapter {
	private Resource resource;
	private User actualUser;
	private PolicyVerifier verifier;
	private int changeStepState;

	public AccessControlManager(Resource resource, User actualUser) {
		this.changeStepState = 0;
		this.actualUser = actualUser;
		this.resource = resource;

		this.verifier = new PolicyVerifier(resource, actualUser);
		init();
	}

	public AccessControlManager(URI modelURI, User actualUser) {
		this.changeStepState = 0;
		this.actualUser = actualUser;

		this.resource = loadModel(modelURI);
		init();
	}

	public void changeStepStateInc() {
		changeStepState++;
	}

	public int getChangeState() {
		return changeStepState;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		changeStepStateInc();
	}

	/**
	 * Ecore modell betöltése
	 * 
	 * @param fileURI
	 * @return
	 */
	private Resource loadModel(URI fileURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}

	private void init() {
		this.verifier.loadResources();
		if (actualUser != null) {
			this.verifier.init(actualUser);
		}
		initAccessControllChangeTrack();
	}

	public Resource getResource() {
		return resource;
	}

	/**
	 * Modell módosítására történõ feliratkozás és annak hatására jogosultság ellenõrzés inidítása
	 */
	public void initAccessControllChangeTrack() {
		try {
			@SuppressWarnings("deprecation")
			AdvancedIncQueryEngine engine = AdvancedIncQueryEngine
					.createUnmanagedEngine(resource);
			Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> specifications = QuerySpecificationRegistry
					.getContributedQuerySpecifications();
			ArrayList<IObservableSet> observableSetList = new ArrayList<IObservableSet>();

			for (IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> s : specifications) {
				IObservableSet set = IncQueryObservables.observeMatchesAsSet(s
						.getMatcher(engine));
				observableSetList.add(set);
			}

			IObservableSet[] observabelArray = observableSetList
					.toArray(new IObservableSet[observableSetList.size()]);
			UnionSet union = new UnionSet(observabelArray);
			union.addSetChangeListener(new ISetChangeListener() {

				@Override
				public void handleSetChange(SetChangeEvent event) {
					// Állpotváltozók ellenõrzése
					if (verifier.getLastExecutionStep() == null
							|| verifier.getLastExecutionStep() != getChangeState()) {
						// Jogosultság kiértékelés elindítása
						verifier.printExecutedResult(getChangeState());
					} else {
						// Az állapotváltozók megegyeznek, ekkor nem kell semmit
						// se csinálni
					}
				}
			});
		} catch (IncQueryException e) {
			e.printStackTrace();
		}

	}
}
