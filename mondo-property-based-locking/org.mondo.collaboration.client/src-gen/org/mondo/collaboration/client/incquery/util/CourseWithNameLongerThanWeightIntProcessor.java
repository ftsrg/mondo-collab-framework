package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.CourseWithNameLongerThanWeightIntMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.courseWithNameLongerThanWeightInt pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CourseWithNameLongerThanWeightIntProcessor implements IMatchProcessor<CourseWithNameLongerThanWeightIntMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pW the value of pattern parameter W in the currently processed match
   * 
   */
  public abstract void process(final Integer pW);
  
  @Override
  public void process(final CourseWithNameLongerThanWeightIntMatch match) {
    process(match.getW());
  }
}
