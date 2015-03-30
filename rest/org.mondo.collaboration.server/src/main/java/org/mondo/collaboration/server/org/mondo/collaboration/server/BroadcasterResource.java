package org.mondo.collaboration.server.org.mondo.collaboration.server;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.sse.EventOutput;
import org.glassfish.jersey.media.sse.OutboundEvent;
import org.glassfish.jersey.media.sse.SseBroadcaster;
import org.glassfish.jersey.media.sse.SseFeature;

@Singleton
@Path("/broadcast")
public class BroadcasterResource{
 
    private SseBroadcaster broadcaster = new SseBroadcaster();
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String broadcastMessage(@QueryParam("message") String message) {
        OutboundEvent.Builder eventBuilder = new OutboundEvent.Builder();
        OutboundEvent event = eventBuilder.name("message")
            .mediaType(MediaType.TEXT_PLAIN_TYPE)
            .data(String.class, message)
            .build();
 
        System.out.println("brcd");
        broadcaster.broadcast(event);
        
        
       
        
 
        return "Message '" + message + "' has been broadcast.";
    }
 
    @GET
    @Produces(SseFeature.SERVER_SENT_EVENTS)
    public EventOutput listenToBroadcast() {
    	
    	
        final EventOutput eventOutput = new EventOutput();
        boolean val=this.broadcaster.add(eventOutput);
        System.out.println("brcd2:"+val);
        return eventOutput;
    }
    
//    @GET
//    @Produces(SseFeature.SERVER_SENT_EVENTS)
//    public EventOutput getServerSentEvents() {
//    	
//    	System.out.println("SSE_Server");
//    	
//        final EventOutput eventOutput = new EventOutput();
//        new Thread(new Runnable() {
//           // @Override
//            public void run() {
//                try {
//                    for (int i = 0; i < 10; i++) {
//                        // ... code that waits 1 second
//                        final OutboundEvent.Builder eventBuilder
//                        = new OutboundEvent.Builder();
//                        eventBuilder.name("message-to-client");
//                        eventBuilder.data(String.class,
//                            "Hello world " + i + "!");
//                        final OutboundEvent event = eventBuilder.build();
//                        eventOutput.write(event);
//                    }
//                } catch (IOException e) {
//                    throw new RuntimeException(
//                        "Error when writing the event.", e);
//                } finally {
//                    try {
//                        eventOutput.close();
//                    } catch (IOException ioClose) {
//                        throw new RuntimeException(
//                            "Error when closing the event output.", ioClose);
//                    }
//                }
//            }
//        }).start();
//        return eventOutput;
//    }
}
