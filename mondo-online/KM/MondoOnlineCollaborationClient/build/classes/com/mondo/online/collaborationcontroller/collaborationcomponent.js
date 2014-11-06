var collaborationLibrary = collaborationLibrary || {};
collaborationLibrary.model = null;

collaborationLibrary.CollaborationComponent = function(component) {
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
	
	component.innerHTML = $('<div />').append(
		$('<div />').attr('id', 'workspace'),
		$('<div />').attr('id', 'editDialogContainer')
			.append(editDialog)
	).html();
	
	var cc = this;
	
	this.setModel = function(model) {
		/*
		if(!model) {
			return false;
		}
		*/
		cc.model = model;
		var nodes = model.nodes;
		var edges = model.edges;
		for(var i in edges) {
			edges[i].style = "arrow";
		}
		for(var i in nodes) {
			nodes[i] = setElementView(nodes[i]);
		}
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
			onAdd: function(newData, callback) {
		        var newNode = {
        			elementType: 1,
		        	type: "",
		        	id: newData.id,
		        	label: "New element",
		        	group: "",
		        	x: newData.x,
		        	y: newData.y		        	
		        }; 
		        editDialog(newNode, true);
		    },
	        onEdit: function(nodeData, callback) {
	        	var node = getElement(nodeData.id, nodes);
	        	editDialog(node, false);
	        },
	        onEditEdge: function(edgeData, callback) {
	        	var edge = getElement(edgeData.id, edges);
	        	editDialog(edge, false);
	        },
	        onConnect: function(newEdgeData, callback) {
	        	var id = generateEdgeId(edges);
	        	var newEdge = {
        			elementType: 2,
        			type: "",
		        	id: id,
		        	from: newEdgeData.from,
		        	to: newEdgeData.to,
		        	name: "New connection",
		        	group: ""
		        }; 
		        cc.addElement(newEdge);
	        },
	        onDelete: function(dataToDelete, callback) {
	        	var deletionData = {
	        		nodeId: dataToDelete.nodes.shift(),
	        		edgeIds: dataToDelete.edges
	        	}
	        	cc.deleteElement(deletionData);
	        },
		    nodes: {
		        shape: 'box'	
		    }
		};
		network = new vis.Network(container, data, options);
		
		network.on('select', function(properties) {
			closeEditDialog();
		});
	}
	
	var getElement = function(id, stack) {
		for(var i in stack) {
			if(stack[i].id == id) {
				return stack[i];
			}
		}
		return null;
	}
	
	var generateEdgeId = function(edges) {
		var num = 0;
		var pattern = /^NewId_(\d)+$/;
		for(var i in edges) {
			if(pattern.test(edges[i].id)) {
				var numAtTheEnd = parseInt(edges[i].id.substr(6));
				if(!isNaN(numAtTheEnd) && numAtTheEnd >= num) {
					num = numAtTheEnd + 1; 
				}
			}
		}
		return "NewId_" + num;
	}
	
	var closeEditDialog = function() {
		$("#editDialogContainer #cancelButton").unbind("click");
		$("#editDialogContainer #saveButton").unbind("click");
		$('#editDialogContainer').hide();
		$('#editPropertiesTable').empty();
	}
	// prepare pop-up function for editing nodes
	// TODO rename node to generic
	var editDialog = function(element, isNewElement) {
		var propertiesTable = $('#editPropertiesTable'); 
		propertiesTable.empty();
		var types = ["SubSystem", "CtrlUnit", "SystemInput", "SystemOutput", "SystemParam", "SystemFault", "SystemVariable"];

		for(var property in element) {
		    if(element.hasOwnProperty(property) && property != "elementType"
		    && property != "shape" && property != "radius"  && property != "style") {
		    	var propLabel = property + ':';
		    	var propValue = element[property];
		    	var inputCell = $('<td/>');
		    	var input = null;
		    	if(property == "type" && element['elementType'] != 2) {
		    		input = $('<select/>').attr('id', property);
		    		for(var i in types) {
		    			input.append($('<option>' + types[i] + '</option>')
	    					.attr('value', types[i])
		    			);
		    		}
		    	} else {
		    		input =	$('<input/>')
        				.attr('id', property)
        				.attr('value', propValue);
		    	}
		    	if(input != null) {
			    	inputCell.append(input);
			    	propertiesTable.append(
			        	$('<tr/>').append(
			        		$('<td class="label"/>').text(propLabel),
			        		inputCell
			        	)
			        );
		    	}
		    } 
		}
		$('#editDialogContainer #saveButton').click(function() {
			var editedElement = {};
			$('#editPropertiesTable input').each(function() {
				editedElement[this.id] = this.value;
			});
			editedElement["elementType"] = element["elementType"];
			if(element["elementType"] == 1) {
				editedElement.x = parseInt(editedElement.x.trim());
				editedElement.y = parseInt(editedElement.y.trim());
				
				if(isNaN(editedElement.x) 
				|| isNaN(editedElement.y)) {
					alert("Invalid data!\nX and Y have to be numbers.");
					return;
				}
				
				editedElement["type"] = $('#editPropertiesTable select').val();
			}
			
			if(isNewElement) {
				cc.addElement(editedElement);
			} else {
				var editData = {
					original: element,
					edited: editedElement
				};
				cc.editElement(editData);
			}
			closeEditDialog();
		});
		
		$('#editDialogContainer #cancelButton').click(function(){
			closeEditDialog();
		});
		$('#editDialogContainer').show();
	}
};
