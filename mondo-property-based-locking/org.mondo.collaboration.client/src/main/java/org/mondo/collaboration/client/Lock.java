package org.mondo.collaboration.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;

public class Lock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8761752530179435040L;
	private Boolean enabled=false;
	private String name="";
	private String pattern="";
	private String binds="";

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getBinds() {
		return binds;
	}

	public void setBinds(String binds) {
		this.binds = binds;
	}

	public boolean isEmpty() {
		if (name == null || pattern == null) {
			return true;
		}
		if (name.equals("") || pattern.equals("")) {
			return true;
		}

		return false;
	}


	
	
	public boolean isMatchWithEventAtom3(IPatternMatch eventAtom) {
		if (isEmpty()) {
			return false;
		}
		
		if(enabled==false)
		{
			return false;
		}

		else {

			if (isPatternMatching(eventAtom)) {
				
				
				ArrayList<Map<String, String>> bindsList = parseBinds2();
				
				Map<String, Object> eventAtomObjects = parseEventAtomObjects(eventAtom);
				
				
				
				HashMap<String,Boolean> lockBindsSatasfaction=new HashMap<String, Boolean>();
				
				for(Map<String, String> bind:bindsList)
				{
					//String bindType=bind.get(parameterType);
					String bindField=bind.get(parameterField);
					String bindValue=bind.get(parameterValue);
					
					if(eventAtomObjects.containsKey(bindField))
					{
						if(!eventAtomObjects.get(bindField).equals(bindValue))
						{
							return false;
						}
					}
					else
					{
						return false;
					}
					

				}
				

				return true;
			}

			return false;

		}
	}


	private boolean isPatternMatching(IPatternMatch eventAtom) {
		String patternName = eventAtom.patternName();

		// to remove package name
		patternName = patternName.substring(patternName.lastIndexOf(".") + 1);

		if (!pattern.startsWith(patternName + " ")) {
			return false;
		}

		return true;
	}

	final String parameterType = "parameterType";
	final String parameterField = "parameterField";
	final String parameterValue = "parameterValue";


	
	private ArrayList<Map<String, String>> parseBinds2() {
		ArrayList<Map<String, String>> ret = new ArrayList<Map<String, String>>();

		String[] bindDefs = binds.split(",");
		for (String bindDef : bindDefs) {
			HashMap<String, String> map = new HashMap<String, String>();

			String[] bindItem = bindDef.split("=");
			

			map.put(parameterField, bindItem[0]);
			map.put(parameterValue, bindItem[1]);
			
			ret.add(map);
		}
		return ret;
	}
	
	
	
	private Map<String,Object> parseEventAtomObjects(IPatternMatch eventAtom)
	{
		List<String> paramenterNames = eventAtom.parameterNames();
		
		Map<String,Object> parameterObjects=new HashMap<String, Object>();

		for(String name:paramenterNames)
		{
			parameterObjects.put(name,  eventAtom.get(name));
		}
		
		return parameterObjects;
	}


}
