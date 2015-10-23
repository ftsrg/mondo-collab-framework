package wtspec.util;

import WTSpec.CtrlUnit99;
import WTSpec.Subsystem;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import wtspec.CtrlUnit99Match;

/**
 * A match processor tailored for the wtspec.ctrlUnit99 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CtrlUnit99Processor implements IMatchProcessor<CtrlUnit99Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match
   * @param pS_id the value of pattern parameter s_id in the currently processed match
   * @param pWTC the value of pattern parameter WTC in the currently processed match
   * @param pC_id the value of pattern parameter c_id in the currently processed match
   * 
   */
  public abstract void process(final Subsystem pS, final String pS_id, final CtrlUnit99 pWTC, final String pC_id);
  
  @Override
  public void process(final CtrlUnit99Match match) {
    process(match.getS(), match.getS_id(), match.getWTC(), match.getC_id());
  }
}
