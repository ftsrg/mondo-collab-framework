package wtspec;

import WTSpec.SystemOutput;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspec.util.SystemOutputQuerySpecification;

/**
 * Pattern-specific match representation of the wtspec.systemOutput pattern,
 * to be used in conjunction with {@link SystemOutputMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SystemOutputMatcher
 * @see SystemOutputProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SystemOutputMatch extends BasePatternMatch {
  private SystemOutput fO;
  
  private String fN;
  
  private static List<String> parameterNames = makeImmutableList("O", "n");
  
  private SystemOutputMatch(final SystemOutput pO, final String pN) {
    this.fO = pO;
    this.fN = pN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("O".equals(parameterName)) return this.fO;
    if ("n".equals(parameterName)) return this.fN;
    return null;
  }
  
  public SystemOutput getO() {
    return this.fO;
  }
  
  public String getN() {
    return this.fN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("O".equals(parameterName) ) {
    	this.fO = (WTSpec.SystemOutput) newValue;
    	return true;
    }
    if ("n".equals(parameterName) ) {
    	this.fN = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setO(final SystemOutput pO) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fO = pO;
  }
  
  public void setN(final String pN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fN = pN;
  }
  
  @Override
  public String patternName() {
    return "wtspec.systemOutput";
  }
  
  @Override
  public List<String> parameterNames() {
    return SystemOutputMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fO, fN};
  }
  
  @Override
  public SystemOutputMatch toImmutable() {
    return isMutable() ? newMatch(fO, fN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"O\"=" + prettyPrintValue(fO) + ", ");
    
    result.append("\"n\"=" + prettyPrintValue(fN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fO == null) ? 0 : fO.hashCode());
    result = prime * result + ((fN == null) ? 0 : fN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SystemOutputMatch)) { // this should be infrequent
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
    SystemOutputMatch other = (SystemOutputMatch) obj;
    if (fO == null) {if (other.fO != null) return false;}
    else if (!fO.equals(other.fO)) return false;
    if (fN == null) {if (other.fN != null) return false;}
    else if (!fN.equals(other.fN)) return false;
    return true;
  }
  
  @Override
  public SystemOutputQuerySpecification specification() {
    try {
    	return SystemOutputQuerySpecification.instance();
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
  public static SystemOutputMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pO the fixed value of pattern parameter O, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SystemOutputMatch newMutableMatch(final SystemOutput pO, final String pN) {
    return new Mutable(pO, pN);
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
  public static SystemOutputMatch newMatch(final SystemOutput pO, final String pN) {
    return new Immutable(pO, pN);
  }
  
  private static final class Mutable extends SystemOutputMatch {
    Mutable(final SystemOutput pO, final String pN) {
      super(pO, pN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SystemOutputMatch {
    Immutable(final SystemOutput pO, final String pN) {
      super(pO, pN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
