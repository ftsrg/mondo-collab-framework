var collaborationLibrary = collaborationLibrary || {};
collaborationLibrary.model = null;

collaborationLibrary.CollaborationComponent = function(element) {
	element.innerHTML = 
		"<div id=\"workspace\" " +
			"style=\"width: 800px; " +
			"height: 800px; " +
			"margin: 20px; \">" +
		"</div>";
	
	var cc = this;
	this.setModel = function(modelString) {
		if(!modelString) {
			return false;
		}

		var model = JSON.parse(modelString);
		var nodes = model.nodes;
		var edges = model.edges;
		
		var container = document.getElementById('workspace');
		var data = {
		    nodes: nodes,
		    edges: edges
		};
		var options = {
			dataManipulation: {
			      enabled: true,
			      initiallyVisible: true
			},
	        onEdit: function(data,callback) {
	        	alert("edit yay");
	        	for(var i in model.nodes) {
	        		if(model.nodes[i].id == data.id) {
	    	    		cc.editElement(JSON.stringify(model.nodes[i]));
	        		}
	        	}
	        	//editElement(JSON.stringify(data));
	        },
		    nodes: {
		        shape: 'box'	
		    }
		};
		network = new vis.Network(container, data, options);
		
		network.on('select', function(properties) {
			//document.getElementById('info').innerHTML += 'selection: ' + JSON.stringify(properties) + '<br>';
		});
	}

};
