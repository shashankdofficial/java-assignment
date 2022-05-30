package question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number for the size of Array");
		int num = s1.nextInt();
		
		Student[] std = new Student[num];
		
		int sum = 0;
		
		for(int i=0; i<std.length; i++) {
			System.out.println("Enter your Roll no: ");
			int roll = s1.nextInt();
			
			System.out.println("Enter your Name:");
			String name = s1.next();
			
			System.out.println("Enter your Address:");
			String address = s1.next();
			
			System.out.println("Enter Your Marks");
			int marks = s1.nextInt();
			
			Student std2 = new Student(roll,name,address,marks);
			
			std[i] = std2;
			
//			std2.printDetails();
//			System.out.println("================");
			sum += std2.marks;
		}

		for(int i=0; i<std.length; i++) {
			std[i].printDetails();
			System.out.println("================");
		}
		double average = sum/num;
		System.out.println("Average is: "+average);
		
		s1.close();
	}
}
