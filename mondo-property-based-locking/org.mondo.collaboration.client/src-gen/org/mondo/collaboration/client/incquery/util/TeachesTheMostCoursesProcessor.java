package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.TeachesTheMostCoursesMatch;
import school.Teacher;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.teachesTheMostCourses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeachesTheMostCoursesProcessor implements IMatchProcessor<TeachesTheMostCoursesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * 
   */
  public abstract void process(final Teacher pT);
  
  @Override
  public void process(final TeachesTheMostCoursesMatch match) {
    process(match.getT());
  }
}
