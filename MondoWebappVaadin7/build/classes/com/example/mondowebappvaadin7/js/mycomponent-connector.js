window.com_example_mondowebappvaadin7_js_MyComponent =
function() {
    // Create the component
    var mycomponent =
        new mylibrary.MyComponent(this.getElement());
    
    // Handle changes from the server-side
    this.onStateChange = function() {
        mycomponent.setValue(this.getState().value);
    };

    // Pass user interaction to the server-side
    var connector = this;
    mycomponent.click = function() {
        connector.onClick(mycomponent.getValue());
    };
    
    mycomponent.loadmodel = function() {
    	connector.loadModel();
    	mycomponent.setModelText(this.getState().model)
    }
};