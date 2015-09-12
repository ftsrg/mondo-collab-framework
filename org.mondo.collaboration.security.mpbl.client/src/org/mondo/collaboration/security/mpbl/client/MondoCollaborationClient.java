package org.mondo.collaboration.security.mpbl.client;

import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.mondo.collaboration.security.mpbl.server.dto.LockDTO;
import org.mondo.collaboration.security.mpbl.server.dto.ResponseLockDTO;
import org.mondo.collaboration.security.mpbl.server.impl.PropertyBasedLockingServer;

public class MondoCollaborationClient {

    private static MondoCollaborationClient instance;

    private MondoCollaborationClient() {
    }

    public static MondoCollaborationClient instance() {
        if (instance == null) {
            instance = new MondoCollaborationClient();
        }

        return instance;
    }

    public ResponseLockDTO publishLockDefinition(
            PatternModel model, 
            String username, 
            String password,
            String description,
            String frontRepository) {
        
        return PropertyBasedLockingServer.instance()
                .publishLockDefinition(new LockDTO(model, username, password, description, frontRepository));
    }

    public void lock() {
    }

    public void unlock() {
    }

    public void unpublishLockDefinition() {
    }

}
