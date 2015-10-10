package org.mondo.collaboration.security.mpbl.client.ui.wizards;

import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.jface.wizard.Wizard;

public class MondoPublishLockDefinitionWizard extends Wizard {

    private MondoPublishLockDefinitionWizardPage publishPage;
    private MondoLoginWizardPage loginPage;

    String username;
    String password;
    String description;
    PatternModel model;
    
    public MondoPublishLockDefinitionWizard() {
        setWindowTitle("Publish Lock Definition Wizard");
    }

    @Override
    public void addPages() {
        publishPage = new MondoPublishLockDefinitionWizardPage();
        loginPage = new MondoLoginWizardPage();
        
        addPage(publishPage);
        addPage(loginPage);
    }

    @Override
    public boolean performFinish() {
        username = loginPage.getUser();
        password = loginPage.getPassword();
        model = publishPage.getModel();
        description = publishPage.getDesc();
        
        return true;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public PatternModel getModel() {
        return model;
    }

    public String getFrontRepository() {
        return loginPage.getFrontRepository();
    }
    
    public String getDesc() {
        return description;
    }
    
}
