var addNodeStyle = function(node, nodeType) {
	node.shape = "box";
	
	if(nodeType == "subsystems") {
		node.color = {background: "rgb(227, 86, 48)", border: "black"};
	} else if(nodeType == "wtctrls") {
		node.color = {background: "rgb(46, 208, 20)", border: "black"};
	} else if(nodeType == "inputs") {
		node.color = {background: "rgb(22, 212, 178)", border: "black"};
	} else if(nodeType == "outputs") {
		node.color = {background: "rgb(224, 198, 163)", border: "black"};
	} else if(nodeType == "params") {
		node.color = {background: "rgb(68, 134, 255)", border: "black"};
	} else if(nodeType == "alarms") {
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
