package org.mondo.collaboration.security.mpbl.server.dto;

import java.io.Serializable;

/**
 * This DTO responsible to notify the client about the executed task
 * @author Csaba Debreceni
 *
 */
public class ResponseLockDTO implements Serializable {
    private static final long serialVersionUID = -5505662353144484047L;
    
    private boolean success;
    private String identifier;
    private String message;
    
    public ResponseLockDTO(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    
    public ResponseLockDTO(boolean success, String message, String identifier) {
        this.success = success;
        this.message = message;
        this.identifier = identifier;
    }
    
    public boolean isSuccess() {
        return success;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public String getMessage() {
        return message;
    }
}
