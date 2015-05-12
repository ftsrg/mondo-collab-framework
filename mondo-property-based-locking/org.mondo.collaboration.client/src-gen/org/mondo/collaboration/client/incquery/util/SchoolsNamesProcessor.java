package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.SchoolsNamesMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.schoolsNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SchoolsNamesProcessor implements IMatchProcessor<SchoolsNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSchName the value of pattern parameter SchName in the currently processed match
   * 
   */
  public abstract void process(final String pSchName);
  
  @Override
  public void process(final SchoolsNamesMatch match) {
    process(match.getSchName());
  }
}
