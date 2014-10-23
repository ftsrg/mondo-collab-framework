var collaborationLibrary = collaborationLibrary || {};
collaborationLibrary.model = null;

collaborationLibrary.CollaborationComponent = function(element) {
	this.setModel = function(model) {
		alert(".");
	}
	
	element.innerHTML = 
		"<div id=\"workspace\" " +
			"style=\"width: 1000px; " +
			"height: 600px; " +
			"border 1px solid lightgray\">" +
		"</div>" +
		"<div id=\"info\"></div>";

	  var nodes = [
	    {id: 1, label: 'Node 1'},
		{id: 2, label: 'Node 2'},
		{id: 3, label: 'Node 3'},
		{id: 4, label: 'Node 4'},
		{id: 5, label: 'Node 5'}
	  ];
	
	  var edges = [
	    {from: 1, to: 2, name: "connection1"},
	    {from: 1, to: 3, name: "connection2"},
	    {from: 2, to: 4, name: "connection3"},
	    {from: 2, to: 5, name: "connection4"}
	  ];
	
	  var container = document.getElementById('workspace');
	  var data = {
	    nodes: nodes,
	    edges: edges
	  };
	  var options = {
	    nodes: {
	      shape: 'box'
	    }
	  };
	  network = new vis.Network(container, data, options);
	
	  network.on('select', function(properties) {
		  document.getElementById('info').innerHTML += 'selection: ' + JSON.stringify(properties) + '<br>';
	  });
	
	  network.selectNodes([3, 4, 5]);
};

