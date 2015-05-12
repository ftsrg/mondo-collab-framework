package org.mondo.collaboration.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashSet;


import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.SetDiff;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.patternlanguage.patternLanguage.Variable;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatchUpdateListener;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.IncQueryModelUpdateListener;
import org.eclipse.incquery.runtime.api.IncQueryModelUpdateListener.ChangeLevel;
import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.Context;
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.incquery.runtime.evm.api.RuleSpecification;
import org.eclipse.incquery.runtime.evm.api.event.EventFilter;
import org.eclipse.incquery.runtime.evm.specific.ExecutionSchemas;
import org.eclipse.incquery.runtime.evm.specific.Jobs;
import org.eclipse.incquery.runtime.evm.specific.Rules;
import org.eclipse.incquery.runtime.evm.specific.Schedulers;
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum;
import org.eclipse.incquery.runtime.evm.specific.lifecycle.DefaultActivationLifeCycle;
import org.eclipse.incquery.runtime.evm.specific.scheduler.UpdateCompleteBasedScheduler.UpdateCompleteBasedSchedulerFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class LockHandler {

	private boolean validAction;

	private ArrayList<Lock> currentLocks;
	private ArrayList<Lock> currentActivatedLocks;
	
	private ResourceSet currentResourceSet;

	private ExecutionSchema executionSchema;
	private AdvancedIncQueryEngine engine;
	private UpdateCompleteBasedSchedulerFactory schedulerFactory;

	public LockHandler() {

		validAction = true;
		currentActivatedLocks=new ArrayList<Lock>();
	}

	public void deactivateLocks() {

		if (executionSchema != null) {
			Multimap<RuleSpecification<?>, EventFilter<?>> specs = executionSchema
					.getRuleSpecificationMultimap();

			specs.keySet().forEach(spec -> executionSchema.removeRule(spec));

			Multimap<RuleSpecification<?>, EventFilter<?>> newSpecs = executionSchema
					.getRuleSpecificationMultimap();

			System.out.println("newSpeciSize:" + newSpecs.size());
			
			Marker.cancalLocksWarning();
		}
	}

	public void activateLocks2(IFile eiq, ArrayList<Lock> locks,
			IEditingDomainProvider currentEditor) {
		
		deactivateLocks();
		
		currentLocks = locks;

		EditingDomain ed = currentEditor.getEditingDomain();

		ResourceSet resourceSet = ed.getResourceSet();

		boolean engineInitNeeded = true;

		
//		if (currentResourceSet == null) {
//			currentResourceSet = resourceSet;
//			engineInitNeeded = true;
//		} else if (currentResourceSet != null) {
//			if (currentResourceSet.equals(resourceSet)) {
//				engineInitNeeded = false;
//			} else {
//				engineInitNeeded = true;
//			}
//		}

		try {

			if (engineInitNeeded == true) {
				
				System.out.println("");
				System.out.println("ENGINE INIT");
				System.out.println("");
				engine = AdvancedIncQueryEngine
						.createUnmanagedEngine(resourceSet);

				schedulerFactory = Schedulers
						.getIQEngineSchedulerFactory(engine);

				executionSchema = ExecutionSchemas
						.createIncQueryExecutionSchema(engine, schedulerFactory);
				
			
			}
			URI fileURI = URI.createFileURI(eiq.getRawLocation().toFile()
					.toString());

			currentActivatedLocks.clear();
			
			for (Lock lock : locks) {
				
				if(lock.isEnabled())
				{
					currentActivatedLocks.add(lock);
					createAndAddRuleSpecification(fileURI, lock, executionSchema, engine);
				}
			}
			
			
			
			Marker.showLocksWarning(currentActivatedLocks);

			executionSchema.startUnscheduledExecution();
			
			validAction = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		ed.getCommandStack().addCommandStackListener(
				new CommandStackListener() {

					@Override
					public void commandStackChanged(EventObject event) {
						System.out.println("commandStackListener");
						Command mostRecentCommand = ((CommandStack) event
								.getSource()).getMostRecentCommand();

						if (mostRecentCommand != null) {

							if (validAction == false) {
								System.out.println("COMMAND STACK:");
								Collection<?> objects = mostRecentCommand
										.getAffectedObjects();
								System.out.println(mostRecentCommand
										.getDescription());

							
								System.out.println("");
								System.out.println("UNDO");
								System.out.println("");

								startUndo();
								mostRecentCommand.undo();

								stopUndo();
								validAction = true;

								// MessageBox messageBox = new MessageBox(shell,
								// SWT.ICON_WARNING | SWT.OK);
								//
								// messageBox.setText("Warning");
								// messageBox.setMessage("UNDO");
								// int buttonID = messageBox.open();
								// switch(buttonID) {
								// case SWT.YES:
								//
								// case SWT.OK:
								//
								// break;
								// case SWT.CANCEL:
								//
								// }

							}
						}
					}
				});

	}

	private void createAndAddRuleSpecification(URI eiq, Lock lock,
			ExecutionSchema executionSchema, AdvancedIncQueryEngine engine) {

		String patternFQN = lock.getPattern().substring(0,
				lock.getPattern().indexOf(" "));

		final DefaultActivationLifeCycle lifecycle = DefaultActivationLifeCycle.DEFAULT;

		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification = getPatternFromFile(
				eiq, patternFQN);

		IncQueryMatcher<? extends IPatternMatch> matcher = null;
		try {
			matcher = specification.getMatcher(engine);

			engine.addModelUpdateListener(new IncQueryModelUpdateListener() {

				@Override
				public void notifyChanged(ChangeLevel changeLevel) {

					changeLevel.values();
				//	System.out.println("change");
				}

				@Override
				public ChangeLevel getLevel() {
					return ChangeLevel.MODEL;
				}
			});

		} catch (IncQueryException e) {

			e.printStackTrace();
		}

		engine.addMatchUpdateListener(matcher,
				new IMatchUpdateListener<IPatternMatch>() {

					@Override
					public void notifyAppearance(IPatternMatch match) {

						System.out.println("o");

					}

					@Override
					public void notifyDisappearance(IPatternMatch match) {
						System.out.println("a");

					}
				}, true);

		IObservableSet set = IncQueryObservables.observeMatchesAsSet(
				specification, engine);

		set.addChangeListener(new IChangeListener() {

			@Override
			public void handleChange(ChangeEvent event) {
				System.out.println("change");

			}
		});

		set.addSetChangeListener(new ISetChangeListener() {

			@Override
			public void handleSetChange(SetChangeEvent event) {
				SetDiff dif = event.diff;
				System.out.println("SETchange");
			}
		});

		Job<IPatternMatch> jobAppeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.APPEARED,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {
						System.out.println("appear:");
						handlePatternMatch(match);
						
					}
				});

		Job<IPatternMatch> jobDisappeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.DISAPPEARED,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {
						System.out.println("disappear:");
						handlePatternMatch(match);

					}
				});

		Job<IPatternMatch> jobUpdate = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.UPDATED,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {

						System.out.println("update:");
						//handlePatternMatch(match);
					}
				});

		Job<IPatternMatch> jobInactive = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.INACTIVE,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {
						System.out.println("inactive:");
						// handlePatternMatch(match);
						// validAction=false;
					}
				});

		Job<IPatternMatch> joba = Jobs
				.newRecordingJobForMatchActivation(new Job<IPatternMatch>(
						IncQueryActivationStateEnum.UPDATED) {

					@Override
					protected void execute(
							Activation<? extends IPatternMatch> activation,
							Context context) {

						String a = activation.getAtom().toString();

						System.out.println("exec");

					}

					@Override
					protected void handleError(
							Activation<? extends IPatternMatch> activation,
							Exception exception, Context context) {

					}
				});

		HashSet<Job<IPatternMatch>> jobs = Sets.newHashSet(jobUpdate,
				jobAppeared, jobDisappeared, jobInactive, joba);

		RuleSpecification<? extends IPatternMatch> ruleSpecification = Rules
				.newMatcherRuleSpecification(
						(IQuerySpecification<? extends IncQueryMatcher<IPatternMatch>>) specification,
						lifecycle, jobs);

		// EventFilter<IPatternMatch> eventFilter=new
		// EventFilter<IPatternMatch>() {
		//
		// @Override
		// public boolean isProcessable(IPatternMatch eventAtom) {
		//
		//
		//
		// return true;
		// }
		// };

		// executionSchema.addRule(ruleSpecification, eventFilter);

		executionSchema.addRule(ruleSpecification);

		

	}

	private boolean isUndoing = false;

	private void startUndo() {
		System.out.println("");
		System.out.println("START UNDO");
		isUndoing = true;
	}

	private void stopUndo() {
		System.out.println("");
		System.out.println("STOP UNDO");
		isUndoing = false;
	}

	private void handlePatternMatch(IPatternMatch eventAtom) {
		if (isUndoing == false) {
			
			boolean match = isEventAtomMatchAnyLock(eventAtom);
			System.out.println("handlePatternMatch:" + match);

			// pattern match presented and no match detected before
			if (validAction == true && match == true) {
				validAction = false;
			}

			// validAction=!match;
			// validAction=false;

		}
	}

	private boolean isEventAtomMatchAnyLock(IPatternMatch eventAtom) {
		ArrayList<Lock> locks = currentLocks;

		boolean match = false;
		for (Lock lock : locks) {
			if (lock.isMatchWithEventAtom3(eventAtom)) {
				return true;
			}
		}

		return match;
	}

	private IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> getPatternFromFile(
			URI fileURI, String patternFQN) {

		try {
			// Loading pattern resource from file
			ResourceSet resourceSet = new ResourceSetImpl();

			Pattern p = null;

			Resource patternResource = resourceSet.getResource(fileURI, true);

			// navigate to the pattern definition that we want
			if (patternResource != null) {
				if (patternResource.getErrors().size() == 0
						&& patternResource.getContents().size() >= 1) {
					EObject topElement = patternResource.getContents().get(0);
					if (topElement instanceof PatternModel) {
						for (Pattern _p : ((PatternModel) topElement)
								.getPatterns()) {

							// remove pattern package name
							String currentPatternName = CorePatternLanguageHelper
									.getFullyQualifiedName(_p);
							int pointIndex = currentPatternName
									.lastIndexOf(".");
							currentPatternName = currentPatternName
									.substring(pointIndex + 1,
											currentPatternName.length());

							if (patternFQN.equals(currentPatternName)) {
								p = _p;
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

			return specification;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<String> getPatterNames(IFile eiqFile)
	{
		String eiqFilePath=eiqFile.getFullPath().toString();
		EList<Pattern> pattenrs = Utils.getPatternsFromFile(org.eclipse.emf.common.util.URI.createFileURI(eiqFilePath));
		
		ArrayList<String> ret=new ArrayList<String>();
		
		for(Pattern pattern:pattenrs)
		{
			EList<Variable> paramenters = pattern.getParameters();
			
			String paramenterText="";
			for(Variable parameter:paramenters)
			{
				paramenterText=paramenterText+" "+parameter.getName();
			}
			
			EList<EObject> contents = pattern.eContents();
			System.out.println("OBJECTS:");
			for(EObject content:contents)
			{
				System.out.println(content);
			}
			
			
			String text=pattern.getName()+paramenterText;
			ret.add(text);
		}
		
		return ret;
		
	}
	
	public ArrayList<Lock> loadLockFromFile(IFile eiqFile,IFile bindFile)
	{
		ArrayList<Lock> locks = null;
		try{
		 FileInputStream fileIn = new FileInputStream(bindFile.getRawLocation().toFile());
         ObjectInputStream in = new ObjectInputStream(fileIn);
         
         locks = (ArrayList<Lock>) in.readObject();
         in.close();
         fileIn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return locks;
		
		
	}
	
	public void saveLockToFile(IFile bindFile,ArrayList<Lock> locks)
	{
		try{
		FileOutputStream fileOut =
		         new FileOutputStream(bindFile.getRawLocation().toFile());
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(locks);
		         out.close();
		         fileOut.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
