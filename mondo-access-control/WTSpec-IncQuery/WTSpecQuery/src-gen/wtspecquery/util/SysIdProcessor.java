package wtspecquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import wtspecquery.SysIdMatch;

/**
 * A match processor tailored for the wtspecquery.sysId pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SysIdProcessor implements IMatchProcessor<SysIdMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match
   * @param pN the value of pattern parameter N in the currently processed match
   * 
   */
  public abstract void process(final wtspec.Subsystem pS, final String pN);
  
  @Override
  public void process(final SysIdMatch match) {
    process(match.getS(), match.getN());
    
  }
}
