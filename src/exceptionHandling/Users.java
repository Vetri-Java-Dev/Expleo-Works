package exceptionHandling;

import java.util.ArrayList;

public class Users {
	static class User{
		String userName;
		String password;
		
		public User(String userName, String password) {
			this.userName = userName;
			this.password = password;
		}

		public String getUserName() {
			return userName;
		}

		public String getPassword() {
			return password;
		}
		
	}
	
	ArrayList<User> users=new ArrayList<>();
	
	public void addUser(User user) {
		users.add(user);
	}
}
