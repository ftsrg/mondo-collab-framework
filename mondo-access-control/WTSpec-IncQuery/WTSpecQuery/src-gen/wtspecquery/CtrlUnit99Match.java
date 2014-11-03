package wtspecquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspecquery.util.CtrlUnit99QuerySpecification;

/**
 * Pattern-specific match representation of the wtspecquery.ctrlUnit99 pattern,
 * to be used in conjunction with {@link CtrlUnit99Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CtrlUnit99Matcher
 * @see CtrlUnit99Processor
 * 
 */
@SuppressWarnings("all")
public abstract class CtrlUnit99Match extends BasePatternMatch {
  private wtspec.Subsystem fS;
  
  private wtspec.CtrlUnit99 fWTC;
  
  private static List<String> parameterNames = makeImmutableList("S", "WTC");
  
  private CtrlUnit99Match(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC) {
    this.fS = pS;
    this.fWTC = pWTC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("WTC".equals(parameterName)) return this.fWTC;
    return null;
    
  }
  
  public wtspec.Subsystem getS() {
    return this.fS;
    
  }
  
  public wtspec.CtrlUnit99 getWTC() {
    return this.fWTC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S".equals(parameterName) ) {
    	this.fS = (wtspec.Subsystem) newValue;
    	return true;
    }
    if ("WTC".equals(parameterName) ) {
    	this.fWTC = (wtspec.CtrlUnit99) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final wtspec.Subsystem pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  public void setWTC(final wtspec.CtrlUnit99 pWTC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWTC = pWTC;
    
  }
  
  @Override
  public String patternName() {
    return "wtspecquery.ctrlUnit99";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CtrlUnit99Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS, fWTC};
    
  }
  
  @Override
  public CtrlUnit99Match toImmutable() {
    return isMutable() ? newMatch(fS, fWTC) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    result.append("\"WTC\"=" + prettyPrintValue(fWTC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    result = prime * result + ((fWTC == null) ? 0 : fWTC.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CtrlUnit99Match)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CtrlUnit99Match other = (CtrlUnit99Match) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    if (fWTC == null) {if (other.fWTC != null) return false;}
    else if (!fWTC.equals(other.fWTC)) return false;
    return true;
  }
  
  @Override
  public CtrlUnit99QuerySpecification specification() {
    try {
    	return CtrlUnit99QuerySpecification.instance();
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
  public static CtrlUnit99Match newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CtrlUnit99Match newMutableMatch(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC) {
    return new Mutable(pS, pWTC);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CtrlUnit99Match newMatch(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC) {
    return new Immutable(pS, pWTC);
    
  }
  
  private static final class Mutable extends CtrlUnit99Match {
    Mutable(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC) {
      super(pS, pWTC);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CtrlUnit99Match {
    Immutable(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC) {
      super(pS, pWTC);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
