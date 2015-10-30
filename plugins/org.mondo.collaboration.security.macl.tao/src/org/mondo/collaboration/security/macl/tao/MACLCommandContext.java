package org.mondo.collaboration.security.macl.tao;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;

import runtimePatterns.PatternInstance;

public class MACLCommandContext {
	public static final String ID = "org.mondo.collaboration.security.macl.tao.generate.context";
	public final IPath iPath;
	public final PatternInstance pattern;
	public final EPackage ePack;

	public MACLCommandContext(EPackage ePack, PatternInstance pattern, IPath iPath) {
		this.ePack = ePack;
		this.pattern = pattern;
		this.iPath = iPath;
	}
}
