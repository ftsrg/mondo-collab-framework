package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.TeachersNamesMatch;
import school.Teacher;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.teachersNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersNamesProcessor implements IMatchProcessor<TeachersNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pTN the value of pattern parameter TN in the currently processed match
   * 
   */
  public abstract void process(final Teacher pT, final String pTN);
  
  @Override
  public void process(final TeachersNamesMatch match) {
    process(match.getT(), match.getTN());
  }
}
