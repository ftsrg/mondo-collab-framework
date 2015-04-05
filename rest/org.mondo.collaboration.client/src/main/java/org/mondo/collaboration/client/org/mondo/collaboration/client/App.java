//package org.mondo.collaboration.client.org.mondo.collaboration.client;
//
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//
//import org.glassfish.jersey.media.sse.EventInput;
//import org.glassfish.jersey.media.sse.EventListener;
//import org.glassfish.jersey.media.sse.EventSource;
//import org.glassfish.jersey.media.sse.InboundEvent;
//import org.glassfish.jersey.media.sse.SseFeature;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONValue;
//import org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock.Publish;
//
///**
// * Hello world!
// *
// */
//
//
//public class App 
//{
//	
//public static String broadcastUrl="http://localhost:9090/services/broadcast";
//	
//	private static Client client;
//	static EventSource eventSource;
//	static WebTarget target;
//	static EventListener listener;
//	
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        
////client = ClientBuilder.newBuilder().register(SseFeature.class)
////				
////				.build();
////		 target = client.target(broadcastUrl);
////		eventSource = EventSource.target(target).build();
////		listener = new EventListener() {
////			public void onEvent(InboundEvent inboundEvent) {
////				
////				System.out.println("jön adat");
////				System.out.println(inboundEvent.getName() + "; "
////						+ inboundEvent.readData(String.class));
////			}
////		};
////		eventSource.register(listener, "message-to-client");
////		eventSource.open();
////		
//        
//        
//        
//        Client client = ClientBuilder.newBuilder()
//                .build();
//
//		
//		String url="http://localhost:9090/services/emfgit";
//		
//		
//		WebTarget target=client.target(url).path("/projectFiles").queryParam("projectName", "c1");
//				
//	
//		String response=	target.request(MediaType.APPLICATION_JSON)
//			.get(String.class);
//		
//		
//		JSONArray jsa=(JSONArray) JSONValue.parse(response);
//		
//		for(Object i : jsa)
//		{
//			System.out.println((String)i);
//		}
//		
//		
//		System.out.println(response.toString());
//		
//        
////		
//		System.out.println("Client Started");
//		
//		
//		
//    }
//}
