package eu.mondo.collaboration.online.client.modelcontroller;


//@ClientEndpoint
public class ModelController {
	
	//private Session session;
	
	private CollaborationComponent cc;
	
	/*
	@OnOpen
    public void onOpen(Session session) {
		this.session = session;
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
        System.out.println("Max message length: "  + session.getMaxTextMessageBufferSize());
    }
    */
	/*
    @OnMessage
    public void processMessage(String message) {
    	try {
    		System.out.println("recieved model: " + message);
    		System.out.println("Model length: " + message.length());
			this.cc.setModel(new JSONObject(message));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
     
    @OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
    
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket by client");
        this.session = null;
    }
    
    public void setCollaborationComponent(CollaborationComponent newCC) {
    	this.cc = newCC;
    }
    
    public void updateModel(String model) {
        System.out.println("Sending message to endpoint: " + model);
        try {
			this.session.getBasicRemote().sendText(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/
}
