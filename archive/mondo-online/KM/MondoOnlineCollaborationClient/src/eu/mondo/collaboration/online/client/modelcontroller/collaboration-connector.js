window.eu_mondo_collaboration_online_client_modelcontroller_CollaborationComponent =
function() {
	var element = this.getElement();
 
    var collaborationComponent =
        new collaborationLibrary.CollaborationComponent(element);
    
    // Handle changes from the server-side
    this.onStateChange = function() {
    	if(this.getState().modelTransferIsComplete) {
	    	if(this.getState().modelDisplayIsInitialized) {
	    		collaborationComponent.setModel(this.getState().model, this.getState().positions);
	    	} else {
	    		collaborationComponent.initModelDisplay(this.getState().model);
	    	}
	    	ccReady = true;
    	}
    };
    
    var connector = this;
    collaborationComponent.addElement = function(jsonData) {
    	connector.addElement(jsonData);
    }
    collaborationComponent.editElement = function(jsonData) {
    	connector.editElement(jsonData);
    }
    collaborationComponent.deleteElement = function(jsonData) {
    	connector.deleteElement(jsonData);
    }
    collaborationComponent.publishPositions = function(jsonData) {
    	connector.publishPositions(jsonData);
    }
    collaborationComponent.moveNode = function(jsonData) {
    	connector.moveNode(jsonData);
    }
    collaborationComponent.addEdge = function(jsonData) {
    	connector.addEdge(jsonData);
    }
}; 