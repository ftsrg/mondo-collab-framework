package hu.bme.mit.ftsrg.xacml.access_control.profiles;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * User database
 * @author Krisz
 *
 */

public final class UserDataBase {
	protected static Set<Role> roles;
	private static final Set<User> users;
	
	static {
		User alice = new User("alice");
		User bob = new User("bob");
		Role designer = new Role("designer");
		Role editor = new Role("editor");
		alice.setRole(designer);
		bob.setRole(editor);
		
		Set<User> userSet = new HashSet<User>();
		userSet.add(alice);
		userSet.add(bob);
		users = Collections.unmodifiableSet(userSet);
		
		Set<Role> roleSet = new HashSet<Role>();
		roleSet.add(designer);
		roleSet.add(editor);
		roles = Collections.unmodifiableSet(roleSet);
		
    }

	public static Set<Role> getRoles(){
		return roles;
	}
	public static Set<User> getUsers(){
		return users;
	}
	public static User getUser(String name){
		for (User u : users) {
		    if(u.getName().equals(name)){
		    	return u;
		    }  
		}
		return null;
	}
}
