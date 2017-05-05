package org.mondo.collaboration.security.mpbl.server.dto;

import java.io.Serializable;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel;

/**
 * This DTO is responsible to wrap all the information about the executing lock-based task
 * 
 * @author Csaba Debreceni
 *
 */
public class LockDTO implements Serializable {

    private static final long serialVersionUID = 8151068235711599398L;

    private String user;                            // the current user
    private PatternModel lockDefinitionModel;       // describes the pattern (lock definition) with optional additional patterns
    private String resourcePath;                    // path to the resource on which the lock is applied
    private String lockDefinitionId;                // identifies the lock definition
    private PropertyBasedLockingModel lockModel;    // describes the lock with bindings
    private String lockId;                          // identifies the lock
    private String password;                        // password of the current user
    private String frontRepository;                 // URL of the front repository
    private String description;                     // description of the lock definition
 
    public LockDTO(PatternModel lockDefinitionModel, String user, String password, String description, String frontRepository) {
        this.lockDefinitionModel = lockDefinitionModel;
        this.user = user;
        this.password = password;
        this.description = description;
        this.frontRepository = frontRepository;
    }
    
    public PatternModel getLockDefinitionModel() {
        return lockDefinitionModel;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getLockId() {
        return lockId;
    }
    
    public PropertyBasedLockingModel getLockModel() {
        return lockModel;
    }
    
    public String getLockDefinitionId() {
        return lockDefinitionId;
    }
    
    public String getUser() {
        return user;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFrontRepository() {
        return frontRepository;
    }
    
    public String getDescription() {
        return description;
    }
}