package com.example.mondowebappvaadin7;

import com.example.mondowebappvaadin7.js.MyComponent;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.event.Transferable;
import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptAll;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.dd.VerticalDropLocation;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.TreeDragMode;
import com.vaadin.ui.Tree.TreeTargetDetails;

public class Collaboration extends AbsoluteLayout implements View {

	public static final String NAME = "Collaboration";
	
	Navigator navigator;
	
	public Collaboration(final Navigator navigator) {
		this.navigator = navigator;
		setSizeFull();
		final Object[][] parts = new Object[][]{
	        new Object[]{"Single Fans", "Fan_1", "Fan_2", "Fan_3", "Fan_4", "Fan_5", "Fan_6", "Fan_7"}, 
	        new Object[]{"Control System HW platforms", "CSHW_1", "CSHW_2", "CSHW_3"},
	        new Object[]{"Servo motors", "Servo_1", "Servo_2", "Servo_3", "Servo_4"},
	        new Object[]{"Wind turbines", "WT_1", "WT_2", "WT_3", "WT_4"}
		};
		
		Tree tree = new Tree("Wind turbines project X");
		tree.setDragMode(TreeDragMode.NODE);
		// Allow the tree to receive drag drops and handle them
		tree.setDropHandler(new DropHandler() {
		    public AcceptCriterion getAcceptCriterion() {
		        return AcceptAll.get();
		    }

		    public void drop(DragAndDropEvent event) {
		        // Wrapper for the object that is dragged
		        Transferable t = event.getTransferable();
		        
		        // Make sure the drag source is the same tree
		        if (t.getSourceComponent() != tree)
		            return;
		        
		        TreeTargetDetails target = (TreeTargetDetails)
		            event.getTargetDetails();

		        // Get ids of the dragged item and the target item
		        Object sourceItemId = t.getData("itemId");
		        Object targetItemId = target.getItemIdOver();

		        // On which side of the target the item was dropped 
		        VerticalDropLocation location = target.getDropLocation();
		        
		        HierarchicalContainer container = (HierarchicalContainer)
		        tree.getContainerDataSource();

		        // Drop right on an item -> make it a child
		        if(location == VerticalDropLocation.MIDDLE)
		            tree.setParent(sourceItemId, targetItemId);

		        // Drop at the top of a subtree -> make it previous
		        else if(location == VerticalDropLocation.TOP) {
		            Object parentId = container.getParent(targetItemId);
		            container.setParent(sourceItemId, parentId);
		            container.moveAfterSibling(sourceItemId, targetItemId);
		            container.moveAfterSibling(targetItemId, sourceItemId);
		        }
		        
		        // Drop below another item -> make it next 
		        else if(location == VerticalDropLocation.BOTTOM) {
		            Object parentId = container.getParent(targetItemId);
		            container.setParent(sourceItemId, parentId);
		            container.moveAfterSibling(sourceItemId, targetItemId);
		        }
		    }
		});
		/* Add planets as root items in the tree. */
		for(int i = 0; i < parts.length; i++) {
		    String planet = (String) (parts[i][0]);
		    tree.addItem(planet);
		    
		    if(parts[i].length == 1) {
		        // The planet has no moons so make it a leaf.
		        tree.setChildrenAllowed(planet, true);
		    } else {
		        // Add children (moons) under the planets.
		        for(int j = 1; j < parts[i].length; j++) {
		            String moon = (String) parts[i][j];
		            
		            // Add the item as a regular item.
		            tree.addItem(moon);
		            
		            // Set it to be a child.
		            tree.setParent(moon, planet);
		            
		            // Make the moons look like leaves.
		            tree.setChildrenAllowed(moon, true);
		        }

		        // Expand the subtree.
		        tree.expandItemsRecursively(planet);
		    }
		}
		final MyComponent mycomponent = new MyComponent();

		// Set the value from server-side
		mycomponent.setValue("Server-side value");

		// Process a value input by the user from the client-side
		mycomponent.addValueChangeListener(
		        new MyComponent.ValueChangeListener() {
		    @Override
		    public void valueChange() {
		        Notification.show("Value: " + mycomponent.getValue());
		    }
		});

		addComponent(tree);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	}
}
