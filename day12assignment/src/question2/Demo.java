package question2;
import java.util.Scanner;

public class Demo extends Citizen{

	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(name.length() > 3 && name.length() <= 8 && aadharCard.length() == 12 && mobileNum.length() == 10) {
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
