var addNodeStyle = function(node, type) {
	if(type == "subsystems") {
		node.type = "subsystems";
		node.shape = "box";
	} else if(type == "wtctrls") {
		node.type = "wtctrls";
		node.shape = "dot";
		node.size = 10;
	} else if(type == "inputs") {
		node.type = "inputs";
		node.shape = "triangleDown";
		node.size = 10;
	} else if(type == "outputs") {
		node.type = "outputs";
		node.shape = "triangle";
		node.size = 10;
	} else if(type == "params") {
		node.type = "params";
		node.shape = "diamond";
		node.size = 10;
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
	var types = ["subsystems", "wtctrls", "inputs", "outputs", "params" /*, "Fault", "Variable", "Timer"*/];
	return types;
}
