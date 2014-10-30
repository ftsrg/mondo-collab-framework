package wtspecquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspecquery.util.SysIdQuerySpecification;

/**
 * Pattern-specific match representation of the wtspecquery.sysId pattern,
 * to be used in conjunction with {@link SysIdMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SysIdMatcher
 * @see SysIdProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SysIdMatch extends BasePatternMatch {
  private wtspec.Subsystem fS;
  
  private String fN;
  
  private static List<String> parameterNames = makeImmutableList("S", "N");
  
  private SysIdMatch(final wtspec.Subsystem pS, final String pN) {
    this.fS = pS;
    this.fN = pN;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("N".equals(parameterName)) return this.fN;
    return null;
    
  }
  
  public wtspec.Subsystem getS() {
    return this.fS;
    
  }
  
  public String getN() {
    return this.fN;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S".equals(parameterName) ) {
    	this.fS = (wtspec.Subsystem) newValue;
    	return true;
    }
    if ("N".equals(parameterName) ) {
    	this.fN = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final wtspec.Subsystem pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  public void setN(final String pN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fN = pN;
    
  }
  
  @Override
  public String patternName() {
    return "wtspecquery.sysId";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SysIdMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS, fN};
    
  }
  
  @Override
  public SysIdMatch toImmutable() {
    return isMutable() ? newMatch(fS, fN) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    result.append("\"N\"=" + prettyPrintValue(fN));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    result = prime * result + ((fN == null) ? 0 : fN.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SysIdMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SysIdMatch other = (SysIdMatch) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    if (fN == null) {if (other.fN != null) return false;}
    else if (!fN.equals(other.fN)) return false;
    return true;
  }
  
  @Override
  public SysIdQuerySpecification specification() {
    try {
    	return SysIdQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static SysIdMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SysIdMatch newMutableMatch(final wtspec.Subsystem pS, final String pN) {
    return new Mutable(pS, pN);
    
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
  public static SysIdMatch newMatch(final wtspec.Subsystem pS, final String pN) {
    return new Immutable(pS, pN);
    
  }
  
  private static final class Mutable extends SysIdMatch {
    Mutable(final wtspec.Subsystem pS, final String pN) {
      super(pS, pN);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SysIdMatch {
    Immutable(final wtspec.Subsystem pS, final String pN) {
      super(pS, pN);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
