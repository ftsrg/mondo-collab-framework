/*******************************************************************************
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.context.keys;

import org.mondo.collaboration.security.lens.arbiter.Asset;
import org.mondo.collaboration.security.lens.arbiter.Asset.AttributeAsset;
import org.mondo.collaboration.security.lens.arbiter.Asset.ObjectAsset;
import org.mondo.collaboration.security.lens.arbiter.Asset.ReferenceAsset;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;

/**
 * Tuples of ((asset tuple), role, judgement).
 * @author Bergmann Gabor
 *
 */
public class SecurityJudgementKey implements CollabLensInputKey {

	private OperationKind op;
	private Class<? extends Asset> assetType;
	
	public SecurityJudgementKey(OperationKind op, Class<? extends Asset> assetType) {
		super();
		this.op = op;
		this.assetType = assetType;
	}

	@Override
	public String getPrettyPrintableName() {
		return getStringID();
	}

	@Override
	public String getStringID() {
		return op.name()+"Judgement$"+assetType.getSimpleName();
	}

	@Override
	public int getArity() {
		// +2 for the role and the judgement
		if (ObjectAsset.class.equals(assetType))
			return 1+2;
		else if (ReferenceAsset.class.equals(assetType))
			return 3+2;
		else if (AttributeAsset.class.equals(assetType))
			return 2+2;
		throw new RuntimeException();
	}

	@Override
	public boolean isEnumerable() {
		return true;
		// TODO make ::WRITE non-enumerable?
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assetType == null) ? 0 : assetType.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SecurityJudgementKey))
			return false;
		SecurityJudgementKey other = (SecurityJudgementKey) obj;
		if (assetType == null) {
			if (other.assetType != null)
				return false;
		} else if (!assetType.equals(other.assetType))
			return false;
		if (op != other.op)
			return false;
		return true;
	}
	
	
	
}
