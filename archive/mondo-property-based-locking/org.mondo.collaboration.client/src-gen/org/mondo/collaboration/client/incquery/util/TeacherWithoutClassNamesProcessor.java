package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.TeacherWithoutClassNamesMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.teacherWithoutClassNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeacherWithoutClassNamesProcessor implements IMatchProcessor<TeacherWithoutClassNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTNames the value of pattern parameter TNames in the currently processed match
   * 
   */
  public abstract void process(final String pTNames);
  
  @Override
  public void process(final TeacherWithoutClassNamesMatch match) {
    process(match.getTNames());
  }
}
