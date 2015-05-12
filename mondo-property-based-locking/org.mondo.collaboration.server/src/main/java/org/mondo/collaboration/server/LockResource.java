package org.mondo.collaboration.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


@Path("/emfgit")
public class LockResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWorld() {
		System.out.println("hello");
		return "Server Working!";
	}

	@POST
	@Path("/upload")
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	public void upload(@QueryParam("projectID") String projectID,
			@QueryParam("fileName") String filename, InputStream fileInputStream) {

		
		File projectDir = new File(Activator.serverRoot + "\\" + projectID);
		if (!projectDir.exists()) {
			projectDir.mkdir();
		}

		try {

			FileOutputStream outputStream = new FileOutputStream(
					Activator.serverRoot + "\\" + projectID + "\\" + filename);

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = fileInputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			
			System.out.println("projectid:"+projectID+" filename:"+filename+" uploaded");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	@GET
	@Path("/download")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response downloadFile(@QueryParam("projectID") String projectID,
			@QueryParam("filename") String fileName)
	{
		File projectDir = new File(Activator.serverRoot + "\\" + projectID+"\\"+fileName);
		
		 ResponseBuilder response = Response.ok((Object) projectDir);
		        response.header("Content-Disposition", "attachment; filename=\""+fileName+"\"");
		         return response.build();
	}
	
	@GET
	@Path("/projectFiles")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response downloadFile(@QueryParam("projectID") String projectID)
	{
		File projectDir = new File(Activator.serverRoot + "\\" + projectID);
		
			
		File[] files=projectDir.listFiles();
		
		JSONObject filesDate=new JSONObject();
		
		for (File file : files) {
			
			filesDate.put(file.getName(),file.lastModified()) ;
		}
		
		  System.out.print(filesDate.toJSONString());
		
		  ResponseBuilder responseBuilder=Response.ok();
		
		return responseBuilder.entity(filesDate.toJSONString()).build();
	}
	
	
	

}