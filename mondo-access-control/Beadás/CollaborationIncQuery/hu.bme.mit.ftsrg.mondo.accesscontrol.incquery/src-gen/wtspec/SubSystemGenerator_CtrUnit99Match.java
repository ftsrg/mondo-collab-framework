package wtspec;

import WTSpec.CtrlUnit99;
import WTSpec.Subsystem;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspec.util.SubSystemGenerator_CtrUnit99QuerySpecification;

/**
 * Pattern-specific match representation of the wtspec.subSystemGenerator_CtrUnit99 pattern,
 * to be used in conjunction with {@link SubSystemGenerator_CtrUnit99Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SubSystemGenerator_CtrUnit99Matcher
 * @see SubSystemGenerator_CtrUnit99Processor
 * 
 */
@SuppressWarnings("all")
public abstract class SubSystemGenerator_CtrUnit99Match extends BasePatternMatch {
  private Subsystem fS;
  
  private String fS_id;
  
  private CtrlUnit99 fWTC;
  
  private String fC_id;
  
  private static List<String> parameterNames = makeImmutableList("S", "s_id", "WTC", "c_id");
  
  private SubSystemGenerator_CtrUnit99Match(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    this.fS = pS;
    this.fS_id = pS_id;
    this.fWTC = pWTC;
    this.fC_id = pC_id;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("s_id".equals(parameterName)) return this.fS_id;
    if ("WTC".equals(parameterName)) return this.fWTC;
    if ("c_id".equals(parameterName)) return this.fC_id;
    return null;
  }
  
  public Subsystem getS() {
    return this.fS;
  }
  
  public String getS_id() {
    return this.fS_id;
  }
  
  public CtrlUnit99 getWTC() {
    return this.fWTC;
  }
  
  public String getC_id() {
    return this.fC_id;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S".equals(parameterName) ) {
    	this.fS = (WTSpec.Subsystem) newValue;
    	return true;
    }
    if ("s_id".equals(parameterName) ) {
    	this.fS_id = (java.lang.String) newValue;
    	return true;
    }
    if ("WTC".equals(parameterName) ) {
    	this.fWTC = (WTSpec.CtrlUnit99) newValue;
    	return true;
    }
    if ("c_id".equals(parameterName) ) {
    	this.fC_id = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setS(final Subsystem pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
  }
  
  public void setS_id(final String pS_id) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS_id = pS_id;
  }
  
  public void setWTC(final CtrlUnit99 pWTC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWTC = pWTC;
  }
  
  public void setC_id(final String pC_id) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC_id = pC_id;
  }
  
  @Override
  public String patternName() {
    return "wtspec.subSystemGenerator_CtrUnit99";
  }
  
  @Override
  public List<String> parameterNames() {
    return SubSystemGenerator_CtrUnit99Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS, fS_id, fWTC, fC_id};
  }
  
  @Override
  public SubSystemGenerator_CtrUnit99Match toImmutable() {
    return isMutable() ? newMatch(fS, fS_id, fWTC, fC_id) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    
    result.append("\"s_id\"=" + prettyPrintValue(fS_id) + ", ");
    
    result.append("\"WTC\"=" + prettyPrintValue(fWTC) + ", ");
    
    result.append("\"c_id\"=" + prettyPrintValue(fC_id)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    result = prime * result + ((fS_id == null) ? 0 : fS_id.hashCode());
    result = prime * result + ((fWTC == null) ? 0 : fWTC.hashCode());
    result = prime * result + ((fC_id == null) ? 0 : fC_id.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SubSystemGenerator_CtrUnit99Match)) { // this should be infrequent
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
    SubSystemGenerator_CtrUnit99Match other = (SubSystemGenerator_CtrUnit99Match) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    if (fS_id == null) {if (other.fS_id != null) return false;}
    else if (!fS_id.equals(other.fS_id)) return false;
    if (fWTC == null) {if (other.fWTC != null) return false;}
    else if (!fWTC.equals(other.fWTC)) return false;
    if (fC_id == null) {if (other.fC_id != null) return false;}
    else if (!fC_id.equals(other.fC_id)) return false;
    return true;
  }
  
  @Override
  public SubSystemGenerator_CtrUnit99QuerySpecification specification() {
    try {
    	return SubSystemGenerator_CtrUnit99QuerySpecification.instance();
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
  public static SubSystemGenerator_CtrUnit99Match newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pS_id the fixed value of pattern parameter s_id, or null if not bound.
   * @param pWTC the fixed value of pattern parameter WTC, or null if not bound.
   * @param pC_id the fixed value of pattern parameter c_id, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SubSystemGenerator_CtrUnit99Match newMutableMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return new Mutable(pS, pS_id, pWTC, pC_id);
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
  public static SubSystemGenerator_CtrUnit99Match newMatch(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
    return new Immutable(pS, pS_id, pWTC, pC_id);
  }
  
  private static final class Mutable extends SubSystemGenerator_CtrUnit99Match {
    Mutable(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
      super(pS, pS_id, pWTC, pC_id);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SubSystemGenerator_CtrUnit99Match {
    Immutable(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id) {
      super(pS, pS_id, pWTC, pC_id);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
