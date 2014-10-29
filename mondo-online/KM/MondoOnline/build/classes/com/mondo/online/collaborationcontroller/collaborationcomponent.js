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
	var getNode = function(id, nodes) {
		for(var i in nodes) {
			if(nodes[i].id == id) {
				return nodes[i];
			}
		}
	}
	var cc = this;
	
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
		$('#editDialogContainer #saveButton').click(function(){
			var editedNode = {};
			$('#editPropertiesTable input').each(function() {
				editedNode[this.id] = this.value;
			});
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
	
	this.setModel = function(model) {
		if(!model) {
			return false;
		}

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
	        	var node = getNode(data.id, nodes);
		        if(node !== null) {
		        	editNodeDialog(node);
		        }
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
};
