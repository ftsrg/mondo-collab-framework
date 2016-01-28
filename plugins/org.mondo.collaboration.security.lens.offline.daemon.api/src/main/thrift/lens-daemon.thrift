namespace java org.mondo.collaboration.security.lens.offline.daemon.api

exception LensInternalError {
	1: string errorMessage
}

exception LensIllegalParametrization {
	1: string errorMessage
}

exception LensDenied {
	1: string problemDescription
}

service OfflineLensLocalDaemon {
	void invokeOfflineLens(1: list<string> cliArguments)
		throws (
			1: LensIllegalParametrization err1,
			2: LensInternalError err2,
			3: LensDenied err3
		)
}

