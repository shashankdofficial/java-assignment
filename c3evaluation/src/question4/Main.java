package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	Customer customer = new Customer();
	public boolean validate(String username, String password, String mobileNumber, String email) {
		int sum = 0;
		if(Pattern.matches("[a-zA-Z]{3,9}", username)) {
			sum++;
		}
		if(Pattern.matches("[0-9]{3,8}", password)) {
			sum++;
		}
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber)) {
			sum++;
		}
		if(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email)) {
			sum++;
		}
		
		if(sum == 3) {
			return true;
		}return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		Main main = new Main();
		
		System.out.println("Enter your username :");
		String username = sc.next();
		
		System.out.println("Enter your password :");
		String password = sc.next();
		
		System.out.println("Enter your mobile number :");
		String mobile = sc.next();
		
		System.out.println("Enter your email :");
		String email = sc.next();
		
		boolean check = main.validate(username, password, mobile, email);
		if(check) {
			customer.setUsername(username);
			customer.setPassword(password);
			customer.setMobileNumber(mobile);
			customer.setEmail(email);
			customer.showDetails();
		}else {
			System.out.println("Enter valid input !");
		}
		sc.close();
	}
}
