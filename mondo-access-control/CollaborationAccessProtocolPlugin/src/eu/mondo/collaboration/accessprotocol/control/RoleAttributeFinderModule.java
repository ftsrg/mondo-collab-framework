package eu.mondo.collaboration.accessprotocol.control;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.wso2.balana.XACMLConstants;
import org.wso2.balana.attr.AttributeValue;
import org.wso2.balana.attr.BagAttribute;
import org.wso2.balana.attr.StringAttribute;
import org.wso2.balana.cond.EvaluationResult;
import org.wso2.balana.ctx.EvaluationCtx;
import org.wso2.balana.finder.AttributeFinderModule;

import eu.mondo.collaboration.accessprotocol.utils.Role;
import eu.mondo.collaboration.accessprotocol.utils.User;
import eu.mondo.collaboration.accessprotocol.utils.UserDataBase;

/**
 * Sample attribute finder module
 */
public class RoleAttributeFinderModule extends AttributeFinderModule{

    public static final String SUBJECT_ID = "role";

    @Override
    public Set<String> getSupportedCategories() {
        Set<String> categories = new HashSet<String>();
        categories.add("urn:oasis:names:tc:xacml:1.0:subject-category:access-subject");
        return categories;
    }

    @Override
    public Set getSupportedIds() {
        Set<String> ids = new HashSet<String>();
        ids.add("role");
        return ids;   
    }

    @Override
    public EvaluationResult findAttribute(URI attributeType, URI attributeId, String issuer,
                                                            URI category, EvaluationCtx context) {
        List<StringAttribute> roleNames = new ArrayList<StringAttribute>();
        List<AttributeValue> attributeValues = new ArrayList<AttributeValue>();

		URI searchCategory = null;
		try {
			searchCategory = new URI("urn:oasis:names:tc:xacml:1.0:subject-category:access-subject");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URI searchType = null;
		try {
			searchType = new URI("http://www.w3.org/2001/XMLSchema#string");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URI searchId = null;
		try {
			searchId = new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        EvaluationResult result = context.getAttribute(searchType, searchId, issuer, searchCategory);
        if(result != null && result.getAttributeValue() != null && result.getAttributeValue().isBag()){
            BagAttribute bagAttribute = (BagAttribute) result.getAttributeValue();
            if(bagAttribute.size() > 0){
                String userName = ((AttributeValue) bagAttribute.iterator().next()).encode();

                User user = UserDataBase.getUser(userName);
                List<Role> roles = user.getRole();
                for(Role role : roles){
                	roleNames.add(new StringAttribute(role.getRoleId()));
                }  
            }
        }

        if (roleNames != null && roleNames.size() > 0) {
            attributeValues.addAll(roleNames);
        }

        return new EvaluationResult(new BagAttribute(attributeType, attributeValues));
    }

    @Override
    public boolean isDesignatorSupported() {
        return true;
    }
}
