package org.mondo.collaboration.offline.management.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.thrift.TException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import uk.ac.york.mondo.integration.api.GoldRepoNotFound;
import uk.ac.york.mondo.integration.api.OfflineCollaboration.Iface;
import uk.ac.york.mondo.integration.api.OfflineCollaborationInternalError;
import uk.ac.york.mondo.integration.api.UnauthorizedRepositoryOperation;
import uk.ac.york.mondo.integration.api.utils.APIUtils.ThriftProtocol;

/*******************************************************************************
 * Copyright (c) 2016 Budapest University of Technology and Economics.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/
public class OfflineCollaborationHandler implements Iface {


	public static String getScriptsFolder() {
		String retBundle = Activator.getContext().getBundle().getBundleContext().getProperty("mondo.scripts.folder");
		String retSystem = System.getProperty("mondo.workspace.folder");
		return retBundle == null ? retSystem : retBundle;
	}
	

	@Override
	public void regenerateFrontRepositories(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("regenerateFrontRepositories call");
		System.out.println("\tfor repo " + goldRepoURL);
		System.out.println("UserPrincipal from the manager: "+ SecurityUtils.getSubject().getPrincipal());
		
		
		try {
			
			String scriptsFolder = getScriptsFolder();
			
			ProcessBuilder builder1 = new ProcessBuilder(scriptsFolder + "/wipe-repositories.sh", "--force");
			/* Process process1 = */ builder1.start();
			
			ProcessBuilder builder2 = new ProcessBuilder(scriptsFolder + "/init-repositories.sh", "--apache2");
			/* Process process2 = */ builder2.start();
			
		} catch (IOException e) {
			throw new OfflineCollaborationInternalError(e.getMessage());
		}
		
	}

	@Override
	public String getMyFrontRepositoryURL(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("getMyFrontRepositoryURL call");
		System.out.println("\tfor repo " + goldRepoURL);
		String frontRepoURL = null;
		try {
			String userName = "";//((UserPrincipal) SecurityUtils.getSubject().getPrincipal()).getName();
			String scriptsFolder = getScriptsFolder();
			ProcessBuilder processBuilder = new ProcessBuilder(scriptsFolder + "/get-front-repository.sh", userName);
			Process p = processBuilder.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			frontRepoURL = br.readLine();
			System.out.println(frontRepoURL);
		
		} catch (IOException e) {
			throw new OfflineCollaborationInternalError(e.getMessage());
		}
		
		String rapPath = getRAPPathFromExtensionRegistry();
		
		return frontRepoURL + "|" + rapPath;
	}

	private String getRAPPathFromExtensionRegistry() {

		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint poi;

		String rapPath = null;

		if (reg != null) {
			poi = reg.getExtensionPoint("org.eclipse.emf.ecp.makeithappen.application.sample.rap.entrypoint");
			if (poi != null) {
				IExtension[] exts = poi.getExtensions();

				for (IExtension ext : exts) {
					IConfigurationElement[] els = ext.getConfigurationElements();
					for (IConfigurationElement el : els) {
						if (el.getName().equals("path")) {
							rapPath = el.getValue();
						}
					}
				}
			}
		}
		return rapPath;
	}
	@Override
	public List<String> listGoldRepositories()
			throws UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("ListGoldRepositories");
		return null;
	}
	@Override
	public String getOnlineCollaborationURL(String goldRepoURL)
			throws GoldRepoNotFound, UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("getOnlineCollaborationURL");
		return null;
	}
	

}