package org.mondo.collaboration.security.mpbl.client.ui.wizards;

import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.team.svn.ui.repository.model.RepositoriesRoot;
import org.eclipse.team.svn.ui.repository.model.RepositoryLocation;
import org.mondo.collaboration.security.mpbl.client.ui.ImageDescriptorCollection;

import com.google.common.collect.Maps;

public class MondoLoginWizardPage extends WizardPage {
    
    private Text usernameField;
    private Text passwordField;
    private Combo repositoryField;
    private String username;
    private String password;
    private RepositoryLocation location;
    private Map<String, RepositoryLocation> locations = Maps.newHashMap();
    
    /**
     * Create the wizard.
     */
    public MondoLoginWizardPage() {
        super("MondoLoginPage");
        setTitle("Mondo Login Page");
        setDescription("Provide your SVN credentials to use the services of the MONDO Client");
        setImageDescriptor(ImageDescriptorCollection.MONDO_LOGO_64);
        
        setPageComplete(false);
        
        for(Object obj : (RepositoryLocation[]) new RepositoriesRoot().getChildren(null)) {
            RepositoryLocation location = (RepositoryLocation) obj;
            locations.put(location.getRepositoryLocation().getRepositoryRootUrl(), location);
        }
    }

    /**
     * Create contents of the wizard.
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
        container.setLayout(new GridLayout());
        
        GridLayout layout = (GridLayout) container.getLayout();
        layout.numColumns = 2;

        Label repositoryLabel = new Label(container, SWT.RIGHT);
        repositoryLabel.setText("Front repository: ");

        repositoryField = new Combo(container, SWT.SINGLE);
        repositoryField.setItems(locations.keySet().toArray(new String[0]));
        repositoryField.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                super.widgetSelected(e);
                String loc = repositoryField.getItem(repositoryField.getSelectionIndex());
                location = locations.get(loc);
                
                passwordField.setText(location.getRepositoryLocation().getPassword());
                usernameField.setText(location.getRepositoryLocation().getUsername());
                
                passwordField.redraw();
                usernameField.redraw();
                
                validatePage();
            }
        });
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        repositoryField.setLayoutData(data);

        
        Label usernameLabel = new Label(container, SWT.RIGHT);
        usernameLabel.setText("Username: ");

        usernameField = new Text(container, SWT.SINGLE);
        data = new GridData(GridData.FILL_HORIZONTAL);
        usernameField.setLayoutData(data);
        usernameField.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                username = usernameField.getText();
                validatePage();
            }
            
        });
        
        Label passwordLabel = new Label(container, SWT.RIGHT);
        passwordLabel.setText("Password: ");

        passwordField = new Text(container, SWT.SINGLE | SWT.PASSWORD);
        data = new GridData(GridData.FILL_HORIZONTAL);
        passwordField.setLayoutData(data);
        passwordField.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                password = passwordField.getText();
                validatePage();
            }
            
        });
    }
    
    public String getUser() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFrontRepository() {
        return location.getRepositoryLocation().getRepositoryRootUrl();
    }
    
    private void validatePage() {
        if(getUser() != null && !getUser().isEmpty() && location != null)
            setPageComplete(true);
        else
            setPageComplete(false);
    }
}
