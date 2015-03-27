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
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.sse.EventOutput;
import org.glassfish.jersey.media.sse.OutboundEvent;
import org.glassfish.jersey.media.sse.SseFeature;
 
@Path("/hello23")
public class ExampleResource {
	
	
@GET
@Produces(MediaType.APPLICATION_JSON)
public String helloWorld() {
	System.out.println("okkke");
return "Hello World";
}

@POST
@Path("/upload")
@Consumes(MediaType.APPLICATION_OCTET_STREAM)
public void uploadAttachment( InputStream attachmentInputStream) {
    
	System.out.println("UPLOAD");
	//System.out.println(attachmentName);
	
	
	try {
		System.out.println(attachmentInputStream.available());
		
		FileOutputStream outputStream = new FileOutputStream(new File("C:\\tmp\\testAAA.txt"));
		
		int read = 0;
		byte[] bytes = new byte[1024];
 
		while ((read = attachmentInputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}
 
} 