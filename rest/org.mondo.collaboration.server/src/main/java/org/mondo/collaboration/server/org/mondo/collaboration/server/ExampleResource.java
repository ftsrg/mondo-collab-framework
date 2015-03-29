package org.mondo.collaboration.server.org.mondo.collaboration.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/emfgit")
public class ExampleResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWorld() {
		return "Server Working!";
	}

	@POST
	@Path("/upload")
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	public void upload(@QueryParam("projectName") String projectName,
			@QueryParam("fileName") String filename, InputStream fileInputStream) {

		File projectDir = new File(Activator.serverRoot + "\\" + projectName);
		if (!projectDir.exists()) {
			projectDir.mkdir();
		}

		try {

			FileOutputStream outputStream = new FileOutputStream(
					Activator.serverRoot + "\\" + projectName + "\\" + filename);

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = fileInputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}