package wtspec;

import WTSpec.SystemInput;
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
import wtspec.SystemInputMatch;
import wtspec.util.SystemInputQuerySpecification;

/**
 * Generated pattern matcher API of the wtspec.systemInput pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SystemInputMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern systemInput(I : SystemInput, n: EString) {
 * 	WT.itsInputs(_WT, I);
 * 	SystemInput.sysId(I,n);
 * }
 * </pre></code>
 * 
 * @see SystemInputMatch
 * @see SystemInputProcessor
 * @see SystemInputQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SystemInputMatcher extends BaseMatcher<SystemInputMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SystemInputMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SystemInputMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SystemInputMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_I = 0;
  
  private final static int POSITION_N = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SystemInputMatcher.class);
  
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
  public SystemInputMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SystemInputMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return matches represented as a SystemInputMatch object.
   * 
   */
  public Collection<SystemInputMatch> getAllMatches(final SystemInput pI, final String pN) {
    return rawGetAllMatches(new Object[]{pI, pN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return a match represented as a SystemInputMatch object, or null if no match is found.
   * 
   */
  public SystemInputMatch getOneArbitraryMatch(final SystemInput pI, final String pN) {
    return rawGetOneArbitraryMatch(new Object[]{pI, pN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemInput pI, final String pN) {
    return rawHasMatch(new Object[]{pI, pN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemInput pI, final String pN) {
    return rawCountMatches(new Object[]{pI, pN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemInput pI, final String pN, final IMatchProcessor<? super SystemInputMatch> processor) {
    rawForEachMatch(new Object[]{pI, pN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemInput pI, final String pN, final IMatchProcessor<? super SystemInputMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pI, pN}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SystemInputMatch newMatch(final SystemInput pI, final String pN) {
    return SystemInputMatch.newMatch(pI, pN);
  }
  
  /**
   * Retrieve the set of values that occur in matches for I.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SystemInput> rawAccumulateAllValuesOfI(final Object[] parameters) {
    Set<SystemInput> results = new HashSet<SystemInput>();
    rawAccumulateAllValues(POSITION_I, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for I.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemInput> getAllValuesOfI() {
    return rawAccumulateAllValuesOfI(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for I.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemInput> getAllValuesOfI(final SystemInputMatch partialMatch) {
    return rawAccumulateAllValuesOfI(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for I.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SystemInput> getAllValuesOfI(final String pN) {
    return rawAccumulateAllValuesOfI(new Object[]{
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
  public Set<String> getAllValuesOfn(final SystemInputMatch partialMatch) {
    return rawAccumulateAllValuesOfn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfn(final SystemInput pI) {
    return rawAccumulateAllValuesOfn(new Object[]{
    pI, 
    null
    });
  }
  
  @Override
  protected SystemInputMatch tupleToMatch(final Tuple t) {
    try {
    	return SystemInputMatch.newMatch((WTSpec.SystemInput) t.get(POSITION_I), (java.lang.String) t.get(POSITION_N));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SystemInputMatch arrayToMatch(final Object[] match) {
    try {
    	return SystemInputMatch.newMatch((WTSpec.SystemInput) match[POSITION_I], (java.lang.String) match[POSITION_N]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SystemInputMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SystemInputMatch.newMutableMatch((WTSpec.SystemInput) match[POSITION_I], (java.lang.String) match[POSITION_N]);
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
  public static IQuerySpecification<SystemInputMatcher> querySpecification() throws IncQueryException {
    return SystemInputQuerySpecification.instance();
  }
}
