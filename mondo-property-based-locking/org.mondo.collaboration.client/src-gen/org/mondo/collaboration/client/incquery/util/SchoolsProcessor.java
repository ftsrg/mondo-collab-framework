package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.SchoolsMatch;
import school.School;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.schools pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SchoolsProcessor implements IMatchProcessor<SchoolsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSch the value of pattern parameter Sch in the currently processed match
   * 
   */
  public abstract void process(final School pSch);
  
  @Override
  public void process(final SchoolsMatch match) {
    process(match.getSch());
  }
}
