var setElementView = function(node) {
	if(node.type == "SubSystem") {
		node.shape = "box";
	} else if(node.type == "CtrlUnit") {
		node.shape = "dot";
		node.radius = 10;
	} else if(node.type == "SystemInput") {
		node.shape = "trianglaDown";
		node.radius = 10;
	} else if(node.type == "SystemOutput") {
		node.shape = "triangle";
		node.radius = 10;
	} else if(node.type == "SystemParam") {
		node.shape = "square";
		node.radius = 10;
	} else if(node.type == "SystemFault") {
		node.shape = "star";
		node.radius = 10;
	} else if(node.type == "SystemVariable") {
		node.shape = "box";
	}
	return node;
}
