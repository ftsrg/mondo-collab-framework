// Define the namespace
var mylibrary = mylibrary || {};

mylibrary.MyComponent = function (element) {
	element.innerHTML =
		"<div class='caption'>Test</div>" +
		"<div class='textinput'>Enter a value: " +
		"<input type='text' name='value'/>" +
		"<input type='button' value='Click'/>" +
		"</div>" +
		"<span id='model'>Default text</span>";

	// Style it
	element.style.border = "thin solid red";
	element.style.display = "inline-block";

	// Getter and setter for the value property
	this.getValue = function () {
		return element.
		    getElementsByTagName("input")[0].value;
	};
	this.setValue = function (value) {
		element.getElementsByTagName("input")[0].value =
		    value;
	};

	this.setModel = function (model) {
		element.getElementById("model").innerHTML =
		    model;
	};

	// Set up button click
	var button = element.getElementsByTagName("input")[1];
	var self = this; // Can't use this inside the function
	button.onclick = function () {
		self.click();
	};
	
	this.loadmodel();
};