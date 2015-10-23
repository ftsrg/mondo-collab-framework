package wtspec;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import wtspec.CtrlUnit99Matcher;
import wtspec.SubSystemGenerator_CtrUnit99Matcher;
import wtspec.SystemInputMatcher;
import wtspec.SystemOutputMatcher;
import wtspec.util.CtrlUnit99QuerySpecification;
import wtspec.util.SubSystemGenerator_CtrUnit99QuerySpecification;
import wtspec.util.SystemInputQuerySpecification;
import wtspec.util.SystemOutputQuerySpecification;

/**
 * A pattern group formed of all patterns defined in queries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file queries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package wtspec, the group contains the definition of the following patterns: <ul>
 * <li>systemInput</li>
 * <li>systemOutput</li>
 * <li>ctrlUnit99</li>
 * <li>subSystemGenerator_CtrUnit99</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws IncQueryException {
    querySpecifications.add(SystemInputQuerySpecification.instance());
    querySpecifications.add(SystemOutputQuerySpecification.instance());
    querySpecifications.add(CtrlUnit99QuerySpecification.instance());
    querySpecifications.add(SubSystemGenerator_CtrUnit99QuerySpecification.instance());
  }
  
  public SystemInputQuerySpecification getSystemInput() throws IncQueryException {
    return SystemInputQuerySpecification.instance();
  }
  
  public SystemInputMatcher getSystemInput(final IncQueryEngine engine) throws IncQueryException {
    return SystemInputMatcher.on(engine);
  }
  
  public SystemOutputQuerySpecification getSystemOutput() throws IncQueryException {
    return SystemOutputQuerySpecification.instance();
  }
  
  public SystemOutputMatcher getSystemOutput(final IncQueryEngine engine) throws IncQueryException {
    return SystemOutputMatcher.on(engine);
  }
  
  public CtrlUnit99QuerySpecification getCtrlUnit99() throws IncQueryException {
    return CtrlUnit99QuerySpecification.instance();
  }
  
  public CtrlUnit99Matcher getCtrlUnit99(final IncQueryEngine engine) throws IncQueryException {
    return CtrlUnit99Matcher.on(engine);
  }
  
  public SubSystemGenerator_CtrUnit99QuerySpecification getSubSystemGenerator_CtrUnit99() throws IncQueryException {
    return SubSystemGenerator_CtrUnit99QuerySpecification.instance();
  }
  
  public SubSystemGenerator_CtrUnit99Matcher getSubSystemGenerator_CtrUnit99(final IncQueryEngine engine) throws IncQueryException {
    return SubSystemGenerator_CtrUnit99Matcher.on(engine);
  }
}
