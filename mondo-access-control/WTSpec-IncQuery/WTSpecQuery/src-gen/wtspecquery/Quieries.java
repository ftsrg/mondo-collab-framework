package wtspecquery;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspecquery.CtrlUnit99Matcher;
import wtspecquery.SysIdMatcher;
import wtspecquery.util.CtrlUnit99QuerySpecification;
import wtspecquery.util.SysIdQuerySpecification;

/**
 * A pattern group formed of all patterns defined in quieries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file quieries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package wtspecquery, the group contains the definition of the following patterns: <ul>
 * <li>sysId</li>
 * <li>ctrlUnit99</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Quieries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Quieries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Quieries();
    }
    return INSTANCE;
    
  }
  
  private static Quieries INSTANCE;
  
  private Quieries() throws IncQueryException {
    querySpecifications.add(SysIdQuerySpecification.instance());
    querySpecifications.add(CtrlUnit99QuerySpecification.instance());
    
  }
  
  public SysIdQuerySpecification getSysId() throws IncQueryException {
    return SysIdQuerySpecification.instance();
  }
  
  public SysIdMatcher getSysId(final IncQueryEngine engine) throws IncQueryException {
    return SysIdMatcher.on(engine);
  }
  
  public CtrlUnit99QuerySpecification getCtrlUnit99() throws IncQueryException {
    return CtrlUnit99QuerySpecification.instance();
  }
  
  public CtrlUnit99Matcher getCtrlUnit99(final IncQueryEngine engine) throws IncQueryException {
    return CtrlUnit99Matcher.on(engine);
  }
}
