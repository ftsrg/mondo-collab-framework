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
	
	this.initModelDisplay = function(model) {
		console.log("Initializing model display..");
		cc.model = model;
		var data = extractRoot(model);
		
		var options = {
	        physics: {
	        	barnesHut: {
	        		gravitationalConstant: 0,
	        		centralGravity: 0, 
	        		springConstant: 0
	        	}
	        },
	        edges: {
	        	arrows: 'to',
	        	smooth: {
	        	      enabled: false
	        	}
	        },
	        layout: {
	        	hierarchical: {
		            direction: "UD",
		            levelSeparation: 50
	        	}
	        },
			manipulation: {
			    initiallyActive: true
			}
		};

		var container = document.getElementById('workspace');
		modelDisplay = new vis.Network(container, data, options);
		
		// save position of nodes
		var positions = modelDisplay.getPositions();
		cc.publishNodePositions(positions);
	}
	
	this.setModel = function(model, positions) {
		console.log("Updating model...");
		/*
		if(!model) {
			return false;
		}
		*/
		cc.model = model;
		data = extractRoot(model);
		
		var options = {
	        physics: {
	        	barnesHut: {
	        		gravitationalConstant: 0,
	        		centralGravity: 0, 
	        		springConstant: 0
	        	}
	        },
	        layout: {
	        	hierarchical: false
        	},
	        edges: {
	        	arrows: 'to',
	        	smooth: {
	        	      enabled: false
	        	}
	        },
			manipulation: {
			    initiallyActive: true,
				addNode: function(newData, callback) {
			        var newNode = {
			        	elementType: 1,
			        	parentName: "",
			        	name: "",
			        	type: "",
			        	// id: newData.id,
			        	label: "New element",
			        	group: ""		        	
			        }; 
			        editDialog(newNode, true);
			    },
		        editNode: function(nodeData, callback) {
		        	var node = getElement(nodeData.id, data.nodes);
		        	editDialog(node, false);
		        },
		        editEdge: function(edgeData, callback) {
		        	// Coming soon... just like winter
		        },
		        deleteNode: function(dataToDelete, callback) {
		        	var nodeId = dataToDelete.nodes.shift();
		        	var node = getElement(nodeId, data.nodes);
		        	var deletionData = {
		        		node: node
		        	}
		        	cc.deleteElement(deletionData);
		        }
			}
		}

		var container = document.getElementById('workspace');
		modelDisplay = new vis.Network(container, data, options);
		console.log(positions);
		applyPositions(positions);
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
	var editDialog = function(element, isNewElement) {
		var propertiesTable = $('#editPropertiesTable'); 
		propertiesTable.empty();
		var types = getElementTypes();
		var excludedProperties = ["elementType", "shape", "radius", "style", "level"];
		for(var property in element) {
		    if(element.hasOwnProperty(property) && !isArray(element[property]) &&
    		element[property] != null && excludedProperties.indexOf(property) == -1) {
		    	var propLabel = property + ':';
		    	var propValue = element[property];
	    		if(typeof propValue["$ref"] !== "undefined") {
	    			propValue = propValue["$ref"];
	    		}
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
		node.id = node.name;
		node.label = node.name;
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
						from: node.name,
						to: setOfChildren[i].name,
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
	
	var applyPositions = function(positions) {
		for(var i in positions) {
			if(positions[i]) {
				for(var nodeId in positions[i]) {
					console.log(positions[i][nodeId]);
					modelDisplay.moveNode(nodeId, positions[i][nodeId].x, positions[i][nodeId].y);
				}
			}
		}
		alert("check pos");
	}
};

