package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.TheOnesWithTheBiggestCircleNameMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.theOnesWithTheBiggestCircleName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TheOnesWithTheBiggestCircleNameProcessor implements IMatchProcessor<TheOnesWithTheBiggestCircleNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSName the value of pattern parameter SName in the currently processed match
   * 
   */
  public abstract void process(final String pSName);
  
  @Override
  public void process(final TheOnesWithTheBiggestCircleNameMatch match) {
    process(match.getSName());
  }
}
