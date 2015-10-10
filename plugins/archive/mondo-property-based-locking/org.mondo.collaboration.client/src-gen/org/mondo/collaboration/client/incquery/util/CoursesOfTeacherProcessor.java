package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.CoursesOfTeacherMatch;
import school.Course;
import school.Teacher;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.coursesOfTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CoursesOfTeacherProcessor implements IMatchProcessor<CoursesOfTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pC the value of pattern parameter C in the currently processed match
   * 
   */
  public abstract void process(final Teacher pT, final Course pC);
  
  @Override
  public void process(final CoursesOfTeacherMatch match) {
    process(match.getT(), match.getC());
  }
}
