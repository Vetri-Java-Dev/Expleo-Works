package exceptionHandling;

import java.util.Scanner;
import exceptionHandling.Users.User;

class InvalidUserName extends Exception{
	public InvalidUserName(String msg) {
		super(msg);
	}
}

class InvalidPassword extends Exception{
	public InvalidPassword(String msg) {
		super(msg);
	}
}

public class Validator {
	
	public static void validate(User user) throws InvalidUserName,InvalidPassword {
		String name=user.getUserName();
		String password=user.getPassword();
		
		if(name.length()<6||name.length()>30) {
			throw new InvalidUserName("Invalid username length.");
		}
		else {
			if(!name.matches("^[A-Za-z][A-Za-z0-9_]{5,29}$")) {
				throw new InvalidUserName("Invalid username.");
			}
		}

		if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()\\-+]).{8,}$")) {
            throw new InvalidPassword("Invalid Password");
        }

        System.out.println("Welcome "+name);
    
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Users users=new Users();
		
		System.out.println("Enter username:");
	    String name = scanner.nextLine();

	    System.out.println("Enter password:");
	    String password = scanner.nextLine();
	    
		Users.User user = new Users.User(name,password);
		
		try {
			validate(user);
		}
		catch(InvalidUserName | InvalidPassword e){
			e.printStackTrace();
		}
	}
}
