package wtspecquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import wtspecquery.CtrlUnit99Match;

/**
 * A match processor tailored for the wtspecquery.ctrlUnit99 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CtrlUnit99Processor implements IMatchProcessor<CtrlUnit99Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match
   * @param pWTC the value of pattern parameter WTC in the currently processed match
   * 
   */
  public abstract void process(final wtspec.Subsystem pS, final wtspec.CtrlUnit99 pWTC);
  
  @Override
  public void process(final CtrlUnit99Match match) {
    process(match.getS(), match.getWTC());
    
  }
}
