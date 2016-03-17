package org.mondo.collaboration.security.mpbl.server.dto;

import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;

public class ResponseLockDefinitionQueryDTO {

    private Map<String,PatternModel> lockDefinitions;

    public ResponseLockDefinitionQueryDTO(Map<String,PatternModel> lockDefinitions) {
        this.lockDefinitions = lockDefinitions;
    }

    public Map<String,PatternModel> getLockDefinitions() {
        return lockDefinitions;
    }
}
