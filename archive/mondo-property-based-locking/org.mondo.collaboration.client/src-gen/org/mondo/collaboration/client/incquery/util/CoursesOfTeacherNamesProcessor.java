package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.CoursesOfTeacherNamesMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.coursesOfTeacherNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CoursesOfTeacherNamesProcessor implements IMatchProcessor<CoursesOfTeacherNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTName the value of pattern parameter TName in the currently processed match
   * @param pCName the value of pattern parameter CName in the currently processed match
   * 
   */
  public abstract void process(final String pTName, final String pCName);
  
  @Override
  public void process(final CoursesOfTeacherNamesMatch match) {
    process(match.getTName(), match.getCName());
  }
}
