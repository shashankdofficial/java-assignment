package question2;

import java.util.Scanner;

public class UserRegistration {

	public String registerUser(String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			return ("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Username:");
		String un = sc.next();
		
		System.out.println("Enter Country:");
		String con = sc.next();
		try {
			String res = ur.registerUser(con);
			System.out.println(res);
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
