package question1;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Roll:");
		int roll = s1.nextInt();
		
		System.out.println("Enter Name:");
		String name = s1.next();
		
		System.out.println("Enter Marks:");
		int marks = s1.nextInt();
		
//		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Enter Roll:");
		int roll2 = s1.nextInt();
		
		System.out.println("Enter Name:");
		String name2 = s1.next();
		
		System.out.println("Enter Marks:");
		int marks2 = s1.nextInt();
		
		Student std1 = new Student(roll, name, marks);
		std1.calculateGrade(marks);
		std1.displayDetails();
		
		System.out.println("===================");
		
		Student std2 = new Student(roll2, name2, marks2);
		std2.calculateGrade(marks2);
		std2.displayDetails();
		
		s1.close();
//		s2.close();
	}
	
}
