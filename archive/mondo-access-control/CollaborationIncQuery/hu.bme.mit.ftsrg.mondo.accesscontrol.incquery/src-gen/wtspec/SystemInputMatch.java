package wtspec;

import WTSpec.SystemInput;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspec.util.SystemInputQuerySpecification;

/**
 * Pattern-specific match representation of the wtspec.systemInput pattern,
 * to be used in conjunction with {@link SystemInputMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SystemInputMatcher
 * @see SystemInputProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SystemInputMatch extends BasePatternMatch {
  private SystemInput fI;
  
  private String fN;
  
  private static List<String> parameterNames = makeImmutableList("I", "n");
  
  private SystemInputMatch(final SystemInput pI, final String pN) {
    this.fI = pI;
    this.fN = pN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("I".equals(parameterName)) return this.fI;
    if ("n".equals(parameterName)) return this.fN;
    return null;
  }
  
  public SystemInput getI() {
    return this.fI;
  }
  
  public String getN() {
    return this.fN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("I".equals(parameterName) ) {
    	this.fI = (WTSpec.SystemInput) newValue;
    	return true;
    }
    if ("n".equals(parameterName) ) {
    	this.fN = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setI(final SystemInput pI) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fI = pI;
  }
  
  public void setN(final String pN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fN = pN;
  }
  
  @Override
  public String patternName() {
    return "wtspec.systemInput";
  }
  
  @Override
  public List<String> parameterNames() {
    return SystemInputMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fI, fN};
  }
  
  @Override
  public SystemInputMatch toImmutable() {
    return isMutable() ? newMatch(fI, fN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"I\"=" + prettyPrintValue(fI) + ", ");
    
    result.append("\"n\"=" + prettyPrintValue(fN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fI == null) ? 0 : fI.hashCode());
    result = prime * result + ((fN == null) ? 0 : fN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SystemInputMatch)) { // this should be infrequent
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
    SystemInputMatch other = (SystemInputMatch) obj;
    if (fI == null) {if (other.fI != null) return false;}
    else if (!fI.equals(other.fI)) return false;
    if (fN == null) {if (other.fN != null) return false;}
    else if (!fN.equals(other.fN)) return false;
    return true;
  }
  
  @Override
  public SystemInputQuerySpecification specification() {
    try {
    	return SystemInputQuerySpecification.instance();
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
  public static SystemInputMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pI the fixed value of pattern parameter I, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SystemInputMatch newMutableMatch(final SystemInput pI, final String pN) {
    return new Mutable(pI, pN);
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
  public static SystemInputMatch newMatch(final SystemInput pI, final String pN) {
    return new Immutable(pI, pN);
  }
  
  private static final class Mutable extends SystemInputMatch {
    Mutable(final SystemInput pI, final String pN) {
      super(pI, pN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SystemInputMatch {
    Immutable(final SystemInput pI, final String pN) {
      super(pI, pN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
