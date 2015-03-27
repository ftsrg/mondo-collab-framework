package org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;







public class Publish implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	public void test()
	{
		
		
		try {
			 
			Thread .currentThread ().setContextClassLoader(this.getClass().getClassLoader()); 
			
			//ServiceFinder.setIteratorProvider(new Buscador());
			Client client = ClientBuilder.newClient();
			
			
	 
			//client.setChunkedEncodingSize(1024);
			
			
			 JerseyClient jclient = JerseyClientBuilder.createClient();
			
//			JerseyWebTarget a = jclient.target("http://localhost:9090/services/hello23");
//			 
//			a.request(MediaType.APPLICATION_OCTET_STREAM).p
//		
			String url="http://localhost:9090/services/hello23";
		
			
			WebTarget target=client.target(url);
			
			Response se=target.request(MediaType.APPLICATION_JSON).get();
			
			//target.request().
			
		//	target.path("/upload").
			
			System.out.println("Output from Server .... \n");
			System.out.println(se.toString());
			
//			WebResource webResource = client
//			   .resource(url);	
//	 
			File fileToUpload=new File("C:\\setup.log");
			InputStream stream=new FileInputStream(fileToUpload);
			
			 String contentDisposition = "test; filename=\"" + fileToUpload.getName() + "\"";
			 
			 Entity<File> fe=Entity.entity(fileToUpload, MediaType.APPLICATION_OCTET_STREAM);
			 
			 
				 url="http://localhost:9090/services/hello23/upload";
				
				
				 target=client.target(url);
			 
			 
		Response se2=	target.request(MediaType.APPLICATION_OCTET_STREAM)
			.post(fe);
		
		System.out.println("Output from Server .... \n");
		System.out.println(se2.toString());
			
//		
//			    ClientResponse response = webResource
//			            .type(MediaType.APPLICATION_OCTET_STREAM).header("Content-Disposition", contentDisposition)
//			            .post(ClientResponse.class, stream);
//			
			 //   webResource.type(type)
//			System.out.println("Try to publish");
//			System.out.println(response.toString());
			
			//MediaType.APPLICATION_JSON
//			ClientResponse response = webResource.accept(MediaType.APPLICATION_OCTET_STREAM)
//	                   .get(ClientResponse.class);
//			
//			if (response.getStatus() != 200) {
//			   throw new RuntimeException("Failed : HTTP error code : "
//				+ response.getStatus());
//			}
//	 
			//String output = response.getEntity(String.class);
			
		//	webResource.a
	 
//			System.out.println("Output from Server .... \n");
//			System.out.println(response.toString());
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			
		//	Client client=new 
			
			//System.out.println(getProjectsLockFiles());
			
			
//			 URI uri = URI.create("ws://localhost:8080/events/");
//
//		        try
//		        {
//		            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
//
//		            try
//		            {
//		                // Attempt Connect
//		                Session session = container.connectToServer(EventSocket.class,uri);
//		                // Send a message
//		                session.getBasicRemote().sendText("Hello");
//		          //  session.getBasicRemote().s
//		                // Close session
//		                session.close();
//		            }
//		            finally
//		            {
//		                // Force lifecycle stop when done with container.
//		                // This is to free up threads and resources that the
//		                // JSR-356 container allocates. But unfortunately
//		                // the JSR-356 spec does not handle lifecycles (yet)
//		                if (container instanceof LifeCycle)
//		                {
//		                    ((LifeCycle)container).stop();
//		                }
//		            }
//		        }
//		        catch (Throwable t)
//		        {
//		            t.printStackTrace(System.err);
//		        }
			
			
			
			
			
			
			test();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//MondoOfflineClient client = Activator.getClient();
//			MondoOfflineClient client = new MondoOfflineClient(new URI(
//					"ws://localhost:8080/mondo-server/"));
//
//			 ArrayList<IFile> lockFiles = getProjectsLockFiles();
//			 
//			 for(IFile file : lockFiles)
//			 {
//					MessageToServer msg = new MessageToServer();
//					msg.setPrimitive(OfflineCollaborationPrimitive.LOCK_PUBLISH);
//					msg.setInfo(file.getFullPath().toString());
//					msg.setProjectName(getProjectName());
//					client.sendMessage(msg);
//					
//					
//					String filePathToSend=file.getFullPath().toFile().getAbsolutePath();
//					//client.sendFile(filePathToSend);
//			 }

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean isEnabled() {

		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public ArrayList<IFile> getProjectsLockFiles() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);
				
				IPath path = project.getFullPath();
				IResource folder=project.getFolder("Locks");
				
				return getAllFile(folder);
				
				//return path.toString();

			}
		}
		
		return null;
	}
	
	
	ArrayList<IFile> files;
	public ArrayList<IFile> getAllFile(IResource item)
	{
		 files=new ArrayList<IFile>();
		
		 travelResources(item);
		
		 return files;
	}
	
	private void travelResources(IResource resource)
	{
		
		if(resource.getType()==IResource.FILE)
		{
			files.add((IFile) resource);
			System.out.println(resource.getFullPath());
		}
		else if(resource.getType()==IResource.FOLDER)
		{
			try {
				for(IResource item : ((IFolder) resource).members()  )
				{
					travelResources(item);
				}
			} catch (CoreException e) {
				
				//silently fail
				e.printStackTrace();
			}
		}
	}
	
	
	public String getProjectName() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);
				
				return project.getName();
			}
		}
		
		return null;
	}

}
