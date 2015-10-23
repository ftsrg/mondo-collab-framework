package eu.mondo.collaboration.accessprotocol.utils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * User database
 * @author Krisz
 *
 */

public class UserDataBase {
	protected static Set<Role> roles;
	private static final Set<User> users;
	
	static {
		User alice = new User("alice");
		User alice2 = new User("alice2");
		User bob = new User("bob");
		Role designer = new Role("designer");
		Role editor = new Role("editor");
		Role other = new Role("other");
		
		alice.setRole(editor);
		alice2.setRole(editor);
		bob.setRole(designer);
		
		Set<User> userSet = new HashSet<User>();
		userSet.add(alice);
		userSet.add(alice2);
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
	public static User getUser(String userId){
		for (User u : users) {
		    if(u.getId().equals(userId)){
		    	return u;
		    }  
		}
		return null;
	}
}
