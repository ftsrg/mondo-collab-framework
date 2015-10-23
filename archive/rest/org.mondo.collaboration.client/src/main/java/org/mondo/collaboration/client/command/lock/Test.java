package org.mondo.collaboration.client.command.lock;
//package org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//		
//		try{
//		Client client = Client.create();
//		 
//		client.setChunkedEncodingSize(1024);
//		
//		WebResource webResource = client
//		   .resource("http://localhost:9090/services/hello23/upload");
// 
//		File fileToUpload=new File("C:\\setup.log");
//		InputStream stream=new FileInputStream(fileToUpload);
//		
//		
//		 String contentDisposition = "test; filename=\"" + fileToUpload.getName() + "\"";
//		    ClientResponse response = webResource
//		            .type("application/octet-stream").header("Content-Disposition", contentDisposition)
//		            .post(ClientResponse.class, stream);
//		
//		System.out.println("Try to publish");
//		System.out.println(response.toString());
//		}catch(Exception e)
//		{
//			
//		}
//
//	}
//
//}
