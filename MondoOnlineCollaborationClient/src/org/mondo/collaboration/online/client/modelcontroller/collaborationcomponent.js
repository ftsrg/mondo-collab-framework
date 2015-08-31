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
		wtctrlReferences = initWtctrlReferences();
		var initialData = extractRoot(model);
		
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
		modelDisplay = new vis.Network(container, initialData, options);
		
		// save position of nodes
		var positions = modelDisplay.getPositions();
		cc.publishPositions(positions);
	}
	
	this.setModel = function(model, positions) {
		console.log("Updating model...");
		wtctrlReferences = initWtctrlReferences();
		/*
		if(!model) {
			return false;
		}
		*/
		cc.model = model;
		modelData = extractRoot(model);
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
			        	parentId: "",
			        	name: "",
			        	nodeType: "",
			        	id: newData.id,
			        	label: "New element",
			        	// group: "",
			        	x: newData.x,
			        	y: newData.y
			        }; 
			        editDialog(newNode, true);
			    },
			    addEdge: function(edgeData, callback) {
			    	var sourceNode = getElement(edgeData.from, modelData.nodes);
			    	var targetNode = getElement(edgeData.to, modelData.nodes);
			    	if(connectionIsValid(sourceNode, targetNode)) {
			    		if(isWtctrlReference(sourceNode.nodeType)) {
			    			sourceNode.indexOfReferencedObject = 
			    				getIndexOfReferencedElement(sourceNode, wtctrlReferences);
			    		} else if(isWtctrlReference(targetNode.nodeType)) {
			    			targetNode.indexOfReferencedObject = 
			    				getIndexOfReferencedElement(targetNode, wtctrlReferences);
			    		}
			    		var newEdgeData = {
			    			sourceNode: sourceNode,
			    			targetNode: targetNode
			    		};
			    		cc.addEdge(newEdgeData);
			    	}
		        	callback(null);
			    },
		        editNode: function(nodeData, callback) {
		        	var node = getElement(nodeData.id, modelData.nodes);
		        	editDialog(node, false);
		        	callback(null);
		        },
		        editEdge: function(edgeData, callback) {
		        	// coming soon... just like winter
		        },
		        deleteNode: function(deletionData, callback) {
		        	var nodeId = deletionData.nodes.shift();
		        	var node = getElement(nodeId, modelData.nodes);
		        	var deletionData = {};
		        	if(isWtctrlReference(node.nodeType)) {
		        		node.indexOfReferencedObject = getIndexOfReferencedElement(node, wtctrlReferences);
		        	}
		        	deletionData.node = node;
		        	cc.deleteElement(deletionData);
		        }
			}
		}

		var container = document.getElementById('workspace');
		modelDisplay = new vis.Network(container, modelData, options);
		modelDisplay.on("dragEnd", function (params) {
			params.event = "[original event]";
	        if(params.nodes.length > 0) {
	        	var positionData = {
	    			node: params.nodes.pop(),
	    			newPosition: params.pointer.canvas
	    		}
	        	cc.moveNode(positionData);
	        } 
	    });
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
	
	// prepare pop-up function for editing nodes
	var editDialog = function(element, isNewElement) {
		var propertiesTable = $('#editPropertiesTable'); 
		propertiesTable.empty();
		var nodeTypes = getNodeTypes();
		var excludedProperties = ["elementType", "shape", "size", "style", "level", "label", "color", "parentId"];
		if(!isNewElement) {
			excludedProperties.push("nodeType");
		} 
		for(var property in element) {
		    if(element.hasOwnProperty(property) && !isArray(element[property]) &&
    		element[property] != null && excludedProperties.indexOf(property) == -1) {
		    	var propLabel = property + ':';
		    	var propValue = element[property];
	    		if(typeof propValue["$ref"] !== "undefined") {
	    			// propValue = propValue["$ref"];
	    			continue;
	    		}
		    	var inputCell = $('<td/>');
		    	var input = null;
		    	if(property == "nodeType" && element['elementType'] != 2) {
		    		input = $('<select/>').attr('id', property);
		    		for(var i in nodeTypes) {
		    			input.append($('<option>' + nodeTypes[i] + '</option>')
	    					.attr('value', nodeTypes[i])
		    			);
		    		}
		    		if(element.nodeTypes != "") {
		    			input.val(element.nodeTypes);
		    		}
		    	} else {
		    		input =	$('<input/>')
        				.attr('id', property)
        				.attr('value', propValue);
		    			
		    	}
		    	if(input != null) {
			    	inputCell.append(input);
			    	var newRow = $('<tr/>').append(
				        $('<td class="label"/>').text(propLabel),
				        inputCell
				    );
			    	if(property == 'x' || property == 'y') {
			    		newRow.hide();
			    	}
			    	propertiesTable.append(newRow);
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
				editedElement["nodeType"] = $('#editPropertiesTable select').val();
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
	
	var closeEditDialog = function() {
		$("#editDialogContainer #cancelButton").unbind("click");
		$("#editDialogContainer #saveButton").unbind("click");
		$('#editDialogContainer').hide();
		$('#editPropertiesTable').empty();
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

		if(typeof root["inputs"] !== "undefined") {
			wtctrlReferences["inputs"] = root["inputs"];
		}
		if(typeof root["outputs"] !== "undefined") {
			wtctrlReferences["outputs"] = root["outputs"];
		}
		if(typeof root["params"] !== "undefined") {
			wtctrlReferences["params"] = root["params"];
		}
		for(var property in root) {
//			if(isWtctrlReference(property)) {
//				wtctrlReferences[property] = root[property];
//			}
		    if(root.hasOwnProperty(property) && isArray(root[property])) {
		    	var children = root[property];
		    	for(var i in children) {
		    		var subModel = extractModel(children[i], property, currentLevel, depthTracker, "");
		    		model = mergeModels(model, subModel);
		    	}
		    	currentLevel = depthTracker.depth + 1;
		    }
	    }
		return model;
	}
	
	// returns the node and its subtree
	var extractModel = function(node, nodeType, currentLevel, depthTracker, parentId) {

		if(typeof wtctrlReferences === 'undefined') {
			wtctrlReferences = initWtctrlReferences();
		}
		depthTracker.depth++;
		currentLevel++;
		var maxDepth = currentLevel; 
		// node.id = node.id;
		node.label = node.name;
		node.level = currentLevel;
		node.parentId = parentId;
		node.nodeType = nodeType;
		addNodeStyle(node, nodeType);
		var model = {
			nodes: [node],
			edges: []
		};
		// connect wtctrl with their referenced inputs/outputs/params
		for(var property in node) {
			if(isWtctrlReference(property)) {
				var index = parseInt(node[property]["$ref"].slice(-1));
				var prop = property + "s";
//				console.log(wtctrlReferences);
//				console.log(prop);
//				console.log(index);
//				alert();
				var newEdge = {
					from: node.id,
					to: wtctrlReferences[prop][index].id,
					color: wtctrlReferences[prop][index].color
					//connectionType: "containment"
				}
				model.edges.push(newEdge);
			} else if(node.hasOwnProperty(property) && isArray(node[property])) {
		    	// process subtree
		    	// note: at this point the property identifies the subnodes' type
		    	var setOfChildren = node[property]; 
		    	for(var i in setOfChildren) {
					var newEdge = {
						from: node.id,
						to: setOfChildren[i].id,
						style: "arrow",
						connectionType: "containment"
					}
					model.edges.push(newEdge);
					var subModel = extractModel(setOfChildren[i], property, currentLevel, depthTracker, node.id);
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
		if(positions) {
			for(var nodeId in positions) {
				console.log(positions[nodeId]);
				modelDisplay.moveNode(nodeId, positions[nodeId].x, positions[nodeId].y);
			}
		}
	}
	
	// for inputs, outputs and params
	var getIndexOfReferencedElement = function(node, wtctrlReferences) {
		var index = -1;
		for(var i in wtctrlReferences[node.nodeType]) {
			if(wtctrlReferences[node.nodeType][i].id == node.id) {
				index = i;
				break;
			}
		}
		return index;
	}

	var connectionIsValid = function(sourceNode, targetNode) {
		var basicElements = ["outputs", "inputs", "params"]
		var allowedForSubsystems = ["subsystems", "wtctrls"];
		var allowedForWtctrls = basicElements.concat(["subsystems"]);
		
		var isValid = false;
		
		if((basicElements.indexOf(sourceNode.nodeType) != -1 && targetNode.nodeType == "wtctrls") 
		|| (sourceNode.nodeType == "wtctrls" && allowedForWtctrls.indexOf(targetNode.nodeType) != -1)
		|| (sourceNode.nodeType == "subsystems" && allowedForSubsystems.indexOf(targetNode.nodeType) != -1)) {
			isValid = true;
		} else {
			alert(sourceNode.nodeType + " may not be connected to " + targetNode.nodeType);
		}
		return isValid;
	}
	
	var getNodeTypes = function() {
		var types = ["subsystems", "wtctrls", "inputs", "outputs", "params", "alarms" /*, "Fault", "Variable", "Timer"*/];
		return types;
	}

	var getWtctrlReferenceTypes = function() {
		var types = ["inputs", "outputs", "params", "input", "output", "param"];
		return types;
	}

	var isWtctrlReference = function(property) {
		var types = getWtctrlReferenceTypes();
		if(types.indexOf(property) != -1) {
			return true;
		}
		return false;
	}
	
	var initWtctrlReferences = function() {
		return {
			inputs: [],
			outputs: [],
			params: []
		};
	}
};
