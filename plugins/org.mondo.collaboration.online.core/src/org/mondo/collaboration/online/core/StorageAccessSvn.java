package org.mondo.collaboration.online.core;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

import com.google.common.collect.Lists;
import com.google.common.io.Files;

public class StorageAccessSvn extends StorageAccess {

	private static final String INTERNAL_ERROR_DURING_LOGIN = "Internal error during login";

	public StorageAccessSvn(String username, String password, String repository) throws Exception {
		super(username, password, repository);
		internalEiq = URI.createFileURI(internalCheckoutFile(getEiqFile(), true));
		internalMacl = URI.createFileURI(internalCheckoutFile(getMaclFile(), true));
		internalMpbl = URI.createFileURI(internalCheckoutFile(getMpblFile(), true));
	}

	public static final String SVN_LIST_COMMAND = "svn list %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CHECKOUT_COMMAND = "svn checkout %s %s --depth empty --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CLEANUP_COMMAND = "svn cleanup --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UPDATE_COMMAND = "svn up %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOG_COMMAND = "svn log %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOCK_COMMAND = "svn lock %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UNLOCK_COMMAND = "svn unlock %s --force --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_COMMIT_COMMAND = "svn commit %s  --encoding utf8 -F svn-commit.tmp --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_STATUS_COMMAND = "svn status %s --username=%s --password=%s --non-interactive --no-auth-cache %s";
	public static final String SVN_REVERT_COMMAND = "svn revert %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String AWK_PRINT_COLUMN1 = "awk '{print $1}'";

	public static final String SVN_DEFAULT_MESSAGE = "Committed by %s at %s";
	public static final String ERROR_SVN_LOGIN = "Authentication failed";
	public static final String ERROR_SVN_PREFIX = "svn: E";

	private Logger logger = Logger.getLogger(StorageAccessSvn.class);
	private URI internalEiq;
	private URI internalMacl;
	private URI internalMpbl;

	@Override
	public String login() {
		logger.info("Login request sent in name of " + username);
		if(!usersProperties.containsKey(username)) {
			logger.error("-> Response: User not exists in the property file.");
			return ERROR_SVN_LOGIN;
		}
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
		return internalExecuteProcess(String.format(SVN_LOG_COMMAND, repository_structure + "/" + usersProperties.getProperty(getUsername()), getUsername(), getPassword()));
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
			ExecutionResponse response = internalExecuteProcess(String.format(SVN_LIST_COMMAND, path, admin_username, admin_password));
			entries.addAll(response.getResponseList());
		} catch (Exception e) {
			logger.error(e, e);
		}

		for (String entry : entries) {
			if (entry.endsWith("/")) {
				entry = entry.substring(0, entry.length() - 1);
				nodes.add(new StorageModelNode(model, entry, (path.endsWith("/") ? path : path + "/") + entry, NodeType.Folder, parent, this,
						(gold.endsWith("/") ? gold : gold + "/") + entry));
				continue;
			}
			if (endsWith(entry, getExtensions())) {
				nodes.add(new StorageModelNode(model, entry, (path.endsWith("/") ? path : path + "/") + entry, NodeType.Model, parent,	this,
						(gold.endsWith("/") ? gold : gold + "/") + entry));
			}
		}
		return nodes;
	}

	@Override
	public URI startSession(String path) throws Exception {
		Assert.isLegal(endsWith(path, getExtensions()));
		String filePath = internalCheckoutFile(path);
		URI fileURI = URI.createFileURI(filePath);

		if(LensSessionManager.getUriSet().contains(fileURI))
			return fileURI;

		internalLockFile(filePath);
		return fileURI;
	}

	private static boolean endsWith(String entry, String[] possibleEnds) {
		for (String end : possibleEnds) {
			if(entry.endsWith(end))
				return true;
		}
		return false;
	}

	private void internalLockFile(String path) {
		internalLockFile(path, admin_username, admin_password, true);
	}
	private void internalLockFile(String path, String username, String password, boolean unlock) {
		URI fullUri = OSValidator.isWindows() ? URI.createFileURI(path) : URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = "";
		if(fullUri.isFile())
			folder = replaceLast(fullUri.toFileString(), file, "");
		else {
			folder = replaceLast(fullUri.toString(), file, "");
			if(folder.startsWith(getRepository()))
				folder = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);
		}

		if(unlock)
			internalUnlockFile(file, folder);

		internalExecuteProcess(String.format(SVN_LOCK_COMMAND, file, admin_username, admin_password), new String[] {}, new File(folder));
	}

	private String internalCheckoutFile(String path) throws Exception {
		return internalCheckoutFile(path, true);
	}

	private String internalCheckoutFile(String path, boolean doCheckout) {
		URI fullUri = OSValidator.isWindows() ? URI.createFileURI(path) : URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);

		if (doCheckout) {
			if (!new File(temp).exists()) {
				internalExecuteProcess(String.format(SVN_CHECKOUT_COMMAND, folder, replaceFirst(temp, getTempFolder(), ""), admin_username, admin_password),
						new String[] {}, new File(getTempFolder()));
				internalExecuteProcess(String.format(SVN_UNLOCK_COMMAND, "", admin_username, admin_password),
						new String[] {}, new File(temp));
				internalExecuteProcess(String.format(SVN_CLEANUP_COMMAND, admin_username, admin_password),
						new String[] {}, new File(temp));
			}
			internalExecuteProcess(String.format(SVN_UNLOCK_COMMAND, file, admin_username, admin_password),
					new String[] {}, new File(temp));
			internalExecuteProcess(String.format(SVN_UPDATE_COMMAND, file, admin_username, admin_password),
				new String[] {}, new File(temp));
		}
		return (temp.endsWith(File.separator) ? temp : temp + File.separator) + file;
	}

	@Override
	public void finishSession(URI goldConfimentUri, String ownerUsername, String ownerPassword) {
		internalFinishSession(goldConfimentUri, ownerUsername, ownerPassword);
	}

	protected String internalFinishSession(URI goldConfimentUri, String ownerUsername, String ownerPassword) {
		String file = goldConfimentUri.lastSegment();
		String folder = replaceLast(goldConfimentUri.toFileString(), file, "");

		internalUnlockFile(file, folder, admin_username, admin_password);

		return "Success";
	}

	private void internalUnlockFile(String file, String folder) {
		internalUnlockFile(file, folder, admin_username, admin_password);
	}

	private void internalUnlockFile(String file, String folder, String username, String password) {
		internalExecuteProcess(String.format(SVN_UNLOCK_COMMAND, file, username, password), new String[] {},
				new File(folder));
	}

	protected String replaceLast(String original, String from, String to) {
		int lastIndexOf = original.lastIndexOf(from);
		return new StringBuilder(original).replace(lastIndexOf, lastIndexOf + from.length(), to).toString();
	}

	protected String replaceFirst(String original, String from, String to) {
		int firstIndexOf = original.indexOf(from);
		if(firstIndexOf == -1) {
			return original;
		}
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
	protected URI getInternalMpblFile() {
		return internalMpbl;
	}

	@Override
	public ExecutionResponse commit(String path, String msg, String ownerUsername, String ownerPassword) {
		URI fullUri = OSValidator.isWindows() ? URI.createFileURI(path) : URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = "";
		if(fullUri.isFile())
			folder = replaceLast(fullUri.toFileString(), file, "");
		else {
			folder = replaceLast(fullUri.toString(), file, "");
			if(folder.startsWith(getRepository()))
				folder = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);
		}


		internalUnlockFile(file, folder, admin_username, admin_password);

		File svnCommit = Paths.get(folder, "svn-commit.tmp").toFile();
		try {
			svnCommit.createNewFile();
			CharSequence message = msg;
			Files.write(message, svnCommit, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExecutionResponse response = internalExecuteProcess(String.format(SVN_COMMIT_COMMAND, file, admin_username, admin_password),
				new String[] {}, new File(folder));

		svnCommit.delete();

		internalLockFile(path, admin_username, admin_password, false);
		return response;
	}

	@Override
	public ExecutionResponse commit(String path, String msg, OnlineLeg leg) {
		return commit(path, msg, admin_username, admin_password);
	}

	@Override
	public FileStatus checkFileStatus(String path) throws Exception {
		URI fullUri = OSValidator.isWindows() ? URI.createFileURI(path) : URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);

		if(!new File(temp + file).exists()) {
			return FileStatus.Normal;
		}

		String executor = OSValidator.isWindows() ? "bash" : "/bin/sh";
		
		String[] cmd = {
				executor,
				"-c",
				String.format(SVN_STATUS_COMMAND, file, getUsername(), getPassword(), "| " + AWK_PRINT_COLUMN1)
				};

		ExecutionResponse response = internalExecuteProcess(cmd, new String[] {}, new File(temp));

		if(response.getResponseList().contains("M"))
			return FileStatus.Modified;

		return FileStatus.Normal;
	}

	@Override
	public ExecutionResponse revert(String path, String username, String password) {
		URI fullUri = OSValidator.isWindows() ? URI.createFileURI(path) : URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);

		ExecutionResponse response = internalExecuteProcess(String.format(SVN_REVERT_COMMAND, file, admin_username, admin_password),
				new String[] {}, new File(temp));

		return response;
	}

}
