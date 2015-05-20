package wtspec;

import WTSpec.SystemOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import wtspec.SystemOutputMatch;
import wtspec.util.SystemOutputQuerySpecification;

/**
 * Generated pattern matcher API of the wtspec.systemOutput pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SystemOutputMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern systemOutput(O : SystemOutput, n: EString) {
 * 	WT.itsOutputs(_WT, O);
 * 	SystemOutput.sysId(O,n);
 * }
 * </pre></code>
 * 
 * @see SystemOutputMatch
 * @see SystemOutputProcessor
 * @see SystemOutputQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SystemOutputMatcher extends BaseMatcher<SystemOutputMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SystemOutputMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SystemOutputMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SystemOutputMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_O = 0;
  
  private final static int POSITION_N = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SystemOutputMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public SystemOutputMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public SystemOutputMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return matches represented as a SystemOutputMatch object.
   * 
   */
  public Collection<SystemOutputMatch> getAllMatches(final SystemOutput pO, final String pN) {
    return rawGetAllMatches(new Object[]{pO, pN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return a match represented as a SystemOutputMatch object, or null if no match is found.
   * 
   */
  public SystemOutputMatch getOneArbitraryMatch(final SystemOutput pO, final String pN) {
    return rawGetOneArbitraryMatch(new Object[]{pO, pN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemOutput pO, final String pN) {
    return rawHasMatch(new Object[]{pO, pN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemOutput pO, final String pN) {
    return rawCountMatches(new Object[]{pO, pN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemOutput pO, final String pN, final IMatchProcessor<? super SystemOutputMatch> processor) {
    rawForEachMatch(new Object[]{pO, pN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemOutput pO, final String pN, final IMatchProcessor<? super SystemOutputMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pO, pN}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SystemOutputMatch newMatch(final SystemOutput pO, final String pN) {
    return SystemOutputMatch.newMatch(pO, pN);
  }
  
  /**
   * Retrieve the set of values that occur in matches for O.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SystemOutput> rawAccumulateAllValuesOfO(final Object[] parameters) {
    Set<SystemOutput> results = new HashSet<SystemOutput>();
    rawAccumulateAllValues(POSITION_O, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for O.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemOutput> getAllValuesOfO() {
    return rawAccumulateAllValuesOfO(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for O.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemOutput> getAllValuesOfO(final SystemOutputMatch partialMatch) {
    return rawAccumulateAllValuesOfO(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for O.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemOutput> getAllValuesOfO(final String pN) {
    return rawAccumulateAllValuesOfO(new Object[]{
    null, 
    pN
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfn(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_N, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfn() {
    return rawAccumulateAllValuesOfn(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfn(final SystemOutputMatch partialMatch) {
    return rawAccumulateAllValuesOfn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfn(final SystemOutput pO) {
    return rawAccumulateAllValuesOfn(new Object[]{
    pO, 
    null
    });
  }
  
  @Override
  protected SystemOutputMatch tupleToMatch(final Tuple t) {
    try {
    	return SystemOutputMatch.newMatch((WTSpec.SystemOutput) t.get(POSITION_O), (java.lang.String) t.get(POSITION_N));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SystemOutputMatch arrayToMatch(final Object[] match) {
    try {
    	return SystemOutputMatch.newMatch((WTSpec.SystemOutput) match[POSITION_O], (java.lang.String) match[POSITION_N]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SystemOutputMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SystemOutputMatch.newMutableMatch((WTSpec.SystemOutput) match[POSITION_O], (java.lang.String) match[POSITION_N]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SystemOutputMatcher> querySpecification() throws IncQueryException {
    return SystemOutputQuerySpecification.instance();
  }
}
