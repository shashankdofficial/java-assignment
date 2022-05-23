package practice;

//public class Test {
//	private int roll = 101;
//	private String name = "Shashank";
//	private String company = "SBI";
//	
//	public Test() {
//		
//	}
//	public Test (int roll, String name, String company) {
//		this.company = company;
//		this.roll = roll;
//		this.name = name;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//	public String getCompany() {
//		return company;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public int getRoll() {
//		return roll;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void showDetails() {
//		System.out.println("Company is: "+ company);
//		System.out.println("Roll is: "+ roll);
//		System.out.println("Name is: "+ name);
//	}
//}


//Scanner Class Method
import java.util.Scanner;
public class Test{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Your Father Name: ");
		String fname = scan.nextLine();
		System.out.println("Enter Your Mother Name: ");
		String mname = scan.nextLine();
		
		System.out.println("My name is: "+ name);
		System.out.println("My Father name is: "+ fname);
		System.out.println("My Mother name is: "+ mname);
		
		scan.close();
	}
}
