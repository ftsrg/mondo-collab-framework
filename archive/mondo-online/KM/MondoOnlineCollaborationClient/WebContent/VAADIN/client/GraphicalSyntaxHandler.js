var addNodeStyle = function(node, type) {
	node.shape = "box";
	
	if(type == "subsystems") {
		node.color = {background: "rgb(227, 86, 48)", border: "black"};
	} else if(type == "wtctrls") {
		node.color = {background: "rgb(46, 208, 20)", border: "black"};
	} else if(type == "inputs") {
		node.color = {background: "rgb(22, 212, 178)", border: "black"};
	} else if(type == "outputs") {
		node.color = {background: "rgb(224, 198, 163)", border: "black"};
	} else if(type == "params") {
		node.color = {background: "rgb(68, 134, 255)", border: "black"};
	} else if(type == "alarms") {
		node.color = {background: "rgb(255, 255, 0)", border: "black"};
	} /*else if(type == "faults") {
		node.type = "Fault";
		node.shape = "star";
		node.radius = 10;
	} */
	/*else if(type == "itsVariables") {
		node.type = "Variable";
		node.shape = "box";
	} */
	/*else if(type == "itsTimers") {
		node.type = "Timer";
		node.shape = "circle";
	}*/
}

var getElementTypes = function() {
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