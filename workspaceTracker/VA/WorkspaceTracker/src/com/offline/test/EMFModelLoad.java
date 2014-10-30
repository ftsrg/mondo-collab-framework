package com.offline.test;

import gyak.model.webpage.WebpagePackage;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.offline.workspaceTracker.MyResourceSet;

public class EMFModelLoad {
  public ResourceSet load() {
    // Initialize the model
    WebpagePackage.eINSTANCE.eClass();
    
    // Register the XMI resource factory for the .website extension

    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("website", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new MyResourceSet();

    // Get the resource
    Resource resource = resSet.getResource(URI
        .createURI("models/my3.website"),true);
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
   // MyWeb myWeb = (MyWeb) resource.getContents().get(0);
    //System.out.println(resource.getContents());
    return resSet;
  }

} 
