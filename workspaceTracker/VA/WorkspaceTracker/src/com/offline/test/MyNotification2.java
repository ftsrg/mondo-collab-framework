package com.offline.test;


import gyak.model.webpage.Articles;
import gyak.model.webpage.MyWeb;
import gyak.model.webpage.Webpage;
import gyak.model.webpage.WebpageFactory;
import gyak.model.webpage.WebpagePackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.offline.workspaceTracker.MyContentAdapter2;


public class MyNotification2 {
	
	public static void main(String[] args) {
		new MyNotification2();
	}
	
	@SuppressWarnings("unchecked")
	public MyNotification2(){
		// Initialize the model
	    WebpagePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("website", new XMIResourceFactoryImpl());
	    
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    MyContentAdapter2 contentAdapter = new MyContentAdapter2(resSet, URI.createURI("models/trace.operationtracemodel", true));
	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI("models/my3.website", true), true);
	    
	    resource.eAdapters().add(contentAdapter);
	    
				    

	   resource.getContents().add(WebpageFactory.eINSTANCE.createMyWeb());
	   resource.getContents().add(WebpageFactory.eINSTANCE.createMyWeb());
	   ((MyWeb) resource.getContents().get(1)).getKeywords().add("test");
	   ((MyWeb) resource.getContents().get(1)).setTitle("tttt");
	   ((MyWeb) resource.getContents().get(1)).getPages().add(WebpageFactory.eINSTANCE.createWebpage());
	    Set<Object> c = new HashSet<Object>();
	    c.add(WebpageFactory.eINSTANCE.createWebpage());
	    c.add(WebpageFactory.eINSTANCE.createWebpage());
	   ((MyWeb) resource.getContents().get(1)).getPages().addAll(c);
	   resource.getContents().remove(0);
	   //System.out.println((MyWeb) resource.getContents().get(0));
	   MyWeb myWeb = (MyWeb) resource.getContents().get(0);
	   myWeb.getPages().add(WebpageFactory.eINSTANCE.createWebpage());
	   
	   ((Webpage) myWeb.getPages().get(1)).setName("new webpage");
	   ((Webpage) myWeb.getPages().get(1)).setCategories(WebpageFactory.eINSTANCE.createCategory());
	   ((Webpage) myWeb.getPages().get(1)).getCategories().getArticles().add(WebpageFactory.eINSTANCE.createArticles());
	   ((Articles)((Webpage) myWeb.getPages().get(1)).getCategories().getArticles().get(0)).getIze().add(myWeb);
	   //System.out.println(myWeb.getName());
	   myWeb.setName("teszt3");
	   myWeb.getPages().remove(0);
	  // System.out.println(myWeb.getName());
	   resource.getContents().remove(0);
	   try {
		   resource.save(Collections.EMPTY_MAP);
		   contentAdapter.getTraceModel().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		    // create a resource
	    
		    
		    
	}
	
}
