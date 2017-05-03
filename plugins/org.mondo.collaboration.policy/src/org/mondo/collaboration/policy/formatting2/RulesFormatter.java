package org.mondo.collaboration.policy.formatting2;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.FormatterRequest;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.xbase.formatting2.BlankLineKey;
import org.eclipse.xtext.xbase.formatting2.NewLineKey;
import org.eclipse.xtext.xbase.formatting2.WhitespaceKey;
import org.mondo.collaboration.policy.rules.*;

import com.google.common.collect.Lists;

public class RulesFormatter extends AbstractFormatter2 {
	
	ITextRegionAccess access;
	ISemanticRegion reg;
	List<ISemanticRegion> regs = Lists.newArrayList();
	
	@Override
	protected void initalize(FormatterRequest request) {
		access = getTextRegionAccess();
	}
	
	public void format(Object obj, IFormattableDocument doc){
		LazyLinkingResource res = (LazyLinkingResource) obj;
		TreeIterator<EObject> iter = res.getAllContents();
		EObject prev = iter.next();
		while(iter.hasNext()){
			EObject eObj = iter.next();
			
			//MetaModel
			/*if(eObj instanceof InstanceModel){
				reg = access.regionForEObject(eObj).getRegionFor().keyword("import");
				doc.append(reg, new WhitespaceKey("", true));
				
				reg = access.regionForEObject(eObj).getRegionFor().feature(RulesPackage.Literals.INSTANCE_MODEL__IMPORT_URI);
				doc.append(reg, new BlankLineKey("", 1));
			}*/
			
			//User
			if(eObj instanceof User){
				reg = access.regionForEObject(eObj).getRegionFor().keyword("user");
				doc.prepend(reg, new NewLineKey("", true));
			}
			
			//Group
			if(eObj instanceof Group){
				reg = access.regionForEObject(eObj).getRegionFor().keyword("group");
				if(!(prev instanceof Group)){
					doc.prepend(reg, new BlankLineKey("", 1));
				} else {
				    doc.prepend(reg, new NewLineKey("", true));
				}
				
				reg = access.regionForEObject(eObj).getRegionFor().keyword("{");
				doc.prepend(reg, new WhitespaceKey("", true));
				doc.append(reg, new WhitespaceKey("", false));
				
				regs = access.regionForEObject(eObj).getRegionFor().keywords(",");
				Iterator<ISemanticRegion> i = regs.iterator();
				while(i.hasNext()){
					reg = i.next();
					doc.prepend(reg, new WhitespaceKey("", false));
					doc.append(reg, new WhitespaceKey("", true));
				}
				
				reg = access.regionForEObject(eObj).getRegionFor().keyword("}");
				doc.prepend(reg, new WhitespaceKey("", false));
			}
			
			//Policy
		    if(eObj instanceof Policy){
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("policy");
		        doc.prepend(reg, new BlankLineKey("", 1));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("{");
		        doc.prepend(reg, new WhitespaceKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("}");
		        doc.prepend(reg, new BlankLineKey("", 1));
		        doc.append(reg, new WhitespaceKey("", true));
		    }
		    
		    //Rule
		    if(eObj instanceof Rule){
		        //ISemanticRegion first = access.regionForEObject(eObj).getRegionFor().keyword("rule");
		        //ISemanticRegion second = access.regionForEObject(eObj).getRegionFor().keyword("priority");
		        //doc.interior(first.getPreviousSemanticRegion(), second.getNextSemanticRegion(), );
		    	
		    	reg = access.regionForEObject(eObj).getRegionFor().keyword("rule");
		        doc.prepend(reg, new BlankLineKey("", 1));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("{");
		        doc.prepend(reg, new WhitespaceKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("from");
		        doc.prepend(reg, new NewLineKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("query");
				doc.append(reg, new WhitespaceKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("select");
		        doc.prepend(reg, new NewLineKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("where");
		        doc.append(reg, new NewLineKey("", true));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("}");
		        doc.prepend(reg, new NewLineKey("", true));
		        doc.append(reg, new WhitespaceKey("", true));
		    }
		    
		    //Asset
		    if(eObj instanceof Asset){
		    	reg = access.regionForEObject(eObj).getRegionFor().keyword("(");
		        doc.surround(reg, new WhitespaceKey("", false));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword(")");
		        doc.prepend(reg, new WhitespaceKey("", false));
		        
		        reg = access.regionForEObject(eObj).getRegionFor().keyword("->");
		        doc.surround(reg, new WhitespaceKey("", true));
		     
		        reg = access.regionForEObject(eObj).getRegionFor().keyword(":");
		        doc.prepend(reg, new WhitespaceKey("", false));
			    doc.append(reg, new WhitespaceKey("", true));
		    }
		    
		    //Binding
		    if(eObj instanceof Binding){
		    	reg = access.regionForEObject(eObj).getRegionFor().keyword("where");
		    	doc.prepend(reg, new NewLineKey("", true));
		    }
			
		    prev = eObj;
		}
	}
}
