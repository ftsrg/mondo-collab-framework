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

package org.mondo.collaboration.security.lens.util.uri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Helper class for mapping workspace project locations to file system URIs.
 * @author Bergmann Gabor
 *
 */
public class URIWorkspaceMappingsHelper {

	public static void applyGlobalMappings(String rootFolderAbsolutePath, Map<String, String> projectNameToRelativePathMappings) {
		URI rootFolderURI = rootPathToAbsoluteURI(rootFolderAbsolutePath);
		for (Entry<String, String> entry : projectNameToRelativePathMappings.entrySet()) {
			final String projectName = entry.getKey();
			final String projectFolderRelativePath = entry.getValue();
			
			URI projectFolderAbsoluteURI = projectPathToAbsoluteURI(rootFolderURI, projectFolderRelativePath);
			EcorePlugin.getPlatformResourceMap().put(projectName, projectFolderAbsoluteURI);
		}
	}
	public static void applyLocalMappings(ResourceSet targetResourceSet, String rootFolderAbsolutePath, Map<String, String> projectNameToRelativePathMappings) {
		Map<URI, URI> uriMap = targetResourceSet.getURIConverter().getURIMap();
		URI rootFolderURI = rootPathToAbsoluteURI(rootFolderAbsolutePath);
		for (Entry<String, String> entry : projectNameToRelativePathMappings.entrySet()) {
			final String projectName = entry.getKey();
			final String projectFolderRelativePath = entry.getValue();
			
			URI projectFolderAbsoluteURI = projectPathToAbsoluteURI(rootFolderURI, projectFolderRelativePath);
			URI projectResourceURI = URI.createPlatformResourceURI(ensureTrailingSeparator(projectName), true);
			uriMap.put(projectResourceURI, projectFolderAbsoluteURI);
		}
	}

	public static Map<String, String> readProjectNameToRelativePathFromProperties(String propertiesPath) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		try (FileInputStream inStream = new FileInputStream(propertiesPath)) {
			prop.load(inStream);			
		}
		Map<String, String> result = new HashMap<String, String>();
		for (Entry<Object, Object> entry : prop.entrySet()) {
			result.put((String)entry.getKey(), (String)entry.getValue());
		}
		return result;
	}
	
	static URI rootPathToAbsoluteURI(String rootFolderAbsolutePath) {
		return URI.createFileURI(ensureTrailingSeparator(rootFolderAbsolutePath));
	}
	static URI projectPathToAbsoluteURI(URI rootFolderURI, final String projectFolderRelativePath) {
		URI projectFolderRelativeURI = rootPathToAbsoluteURI(projectFolderRelativePath);
		URI projectFolderAbsoluteURI = projectURIToAbsoluteURI(rootFolderURI, projectFolderRelativeURI);
		return projectFolderAbsoluteURI;
	}
	
	static URI projectURIToAbsoluteURI(URI rootFolderURI, URI projectFolderRelativeURI) {
		URI projectFolderAbsoluteURI = projectFolderRelativeURI.resolve(rootFolderURI);
		
		// check back the confinement
		URIConfinementHelper.uriToRelativePathConfinementChecked(
				projectFolderAbsoluteURI, rootFolderURI, false, "Project path");
		
		return projectFolderAbsoluteURI;
	}

	private static String ensureTrailingSeparator(String folderPath) {
		if (folderPath==null)
			return File.separator;
		else if (folderPath.endsWith(File.separator))
			return folderPath;
		else return folderPath + File.separator;
	}

	
}
