package org.mondo.collaboration.online.client.application;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.Tree;

@StyleSheet({ 
	"app://VAADIN/client/StartNewSessionPage.css" 
})
public class StartNewSessionPage extends AbsoluteLayout implements View {

	// Id for the caption property
    private static final Object CAPTION_PROPERTY = "caption";
	
	public static final String NAME = "StartNewSession";
	
	private Application application;
	
	Navigator navigator;
	
	private Tree availableModelsTree;
	private ProgressBar loadingSign;
	private Button buttonStartSession;
	
	public StartNewSessionPage(Navigator navigator, Application application) {
		this.navigator = navigator;
		this.application = application;
		initView();
	}

	private void initView() {
		this.loadingSign = new ProgressBar();
		this.loadingSign.setIndeterminate(true);
		this.loadingSign.setId("loadingSign");
		Label title = new Label("Available models");
		title.setId("label_availableModels");
		addComponent(title);
		
		this.availableModelsTree = new Tree();
		this.availableModelsTree.setId("tree_availableModels");
		this.availableModelsTree.setWidth(30, Unit.EM);
		Tree tree = availableModelsTree;
        tree.addContainerProperty(CAPTION_PROPERTY, String.class, "");
        tree.setItemCaptionMode(AbstractSelect.ITEM_CAPTION_MODE_PROPERTY);
        tree.setItemCaptionPropertyId(CAPTION_PROPERTY);
		this.buttonStartSession = new Button("Start");
		this.buttonStartSession.setId("button_start");
		this.buttonStartSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				String selectedId = (String) tree.getValue();
				if(selectedId.endsWith(".wtspec4m")) {
					startSession(selectedId);
				} 
			}
		});
		addComponent(this.buttonStartSession);
		addComponent(this.loadingSign);
	}

	@Override	
	public void enter(ViewChangeEvent event) {
		loadingStateOn();
		getAvailableModelsForUser();
	}

	private void startSession(String selectedId) {
		System.out.println("Starting session for model: " + selectedId);
		this.application.getWebsocketClient().startSession(selectedId);
		this.navigator.navigateTo(SessionSelectionPage.NAME);
	}
	
	private void getAvailableModelsForUser() {
		this.application.getWebsocketClient().getAvailableModelsForUser(
			this.application.getUser().getUserName(),
			this.application.getUser().getPassword()
		);
	}
	
	public void setAvailableSessions(JSONArray availableModels) {
		System.out.println("Available sessions: ");
		try {
			for(int i = 0; i < availableModels.length(); i++) {
				System.out.println(availableModels.getString(i));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		setModelsTreeView(availableModels);
		loadingStateOff();
	}

	private void setModelsTreeView(JSONArray availableModels) {
		availableModelsTree.removeAllItems();
		List<String> sortedListOfModels = sortAvailableModels(availableModels);
		for(String path : sortedListOfModels) {
			// WARNING if the client runs on another platform than the EMF Handler separator may differ
			String[] partsOfPath = path.split(File.separator);
			
			String prevId = null;
			for(String part : partsOfPath) {
				String newCaption = part;
				String newId = prevId == null ? newCaption : (prevId + File.separator + newCaption);  
				if(!newCaption.endsWith(".wtspec4m")) {
					addCaptionedItem(newCaption, prevId, newId);
				} else { 
					newCaption = newCaption.replace(".wtspec4m", "");
					addCaptionedItem(newCaption, prevId, newId);
					this.availableModelsTree.setChildrenAllowed(newId, false);
				}
				prevId = newId;
			}
		}	
		Panel treeViewContainer = new Panel();
		treeViewContainer.setId("panel_treeViewContainer");
		treeViewContainer.setContent(this.availableModelsTree);
		addComponent(treeViewContainer);
	}

	private List<String> sortAvailableModels(JSONArray availableModels) {
		List<String> modelsList = new ArrayList<String>();
		try {
			for(int i = 0; i < availableModels.length(); i++) {
				modelsList.add(availableModels.getString(i));
			}
			modelsList.sort(new Comparator<String> () {
			    @Override
			    public int compare(String a, String b) {
			        return a.compareTo(b);
			    }
			});
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return modelsList;
	}
	
	private void addCaptionedItem(String caption, Object parent, String id) {
        // add item, let tree decide id
        this.availableModelsTree.addItem(id);
        // get the created item
        final Item item = this.availableModelsTree.getItem(id);
        // set our "caption" property
        final Property p = item.getItemProperty(CAPTION_PROPERTY);
        p.setValue(caption);
        if (parent != null) {
        	this.availableModelsTree.setChildrenAllowed(parent, true);
        	this.availableModelsTree.setParent(id, parent);
        }
    }
	
	private void loadingStateOn() {
		this.loadingSign.setVisible(true);
		this.buttonStartSession.setVisible(false);
	}

	private void loadingStateOff() {
		this.loadingSign.setVisible(false);
		this.buttonStartSession.setVisible(true);
	}
}
