window.com_mondo_online_collaborationcontroller_CollaborationComponent =
function() {
	var element = this.getElement();
 
    var collaborationComponent =
        new collaborationLibrary.CollaborationComponent(element);
    
    // Handle changes from the server-side
    this.onStateChange = function() {
    	collaborationComponent.setModel(this.getState().model);
    };
    
    var connector = this;
    collaborationComponent.editElement = function(jsonData) {
    	connector.editElement(jsonData);
    }
    
    this.loadModel();
};