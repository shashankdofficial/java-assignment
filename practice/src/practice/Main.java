package practice;

//Setter and Getter's

//public class Main {
//
//	public static void main(String[] args) {
//		Test t = new Test();
////		t.setRoll(101);
////		t.setName("Shashank Dubey");
//		if(t.getRoll()==101 && t.getName()=="Shashank")
//		t.showDetails();
//		else
//			System.out.println("Wrong credential");
//	}
//
//}
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String employeeName = sc.nextLine();
		
		System.out.println("Enter your Id: ");
		int employeeId = sc.nextInt();
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter pf Percentage");
		int pfpercentage = sc.nextInt();
		
		Employee e1 = new Employee(employeeId,employeeName,salary,pfpercentage);
		e1.calculateNetSalary(pfpercentage);
		e1.showDetails();
	}
}
