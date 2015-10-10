package wtspec.util;

import WTSpec.SystemInput;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import wtspec.SystemInputMatch;

/**
 * A match processor tailored for the wtspec.systemInput pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SystemInputProcessor implements IMatchProcessor<SystemInputMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pI the value of pattern parameter I in the currently processed match
   * @param pN the value of pattern parameter n in the currently processed match
   * 
   */
  public abstract void process(final SystemInput pI, final String pN);
  
  @Override
  public void process(final SystemInputMatch match) {
    process(match.getI(), match.getN());
  }
}
