package org.mondo.collaboration.online.core;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

import com.google.common.collect.Lists;

public class StorageAccessSvn extends StorageAccess {

	private static final String INTERNAL_ERROR_DURING_LOGIN = "Internal error during login";

	public StorageAccessSvn(String username, String password) throws Exception {
		super(username, password);
		internalEiq = URI.createFileURI(internalCheckoutFile(getEiqFile()));
		internalMacl = URI.createFileURI(internalCheckoutFile(getMaclFile()));
	}

	public static final String SVN_LIST_COMMAND = "svn list %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CHECKOUT_COMMAND = "svn checkout %s %s --depth empty --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CLEANUP_COMMAND = "svn cleanup --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UPDATE_COMMAND = "svn up %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOG_COMMAND = "svn log %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOCK_COMMAND = "svn lock %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UNLOCK_COMMAND = "svn unlock %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_COMMIT_COMMAND = "svn commit %s -m \"%s\" --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_STATUS_COMMAND = "svn status %s --username=%s --password=%s --non-interactive --no-auth-cache";

	public static final String SVN_DEFAULT_MESSAGE = "Committed by %s at %s";
	public static final String ERROR_SVN_LOGIN = "Authentication failed";
	public static final String ERROR_SVN_PREFIX = "svn: E";

	private Logger logger = Logger.getLogger(StorageAccessSvn.class);
	private URI internalEiq;
	private URI internalMacl;

	@Override
	public String login() {
		logger.info("Login request sent in name of " + username);
		try {
			ExecutionResponse response = internalLoginProcess();
			String errorList = response.getErrorList().stream().filter(msg -> msg.startsWith(ERROR_SVN_PREFIX))
					.reduce("", new BinaryOperator<String>() {

						@Override
						public String apply(String arg0, String arg1) {
							return arg0 + "\n" + arg1;
						}
					});
			if (errorList != null && !errorList.trim().isEmpty()) {
				return errorList;
			}
			if (response.getResponseList().contains(ERROR_SVN_LOGIN)) {
				logger.error("-> Response: " + ERROR_SVN_LOGIN);
				return ERROR_SVN_LOGIN;
			}
		} catch (Exception e) {
			logger.error("-> Response: "+INTERNAL_ERROR_DURING_LOGIN , e);
			return INTERNAL_ERROR_DURING_LOGIN;
		}
		logger.info("-> Response: OK");
		return null;
	}

	private ExecutionResponse internalLoginProcess() throws Exception {
		return internalExecuteProcess(String.format(SVN_LOG_COMMAND, getRepository(), getUsername(), getPassword()));
	}

	/**
	 * Explores the repository in context of the path.
	 * 
	 * @param path
	 *            in the repository
	 * @throws Exception
	 */
	@Override
	public Collection<StorageModelNode> explore(StorageModel model, String path, StorageModelNode parent, String gold) {
		List<StorageModelNode> nodes = new ArrayList<StorageModelNode>();
		Collection<String> entries = Lists.newArrayList();
		try {
			ExecutionResponse response = internalExecuteProcess(String.format(SVN_LIST_COMMAND, path, getUsername(), getPassword()));
			entries.addAll(response.getResponseList());
		} catch (Exception e) {
			logger.error(e, e);
		}

		for (String entry : entries) {
			if (entry.endsWith("/")) {
				entry = entry.substring(0, entry.length() - 1);
				nodes.add(new StorageModelNode(model, entry, path + "/" + entry, NodeType.Folder, parent, this,
						gold + "/" + entry));
			}
			if (entry.endsWith(getExtension())) {
				nodes.add(new StorageModelNode(model, entry, path + "/" + entry, NodeType.Model, parent,
						this, gold + "/" + entry));
			}
		}
		return nodes;
	}

	@Override
	public URI startSession(String path) throws Exception {
		Assert.isLegal(path.endsWith(getExtension()));
		
		String filePath = internalCheckoutFile(path);
		URI fileURI = URI.createFileURI(filePath);
		
		if(LensSessionManager.getUriSet().contains(fileURI))
			return fileURI;
		
		internalLockFile(filePath);
		return fileURI;
	}

	private void internalLockFile(String path) {
		URI fullUri = URI.createFileURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");

		internalUnlockFile(file, folder);
		
		internalExecuteProcess(String.format(SVN_LOCK_COMMAND, file, getUsername(), getPassword()), new String[] {},
				new File(folder));
	}

	private String internalCheckoutFile(String path) throws Exception {
		return internalCheckoutFile(path, true);
	}

	private String internalCheckoutFile(String path, boolean doCheckout) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);

		if (doCheckout) {
			if (!new File(temp).exists())
				internalExecuteProcess(String.format(SVN_CHECKOUT_COMMAND, folder, temp, getUsername(), getPassword()),
						new String[] {}, new File(getTempFolder()));
			internalExecuteProcess(String.format(SVN_UPDATE_COMMAND, file, getUsername(), getPassword()),
					new String[] {}, new File(temp));
		}
		return temp + file;
	}

	@Override
	public void finishSession(String path) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		internalFinishSession(path, String.format(SVN_DEFAULT_MESSAGE, getUsername(), dateFormat.format(date)));
	}

	protected String internalFinishSession(String path, String msg) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);

		internalExecuteProcess(String.format(SVN_COMMIT_COMMAND, file, msg, getUsername(), getPassword()),
				new String[] {}, new File(temp));
		internalUnlockFile(file, temp);

		return "Success";
	}

	private void internalUnlockFile(String file, String temp) {
		internalExecuteProcess(String.format(SVN_UNLOCK_COMMAND, file, getUsername(), getPassword()), new String[] {},
				new File(temp));
	}

	protected String replaceLast(String original, String from, String to) {
		int lastIndexOf = original.lastIndexOf(from);
		return new StringBuilder(original).replace(lastIndexOf, lastIndexOf + from.length(), to).toString();
	}

	protected String replaceFirst(String original, String from, String to) {
		int firstIndexOf = original.indexOf(from);
		return new StringBuilder(original).replace(firstIndexOf, firstIndexOf + from.length(), to).toString();
	}

	@Override
	protected URI getInternalEiqFile() {
		return internalEiq;
	}

	@Override
	protected URI getInternalMaclFile() {
		return internalMacl;
	}

	@Override
	public void commit(String path, String msg) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(fullUri.toFileString(), file, "");

		internalExecuteProcess(String.format(SVN_COMMIT_COMMAND, file, msg, getUsername(), getPassword()),
				new String[] {}, new File(folder));
	}

}
