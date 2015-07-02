package wtspec;

import WTSpec.CtrlUnit99;
import WTSpec.Subsystem;
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
import wtspec.CtrlUnit99Match;
import wtspec.util.CtrlUnit99QuerySpecification;

/**
 * Generated pattern matcher API of the wtspec.ctrlUnit99 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CtrlUnit99Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ctrlUnit99(S : Subsystem, s_id : EString, WTC : CtrlUnit99, c_id : EString) {
 * 	Subsystem.itsWTCs(S, WTC);
 * 	CtrlUnit99(WTC);
 * 	Subsystem.sysId(S,s_id);
 * 	wtc.sysId(WTC, c_id);
 * }
 * </pre></code>
 * 
 * @see CtrlUnit99Match
 * @see CtrlUnit99Processor
 * @see CtrlUnit99QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CtrlUnit99Matcher extends BaseMatcher<CtrlUnit99Match> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CtrlUnit99Matcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CtrlUnit99Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CtrlUnit99Matcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S = 0;
  
  private final static int POSITION_S_ID = 1;
  
  private final static int POSITION_WTC = 2;
  
  private final static int POSITION_C_ID = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CtrlUnit99Matcher.class);
  
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
  public CtrlUnit99Matcher(final Notifier emfRoot) throws IncQueryException {
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
  public CtrlUnit99Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return matches represented as a CtrlUnit99Match object.
   * 
   */
  public Collection<CtrlUnit99Match> getAllMatches(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return rawGetAllMatches(new Object[]{pS, pS_id, pWTC, pC_id});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return a match represented as a CtrlUnit99Match object, or null if no match is found.
   * 
   */
  public CtrlUnit99Match getOneArbitraryMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pS_id, pWTC, pC_id});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return rawHasMatch(new Object[]{pS, pS_id, pWTC, pC_id});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return rawCountMatches(new Object[]{pS, pS_id, pWTC, pC_id});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id, final IMatchProcessor<? super CtrlUnit99Match> processor) {
    rawForEachMatch(new Object[]{pS, pS_id, pWTC, pC_id}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id, final IMatchProcessor<? super CtrlUnit99Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pS_id, pWTC, pC_id}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CtrlUnit99Match newMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return CtrlUnit99Match.newMatch(pS, pS_id, pWTC, pC_id);
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Subsystem> rawAccumulateAllValuesOfS(final Object[] parameters) {
    Set<Subsystem> results = new HashSet<Subsystem>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Subsystem> getAllValuesOfS() {
    return rawAccumulateAllValuesOfS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Subsystem> getAllValuesOfS(final CtrlUnit99Match partialMatch) {
    return rawAccumulateAllValuesOfS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Subsystem> getAllValuesOfS(final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return rawAccumulateAllValuesOfS(new Object[]{
    null, 
    pS_id, 
    pWTC, 
    pC_id
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for s_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfs_id(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_S_ID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfs_id() {
    return rawAccumulateAllValuesOfs_id(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfs_id(final CtrlUnit99Match partialMatch) {
    return rawAccumulateAllValuesOfs_id(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfs_id(final Subsystem pS, final CtrlUnit99 pWTC, final String pC_id) {
    return rawAccumulateAllValuesOfs_id(new Object[]{
    pS, 
    null, 
    pWTC, 
    pC_id
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for WTC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<CtrlUnit99> rawAccumulateAllValuesOfWTC(final Object[] parameters) {
    Set<CtrlUnit99> results = new HashSet<CtrlUnit99>();
    rawAccumulateAllValues(POSITION_WTC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for WTC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CtrlUnit99> getAllValuesOfWTC() {
    return rawAccumulateAllValuesOfWTC(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for WTC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CtrlUnit99> getAllValuesOfWTC(final CtrlUnit99Match partialMatch) {
    return rawAccumulateAllValuesOfWTC(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for WTC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CtrlUnit99> getAllValuesOfWTC(final Subsystem pS, final String pS_id, final String pC_id) {
    return rawAccumulateAllValuesOfWTC(new Object[]{
    pS, 
    pS_id, 
    null, 
    pC_id
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for c_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfc_id(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_C_ID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for c_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfc_id() {
    return rawAccumulateAllValuesOfc_id(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfc_id(final CtrlUnit99Match partialMatch) {
    return rawAccumulateAllValuesOfc_id(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c_id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfc_id(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC) {
    return rawAccumulateAllValuesOfc_id(new Object[]{
    pS, 
    pS_id, 
    pWTC, 
    null
    });
  }
  
  @Override
  protected CtrlUnit99Match tupleToMatch(final Tuple t) {
    try {
    	return CtrlUnit99Match.newMatch((WTSpec.Subsystem) t.get(POSITION_S), (java.lang.String) t.get(POSITION_S_ID), (WTSpec.CtrlUnit99) t.get(POSITION_WTC), (java.lang.String) t.get(POSITION_C_ID));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CtrlUnit99Match arrayToMatch(final Object[] match) {
    try {
    	return CtrlUnit99Match.newMatch((WTSpec.Subsystem) match[POSITION_S], (java.lang.String) match[POSITION_S_ID], (WTSpec.CtrlUnit99) match[POSITION_WTC], (java.lang.String) match[POSITION_C_ID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CtrlUnit99Match arrayToMatchMutable(final Object[] match) {
    try {
    	return CtrlUnit99Match.newMutableMatch((WTSpec.Subsystem) match[POSITION_S], (java.lang.String) match[POSITION_S_ID], (WTSpec.CtrlUnit99) match[POSITION_WTC], (java.lang.String) match[POSITION_C_ID]);
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
  public static IQuerySpecification<CtrlUnit99Matcher> querySpecification() throws IncQueryException {
    return CtrlUnit99QuerySpecification.instance();
  }
}
