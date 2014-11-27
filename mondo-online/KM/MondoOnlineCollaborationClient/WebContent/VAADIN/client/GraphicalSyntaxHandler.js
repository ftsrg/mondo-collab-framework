var addNodeStyle = function(node, type) {
	if(type == "itsSubsystems") {
		node.type = "Subsystem";
		node.shape = "box";
	} else if(type == "itsWTCs") {
		node.type = "WTC";
		node.shape = "dot";
		node.radius = 10;
	} else if(type == "itsInputs") {
		node.type = "Input";
		node.shape = "trianglaDown";
		node.radius = 10;
	} else if(type == "itsOutputs") {
		node.type = "Output";
		node.shape = "triangle";
		node.radius = 10;
	} else if(type == "itsParams") {
		node.type = "Param";
		node.shape = "square";
		node.radius = 10;
	} else if(type == "itsFaults") {
		node.type = "Fault";
		node.shape = "star";
		node.radius = 10;
	} else if(type == "itsVariables") {
		node.type = "Variable";
		node.shape = "box";
	} else if(type == "itsTimers") {
		node.type = "Timer";
		node.shape = "circle";
	}
}

var getElementTypes = function() {
	var types = ["Subsystem", "WTC", "Input", "Output", "Param", "Fault", "Variable", "Timer"];
	return types;
}
