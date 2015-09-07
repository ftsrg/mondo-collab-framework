package org.mondo.collaboration.security.mpbl.server.dto;

import java.util.Collection;

import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;

public class ResponseLockDefinitionQueryDTO {

    private Collection<Pattern> lockDefinitions;

    public ResponseLockDefinitionQueryDTO(Collection<Pattern> lockDefinitions) {
        this.lockDefinitions = lockDefinitions;
    }

    public Collection<Pattern> getLockDefinitions() {
        return lockDefinitions;
    }
}
