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
		var data = extractRoot(model);
		
		var options = {
			stabilize: true,
	        hierarchicalRepulsion: {
	            centralGravity: 0.1
	        },
	        smoothCurves: false,
	        dragNodes: false,
	        hierarchicalLayout: {
	            direction: "UD"
	        },
			dataManipulation: {
			    enabled: true,
			    initiallyVisible: true
			},
			onAdd: function(newData, callback) {
		        var newNode = {
		        	elementType: 1,
		        	parentSysId: "",
		        	sysId: "",
		        	type: "",
		        	// id: newData.id,
		        	label: "New element",
		        	group: ""		        	
		        }; 
		        editDialog(newNode, true);
		    },
	        onEdit: function(nodeData, callback) {
	        	var node = getElement(nodeData.id, data.nodes);
	        	editDialog(node, false);
	        },
	        onEditEdge: function(edgeData, callback) {
	        	// Coming soon... just like winter
	        },
	        onDelete: function(dataToDelete, callback) {
	        	var nodeId = dataToDelete.nodes.shift();
	        	var node = getElement(nodeId, data.nodes);
	        	var deletionData = {
	        		node: node
	        	}
	        	cc.deleteElement(deletionData);
	        }
		}

		var container = document.getElementById('workspace');
		var network = new vis.Network(container, data, options);
		/*
		for(var property in element) {
		    if(element.hasOwnProperty(property)) {
		    	var node = {};
		    }
	    }*/
		/*
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
		});*/
	}
	var getElement = function(id, stack) {
		for(var i in stack) {
			if(stack[i].id == id) {
				return stack[i];
			}
		}
		return null;
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
		var types = getElementTypes();

		for(var property in element) {
		    if(element.hasOwnProperty(property) && !isArray(element[property]) && property != "elementType"
		    && property != "shape" && property != "radius"  && property != "style"
	    	&& property != "level") {
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
		    		if(element.type != "") {
		    			input.val(element.type);
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
	
	/*
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
	}*/
	
	// WTSpec -ific..  huehue :(
	var extractRoot = function(root) {
		var depthTracker = {
			depth: 0
		}
		var currentLevel = 0;
		var model = {
			nodes: [],
			edges: []
		}
		for(var property in root) {
		    if(root.hasOwnProperty(property) && isArray(root[property])) {
		    	var children = root[property];
		    	for(var i in children) {
		    		var subModel = extractModel(children[i], property, currentLevel, depthTracker);
		    		model = mergeModels(model, subModel);
		    	}
		    	currentLevel = depthTracker.depth + 1;
		    }
	    }
		return model;
	}
	
	// returns the node and its subtree
	var extractModel = function(node, type, currentLevel, depthTracker) {
		depthTracker.depth++;
		currentLevel++;
		var maxDepth = currentLevel; 
		node.id = node.sysId;
		node.level = currentLevel;
		addNodeStyle(node, type);
		var model = {
			nodes: [node],
			edges: []
		};
		for(var property in node) {
		    if(node.hasOwnProperty(property) && isArray(node[property])) {
		    	// process subtree
		    	// note: at this point the property identifies the sub nodes' type
		    	var setOfChildren = node[property]; 
		    	for(var i in setOfChildren) {
					var newEdge = {
						from: node.sysId,
						to: setOfChildren[i].sysId,
						style: "arrow",
						connectionType: "containment"
					}
					model.edges.push(newEdge);
					var subModel = extractModel(setOfChildren[i], property, currentLevel, depthTracker);
					model = mergeModels(model, subModel);
					if(depthTracker.depth > maxDepth) {
						maxDepth = depthTracker.depth;
					}
					depthTracker.depth = currentLevel;
				}
		    } 
	    }
		depthTracker.depth = maxDepth;
		return model;
	}
	
	// adds nodes and edges of model2 to model1
	var mergeModels = function(model1, model2) {
		var model = {
			nodes: model1.nodes.concat(model2.nodes),
			edges: model1.edges.concat(model2.edges) 	
		}
		return model;
	}
	
	var isArray = function(variable) {
		return (Object.prototype.toString.call(variable) === '[object Array]');
	}
};
