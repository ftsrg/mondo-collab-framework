package com.offline.test;


import gyak.model.webpage.MyWeb;
import gyak.model.webpage.Webpage;
import gyak.model.webpage.WebpageFactory;
import gyak.model.webpage.WebpagePackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class SaveModel {

  
/**
   * @param args
   */

  @SuppressWarnings("unchecked")
public static void main(String[] args) {
    // Initialize the model
    WebpagePackage.eINSTANCE.eClass();
    // Retrieve the default factory singleton
    WebpageFactory factory = WebpageFactory.eINSTANCE;

    // create the content of the model via this program
    MyWeb myWeb = factory.createMyWeb();
    Webpage page = factory.createWebpage();
    page.setName("index");
    page.setDescription("Main webpage");
    page.setKeywords("Eclipse, EMF");
    page.setTitle("Eclipse EMFi");
    myWeb.getPages().add(page);
    myWeb.setName("izé teszt");

    // As of here we preparing to save the model content

    // Register the XMI resource factory for the .website extension

    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("website", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();

    // create a resource
    Resource resource = resSet.createResource(URI
        .createURI("models/My2.website"));
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
    resource.getContents().add(myWeb);

    // now save the content.
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public static void save(Resource resource, String uri){
	  Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("website", new XMIResourceFactoryImpl());
	    resource.getResourceSet().createResource(URI.createURI(uri));
	    try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
} 