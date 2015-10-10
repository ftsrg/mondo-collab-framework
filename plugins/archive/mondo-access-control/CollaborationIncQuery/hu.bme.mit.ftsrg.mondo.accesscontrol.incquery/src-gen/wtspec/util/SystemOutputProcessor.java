package wtspec.util;

import WTSpec.SystemOutput;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import wtspec.SystemOutputMatch;

/**
 * A match processor tailored for the wtspec.systemOutput pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SystemOutputProcessor implements IMatchProcessor<SystemOutputMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pO the value of pattern parameter O in the currently processed match
   * @param pN the value of pattern parameter n in the currently processed match
   * 
   */
  public abstract void process(final SystemOutput pO, final String pN);
  
  @Override
  public void process(final SystemOutputMatch match) {
    process(match.getO(), match.getN());
  }
}
