package question2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo extends Citizen{

	public boolean validate(String name, String mobileNum, String aadharCard) {

		boolean b1 = Pattern.matches("[6789]{1}[0-9]{9}", mobileNum);
		boolean b2 = Pattern.matches("[0-9]{12}", aadharCard);
		boolean b3 = Pattern.matches("[a-zA-Z]{8}", name);
		if(b1==b2==b3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Demo d1 = new Demo();
		
		System.out.println("Enter your Name:");
		String name = s1.nextLine();
		
		System.out.println("Enter Your Mobile No.:");
		String mobile = s1.next();
		
		System.out.println("Enter your Aadhaar no.:");
		String aadhar = s1.next();
		
		if(d1.validate(name, mobile, aadhar)==true) {
			Citizen c1 = new Citizen();
			c1.name = name;
			c1.mobileNumber = mobile;
			c1.aadharNumber = aadhar;
			c1.printDetails();
		}
		else {
			System.out.println("Please pass the Appropiate value");
		}
		
		s1.close();
	}
}
