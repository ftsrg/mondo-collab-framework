package org.mondo.collaboration.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashSet;

import org.apache.log4j.Level;
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
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
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.emf.EMFScope;
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

	private long apppearCounter=0;

	private ExecutionSchema executionSchema;
	private AdvancedIncQueryEngine engine;
	private UpdateCompleteBasedSchedulerFactory schedulerFactory;

	
	
	 EContentAdapter adapter = new EContentAdapter() {
         public void notifyChanged(Notification notification) {
                 super.notifyChanged(notification);
                 EObject notifier = (EObject) notification.getNotifier();
                 int event = notification.getEventType();

                 switch (event) {
                 case Notification.REMOVING_ADAPTER:
                         break;
                 case Notification.MOVE:
                         break; // currently no support for ordering
                 case Notification.ADD:
                	 break;
                 case Notification.ADD_MANY:
                	 break;
                 case Notification.REMOVE:
                	 System.out.println("OBJECT REMOVE");
                	 Timer.startDeleteTimer();
                	 break;
                	 
                 case Notification.REMOVE_MANY:
                	 break;
                 case Notification.RESOLVE:
                	 break;
                 case Notification.UNSET:
                	 break;
                 case Notification.SET:
                         // DO Something
                         break;
                 }
         }

         @Override
         protected void addAdapter(Notifier notifier) {
                 super.addAdapter(notifier);

                 // DO Something
         }

         @Override
         protected void removeAdapter(Notifier notifier) {
                 super.removeAdapter(notifier);

                 // DO Something
         }
 };



	public LockHandler() {

		validAction = true;
		currentActivatedLocks = new ArrayList<Lock>();
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

	public void activateLocks(IFile eiq, ArrayList<Lock> locks,
			IEditingDomainProvider currentEditor) {

		deactivateLocks();

		currentLocks = locks;

		EditingDomain ed = currentEditor.getEditingDomain();

		ResourceSet resourceSet = ed.getResourceSet();

		boolean engineInitNeeded = true;

		try {

			if (engineInitNeeded == true) {

				resourceSet.eAdapters().add(adapter); // Adapter bekötése
				
				EMFScope emfScope = new EMFScope(resourceSet);

				
				engine = AdvancedIncQueryEngine.createUnmanagedEngine(emfScope);

				
			
				schedulerFactory = Schedulers
						.getIQEngineSchedulerFactory(engine);

				executionSchema = ExecutionSchemas
						.createIncQueryExecutionSchema(engine, schedulerFactory);
				
				executionSchema.getLogger().setLevel(Level.OFF);

			}
			URI fileURI = URI.createFileURI(eiq.getRawLocation().toFile()
					.toString());

			currentActivatedLocks.clear();

			for (Lock lock : locks) {

				if (lock.isEnabled()) {
					currentActivatedLocks.add(lock);
					createAndAddRuleSpecification(fileURI, lock,
							executionSchema);
				}
			}

			Marker.showLocksWarning(currentActivatedLocks);

			validAction = true;
			
			Timer.startInitTimer();
			
			apppearCounter=0;
			executionSchema.startUnscheduledExecution();
			Timer.stopInitTimer();
			Timer.printInitElaspedTime();
			System.out.println("apperCounter="+apppearCounter);
			
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
								
								Timer.stopDeleteTimer();
								Timer.printDeleteElaspedTime();
								
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

							}
						}
					}
				});

	}

	private void createAndAddRuleSpecification(URI eiq, Lock lock,
			ExecutionSchema executionSchema) {

		String patternFQN = lock.getPattern().substring(0,
				lock.getPattern().indexOf(" "));

		final DefaultActivationLifeCycle lifecycle = DefaultActivationLifeCycle.DEFAULT;

		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> specification = getPatternFromFile(
				eiq, patternFQN);

		Job<IPatternMatch> jobAppeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.APPEARED,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {
						apppearCounter++;
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
						
					}
				});

		Job<IPatternMatch> jobInactive = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.INACTIVE,
				new IMatchProcessor<IPatternMatch>() {

					@Override
					public void process(IPatternMatch match) {
						System.out.println("inactive:");
						
					}
				});

		HashSet<Job<IPatternMatch>> jobs = Sets.newHashSet(jobUpdate,
				jobAppeared, jobDisappeared, jobInactive);

		RuleSpecification<? extends IPatternMatch> ruleSpecification = Rules
				.newMatcherRuleSpecification(
						(IQuerySpecification<? extends IncQueryMatcher<IPatternMatch>>) specification,
						lifecycle, jobs);

		executionSchema.addRule(ruleSpecification);

	}

	private boolean isUndoing = false;

	private void startUndo() {

		System.out.println("    UNDO");
		isUndoing = true;
	}

	private void stopUndo() {

		isUndoing = false;
	}

	private void handlePatternMatch(IPatternMatch eventAtom) {
		if (isUndoing == false) {
			
			boolean match=false;
			if(validAction==true)
			{
				 match = isEventAtomMatchAnyLock(eventAtom);
			}
			
			// pattern match presented and no match detected before
			if (validAction == true && match == true) {
				validAction = false;
			}

		}
	}

	private boolean isEventAtomMatchAnyLock(IPatternMatch eventAtom) {
		ArrayList<Lock> locks = currentLocks;

		boolean match = false;
		for (Lock lock : locks) {
			if (lock.isMatchWithEventAtom(eventAtom)) {
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

	public ArrayList<String> getPatterNames(IFile eiqFile) {
		String eiqFilePath = eiqFile.getFullPath().toString();
		EList<Pattern> pattenrs = Utils
				.getPatternsFromFile(org.eclipse.emf.common.util.URI
						.createFileURI(eiqFilePath));

		ArrayList<String> ret = new ArrayList<String>();

		if (pattenrs != null) {
			for (Pattern pattern : pattenrs) {
				EList<Variable> paramenters = pattern.getParameters();

				String paramenterText = "";
				for (Variable parameter : paramenters) {
					paramenterText = paramenterText + " " + parameter.getName();
				}

				EList<EObject> contents = pattern.eContents();
				System.out.println("OBJECTS:");
				for (EObject content : contents) {
					System.out.println(content);
				}

				String text = pattern.getName() + paramenterText;
				ret.add(text);
			}
		}

		return ret;

	}

	public ArrayList<Lock> loadLockFromFile(IFile eiqFile, IFile bindFile) {
		ArrayList<Lock> locks = null;
		try {
			FileInputStream fileIn = new FileInputStream(bindFile
					.getRawLocation().toFile());
			ObjectInputStream in = new ObjectInputStream(fileIn);

			locks = (ArrayList<Lock>) in.readObject();
			in.close();
			fileIn.close();
		} catch (Exception e) {
			locks = new ArrayList<Lock>();
			// e.printStackTrace();
		}

		return locks;

	}

	public void saveLockToFile(IFile bindFile, ArrayList<Lock> locks) {
		try {
			FileOutputStream fileOut = new FileOutputStream(bindFile
					.getRawLocation().toFile());
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(locks);
			out.close();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
