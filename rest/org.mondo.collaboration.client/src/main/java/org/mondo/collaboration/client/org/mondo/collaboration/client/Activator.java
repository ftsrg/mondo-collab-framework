package org.mondo.collaboration.client.org.mondo.collaboration.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.media.sse.EventInput;
import org.glassfish.jersey.media.sse.EventListener;
import org.glassfish.jersey.media.sse.EventSource;
import org.glassfish.jersey.media.sse.InboundEvent;
import org.glassfish.jersey.media.sse.SseFeature;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static String lockDirName = "locks";

	public static String broadcastUrl="http://localhost:9090/services/broadcast";
	
	private static Client client;
	EventSource eventSource;
	WebTarget target;
	EventListener listener;
	
	public void start(BundleContext context) throws Exception {

		client = ClientBuilder.newBuilder()
				
				.build();
		
//		 target = client.target(broadcastUrl);
//		eventSource = EventSource.target(target).build();
//		listener = new EventListener() {
//			public void onEvent(InboundEvent inboundEvent) {
//				
//				System.out.println("jön adat");
//				System.out.println(inboundEvent.getName() + "; "
//						+ inboundEvent.readData(String.class));
//			}
//		};
//		eventSource.register(listener, "message-to-client");
//		eventSource.open();
//		
		
		System.out.println("Client Started");

	}

	public void stop(BundleContext context) throws Exception {
		eventSource.close();

	}
	
	public static Client getClient() {
		return client;
	}

}
