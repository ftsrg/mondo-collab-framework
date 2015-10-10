package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.FinalPattern2Match;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.finalPattern2 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FinalPattern2Processor implements IMatchProcessor<FinalPattern2Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pYDate the value of pattern parameter YDate in the currently processed match
   * @param pCSub the value of pattern parameter CSub in the currently processed match
   * @param pTName the value of pattern parameter TName in the currently processed match
   * @param pSName the value of pattern parameter SName in the currently processed match
   * 
   */
  public abstract void process(final Integer pYDate, final String pCSub, final String pTName, final String pSName);
  
  @Override
  public void process(final FinalPattern2Match match) {
    process(match.getYDate(), match.getCSub(), match.getTName(), match.getSName());
  }
}
