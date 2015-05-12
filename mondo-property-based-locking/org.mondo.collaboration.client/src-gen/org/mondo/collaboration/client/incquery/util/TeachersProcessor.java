package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.TeachersMatch;
import school.Teacher;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.teachers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersProcessor implements IMatchProcessor<TeachersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * 
   */
  public abstract void process(final Teacher pT);
  
  @Override
  public void process(final TeachersMatch match) {
    process(match.getT());
  }
}
