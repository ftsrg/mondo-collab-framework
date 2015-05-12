package org.mondo.collaboration.client.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.client.incquery.InTheCircleOfFriendsMatch;
import school.Student;

/**
 * A match processor tailored for the org.mondo.collaboration.client.incquery.inTheCircleOfFriends pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InTheCircleOfFriendsProcessor implements IMatchProcessor<InTheCircleOfFriendsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter S1 in the currently processed match
   * @param pSomeone the value of pattern parameter Someone in the currently processed match
   * 
   */
  public abstract void process(final Student pS1, final Student pSomeone);
  
  @Override
  public void process(final InTheCircleOfFriendsMatch match) {
    process(match.getS1(), match.getSomeone());
  }
}
