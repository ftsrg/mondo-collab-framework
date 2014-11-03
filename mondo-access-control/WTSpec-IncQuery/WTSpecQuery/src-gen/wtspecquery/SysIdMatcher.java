package wtspecquery;

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
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import wtspecquery.SysIdMatch;
import wtspecquery.util.SysIdQuerySpecification;

/**
 * Generated pattern matcher API of the wtspecquery.sysId pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SysIdMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern sysId(S, N) {
 * 	Subsystem.sysId(S, N);
 * }
 * </pre></code>
 * 
 * @see SysIdMatch
 * @see SysIdProcessor
 * @see SysIdQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SysIdMatcher extends BaseMatcher<SysIdMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SysIdMatcher> querySpecification() throws IncQueryException {
    return SysIdQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SysIdMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SysIdMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SysIdMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S = 0;
  
  private final static int POSITION_N = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SysIdMatcher.class);
  
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
  public SysIdMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SysIdMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return matches represented as a SysIdMatch object.
   * 
   */
  public Collection<SysIdMatch> getAllMatches(final wtspec.Subsystem pS, final String pN) {
    return rawGetAllMatches(new Object[]{pS, pN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return a match represented as a SysIdMatch object, or null if no match is found.
   * 
   */
  public SysIdMatch getOneArbitraryMatch(final wtspec.Subsystem pS, final String pN) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final wtspec.Subsystem pS, final String pN) {
    return rawHasMatch(new Object[]{pS, pN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final wtspec.Subsystem pS, final String pN) {
    return rawCountMatches(new Object[]{pS, pN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final wtspec.Subsystem pS, final String pN, final IMatchProcessor<? super SysIdMatch> processor) {
    rawForEachMatch(new Object[]{pS, pN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final wtspec.Subsystem pS, final String pN, final IMatchProcessor<? super SysIdMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pN}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SysIdMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final wtspec.Subsystem pS, final String pN) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS, pN});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SysIdMatch newMatch(final wtspec.Subsystem pS, final String pN) {
    return SysIdMatch.newMatch(pS, pN);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<wtspec.Subsystem> */Object rawAccumulateAllValuesOfS(final Object[] parameters) {
    Set<wtspec.Subsystem> results = new HashSet<wtspec.Subsystem>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<wtspec.Subsystem> */Object getAllValuesOfS() {
    return rawAccumulateAllValuesOfS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<wtspec.Subsystem> */Object getAllValuesOfS(final SysIdMatch partialMatch) {
    return rawAccumulateAllValuesOfS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<wtspec.Subsystem> */Object getAllValuesOfS(final String pN) {
    return rawAccumulateAllValuesOfS(new Object[]{null, pN});
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_N, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfN() {
    return rawAccumulateAllValuesOfN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfN(final SysIdMatch partialMatch) {
    return rawAccumulateAllValuesOfN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfN(final wtspec.Subsystem pS) {
    return rawAccumulateAllValuesOfN(new Object[]{pS, null});
  }
  
  @Override
  protected SysIdMatch tupleToMatch(final Tuple t) {
    try {
      return SysIdMatch.newMatch((wtspec.Subsystem) t.get(POSITION_S), (java.lang.String) t.get(POSITION_N));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SysIdMatch arrayToMatch(final Object[] match) {
    try {
      return SysIdMatch.newMatch((wtspec.Subsystem) match[POSITION_S], (java.lang.String) match[POSITION_N]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SysIdMatch arrayToMatchMutable(final Object[] match) {
    try {
      return SysIdMatch.newMutableMatch((wtspec.Subsystem) match[POSITION_S], (java.lang.String) match[POSITION_N]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
