var collaborationLibrary = collaborationLibrary || {};
collaborationLibrary.model = null;

collaborationLibrary.CollaborationComponent = function(element) {
	var editDialog = $('<div/>').attr('id', 'editDialog')
		.append($('<span/>').text("Edit element"));
	var editPropertiesTable = $('<table />')
		.attr('id', 'editPropertiesTable');
	var saveButton = $('<input/>')
		.attr('type', 'button')
		.attr('value', 'save')
		.attr('id', 'saveButton');
	var cancelButton = $('<input/>')
		.attr('type', 'button')
		.attr('value', 'cancel')
		.attr('id', 'cancelButton');
	
	editDialog.append(
		editPropertiesTable,
		cancelButton,
		saveButton
	);
	
	element.innerHTML = $('<div />').append(
		$('<div />').attr('id', 'workspace'),
		$('<div />').attr('id', 'editDialogContainer')
			.append(editDialog)
	).html();
	
	// function to find a node by id in an array of nodes
	
	var cc = this;
	
	this.setModel = function(model) {
		if(!model) {
			return false;
		}

		cc.model = model;
		var nodes = model.nodes;
		var edges = model.edges;
		
		var container = document.getElementById('workspace');
		var data = {
		    nodes: nodes,
		    edges: edges
		};
		var options = {
			keyboard: true,
			smoothCurves: false,
			dataManipulation: {
			      enabled: true,
			      initiallyVisible: true
			},
			onAdd: function(data,callback) {
		        var newNode = {
		        	id: data.id,
		        	label: "New element",
		        	x: data.x,
		        	y: data.y,
		        	SomeAttribute: ""		        	
		        }; 
		        cc.addElement(newNode);
		    },
	        onEdit: function(data,callback) {
	        	var node = getNode(data.id, nodes);
	        	editNodeDialog(node);
	        },
	        onDelete: function(data, callback) {
	        	var deletionData = {
	        		nodeId: data.nodes.shift(),
	        		edgeIds: data.edges
	        	}
	        	cc.deleteElement(deletionData);
	        },
		    nodes: {
		        shape: 'box'	
		    }
		};
		network = new vis.Network(container, data, options);
		
		network.on('select', function(properties) {
			$('#editDialogContainer').hide();
			$('#editPropertiesTable').empty();
		});
	}
	
	var getNode = function(id, nodes) {
		for(var i in nodes) {
			if(nodes[i].id == id) {
				return nodes[i];
			}
		}
		return null;
	}
	// prepare popup function for editing nodes
	var editNodeDialog = function(node) {
		var propertiesTable = $('#editPropertiesTable'); 
		propertiesTable.empty();
		
		for (var property in node) {
		    if (node.hasOwnProperty(property)) {
		    	var propLabel = property + ':';
		    	var propValue = node[property];
		        propertiesTable.append(
		        	$('<tr/>').append(
		        		$('<td class="label"/>').text(propLabel),
		        		$('<td/>').append(
		        			$('<input/>')
		        				.attr('id', property)
		        				.attr('value', propValue)
	    				)
		        	)
		        );
		    } 
		}
		$('#editDialogContainer #saveButton').click(function() {
			var editedNode = {};
			$('#editPropertiesTable input').each(function() {
				editedNode[this.id] = this.value;
			});
			editedNode.x = parseInt(editedNode.x.trim());
			editedNode.y = parseInt(editedNode.y.trim());
			if(isNaN(editedNode.x) 
			|| isNaN(editedNode.y)) {
				alert("Invalid data!\nX, Y have to be numbers.");
				return;
			}
			var data = {
				originalNode: node,
				editedNode: editedNode
			};
        	cc.editElement(data);
			$('#editDialogContainer').hide();
			$('#editPropertiesTable').empty();
			$(this).unbind('click');
		});
		
		$('#editDialogContainer #cancelButton').click(function(){
			$('#editDialogContainer').hide();
			$('#editPropertiesTable').empty();
			$(this).unbind('click');
		});
		$('#editDialogContainer').show();
	}
};
