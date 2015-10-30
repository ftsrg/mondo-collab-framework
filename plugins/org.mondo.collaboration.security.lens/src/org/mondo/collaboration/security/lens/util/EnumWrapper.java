package org.mondo.collaboration.security.lens.util;

import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;

public class EnumWrapper {

    public static OperationKind[] myValues() {
        return OperationKind.values();
    }
    
}
