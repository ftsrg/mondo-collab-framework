package org.mondo.collaboration.security.mpbl.server;

import org.mondo.collaboration.security.mpbl.server.dto.LockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.LockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDefinitionQueryDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockQueryDTO;

/**
 * This interface describe the available operations on the server side related to the property based locking
 * 
 * @author Csaba Debreceni
 *
 */
public interface IPropertyBasedLockingServer {

    /**
     * Publishes an IncQuery pattern that can be used in a lock definition
     * 
     * @param lock
     * @return
     */
    public ResponseLockDTO publishLock(LockDTO lock);

    /**
     * Removes a published IncQuery pattern from the available lock definitions. If an existing lock definition uses
     * this pattern this method will NOT be executed.
     * 
     * @param lock
     * @return
     */
    public ResponseLockDTO unpublishLock(LockDTO lock);

    /**
     * Create a lock definition with a selected pattern and binding configuration
     * 
     * @param lock
     * @return
     */
    public ResponseLockDTO lock(LockDTO lock);

    /**
     * Removes the selected lock definition
     * 
     * @param lock
     * @return
     */
    public ResponseLockDTO unlock(LockDTO lock);

    /**
     * Returns the available lock definitions that can be used by the users
     * 
     * @return
     */
    public ResponseLockDefinitionQueryDTO queryLockDefinitions(LockDefinitionQueryDTO query);

    
    /**
     * Returns the currently existing lock in the repository
     * @return
     */
    public ResponseLockQueryDTO queryLocks(LockQueryDTO query);

}
