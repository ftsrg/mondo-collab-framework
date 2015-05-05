package org.mondo.collaboration.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;

@Path("/emfgit/collaboration")
public class CollaborationResource {
	
	private static MondoGitHandler mGit = new MondoGitHandler();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ping() {
		return "pong";
	}
	
	@GET
	@Path("branches")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBranches(@QueryParam("projectName") String projectName) {
		mGit.initGit(projectName);
		String branches = mGit.getBranches(projectName);
		ResponseBuilder response = Response.ok(branches, MediaType.APPLICATION_JSON);
		return response.build();
	}
	
	@GET
	@Path("checkout")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response checkout(@QueryParam("projectName") String projectName, @QueryParam("branchName") String branchName) {
		String branchPath = "";
		try {
			branchPath = mGit.cloneBranch(projectName, branchName);
		} catch (IOException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		} catch (GitAPIException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
		System.out.println("checking out folder " + branchPath);
		
		File modelFolder = new File(branchPath + "\\model");
		String[] models = modelFolder.list();
		if(models.length < 1) {
			return Response.status(Response.Status.NOT_FOUND).entity(new String("No models found for project [" + projectName + "]" )).build();
		}
		String modelFileName = models[0];
		File modelFile = new File(modelFolder.getAbsolutePath() + "\\" + modelFileName);
		System.out.println("Model File path: " + modelFile.getAbsolutePath());
		ResponseBuilder response = Response.ok(modelFile, MediaType.APPLICATION_OCTET_STREAM);
		response.header("filename", modelFileName);
		return response.build();
	}

	@POST
	@Path("commit")
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	public Response commit(InputStream is, @QueryParam("projectName") String projectName, @QueryParam("branchName") String branchName) {
		String modelName = "Model.ecore";
		System.out.println("commiting model: " + modelName + " in project: " + projectName + "_" + branchName);
		// TODO check permissions and merge
		String savePath =  Activator.serverRoot + projectName + "\\" + branchName + "\\model\\" + modelName;
		
		saveInputStreamToFile(is, savePath);
		try {
			//mGit.addFile("Model.ecore");
			mGit.commit("TODO assemble commit message", projectName, branchName);
			mGit.push(projectName, branchName);
		} catch (JGitInternalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok().entity("Model successfully commited.").build();
	}

	@GET
	@Path("logs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response logs(@QueryParam("projectName") String projectName, @QueryParam("branchName") String branchName) {
		try {
			return Response.ok(encodeLogs(mGit.logs(projectName, branchName))).build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void saveInputStreamToFile(InputStream streamToSave, String savePath) {
		OutputStream outputStream = null;
	 
		try {
			// read this file into InputStream
			// write the inputStream to a FileOutputStream
			outputStream = new FileOutputStream(new File(savePath));
	 
			int read = 0;
			byte[] bytes = new byte[1024];
	 
			while ((read = streamToSave.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
	 
			System.out.println("Done!");
	 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (streamToSave != null) {
				try {
					streamToSave.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					// outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	 
			}
		}
	}
	
	private void saveFile(File fileToSave, String savePath) {
		System.out.println("Saving model to path: " + savePath);
		try {
			byte[] bytes = readContentIntoByteArray(fileToSave);
			FileOutputStream fos = new FileOutputStream(savePath);
			fos.write(bytes);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private byte[] readContentIntoByteArray(File file) {
		 FileInputStream fileInputStream = null;
		 byte[] bFile = new byte[(int) file.length()];
		 try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		 }
		 catch (Exception e) {
		    e.printStackTrace();
		 }
		 return bFile;
	}
	
	// encodes ArrayList<String> logs to string
	private String encodeLogs(ArrayList<String> logs) {
		String result = "";
		for(String log : logs) {
			if(!result.equals("")) {
				result += "|" + log;
			} else {
				result += log;
			}
			
		}
		return result;
	}
}
