package org.mondo.collaboration.client.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.collaboration.client.incquery.util.TeachersNamesQuerySpecification;
import school.Teacher;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.client.incquery.teachersNames pattern,
 * to be used in conjunction with {@link TeachersNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersNamesMatch extends BasePatternMatch {
  private Teacher fT;
  
  private String fTN;
  
  private static List<String> parameterNames = makeImmutableList("T", "TN");
  
  private TeachersNamesMatch(final Teacher pT, final String pTN) {
    this.fT = pT;
    this.fTN = pTN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("TN".equals(parameterName)) return this.fTN;
    return null;
  }
  
  public Teacher getT() {
    return this.fT;
  }
  
  public String getTN() {
    return this.fTN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("TN".equals(parameterName) ) {
    	this.fTN = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Teacher pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setTN(final String pTN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTN = pTN;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.client.incquery.teachersNames";
  }
  
  @Override
  public List<String> parameterNames() {
    return TeachersNamesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fTN};
  }
  
  @Override
  public TeachersNamesMatch toImmutable() {
    return isMutable() ? newMatch(fT, fTN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"TN\"=" + prettyPrintValue(fTN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fTN == null) ? 0 : fTN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeachersNamesMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TeachersNamesMatch other = (TeachersNamesMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fTN == null) {if (other.fTN != null) return false;}
    else if (!fTN.equals(other.fTN)) return false;
    return true;
  }
  
  @Override
  public TeachersNamesQuerySpecification specification() {
    try {
    	return TeachersNamesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static TeachersNamesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TeachersNamesMatch newMutableMatch(final Teacher pT, final String pTN) {
    return new Mutable(pT, pTN);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TeachersNamesMatch newMatch(final Teacher pT, final String pTN) {
    return new Immutable(pT, pTN);
  }
  
  private static final class Mutable extends TeachersNamesMatch {
    Mutable(final Teacher pT, final String pTN) {
      super(pT, pTN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TeachersNamesMatch {
    Immutable(final Teacher pT, final String pTN) {
      super(pT, pTN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
