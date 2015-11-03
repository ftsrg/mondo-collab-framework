package org.mondo.collaboration.security.lens.test.algorithm;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.security.lens.bx.OfflineCollaborationSession;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;

import es.ikerlan.wt.emf.mondocollab.UniqueIDFactory;

public class AbstractTestBase {

    protected enum Type {
        PUTBACK, GET
    }

    URI goldConfinementURI = URI.createURI("gold.xmi");
    ResourceSet goldResourceSet;
    URI frontConfinementURI = URI.createURI("front.xmi");
    ResourceSet frontResourceSet;
    UniqueIDSchemeFactory uniqueIDSchemeFactory = new UniqueIDFactory();
    Resource policyResource;
    String userName = "Alice";
    DataTypeObfuscator<String> stringObfuscator = new StringObfuscator("seed", "salt", "obfuscated");

    protected void execute(Type type) throws IncQueryException {
        OfflineCollaborationSession session = new OfflineCollaborationSession(
                goldConfinementURI, getGoldResourceSet(),
                frontConfinementURI, getFrontResourceSet(), 
                getUniqueIDSchemeFactory(), policyResource, 
                getUserName(), getStringObfuscator());

        if (type == Type.PUTBACK)
            session.getLens().doPutback();
        else if (type == Type.GET)
            session.getLens().doGet();
    }

    public ResourceSet getGoldResourceSet() {
        return goldResourceSet;
    }

    public void setGoldResourceSet(ResourceSet goldResourceSet) {
        this.goldResourceSet = goldResourceSet;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ResourceSet getFrontResourceSet() {
        return frontResourceSet;
    }

    public void setFrontResourceSet(ResourceSet frontResourceSet) {
        this.frontResourceSet = frontResourceSet;
    }

    public UniqueIDSchemeFactory getUniqueIDSchemeFactory() {
        return uniqueIDSchemeFactory;
    }

    public void setUniqueIDSchemeFactory(UniqueIDSchemeFactory uniqueIDSchemeFactory) {
        this.uniqueIDSchemeFactory = uniqueIDSchemeFactory;
    }

    public DataTypeObfuscator<String> getStringObfuscator() {
        return stringObfuscator;
    }

    public void setStringObfuscator(DataTypeObfuscator<String> stringObfuscator) {
        this.stringObfuscator = stringObfuscator;
    }

}
