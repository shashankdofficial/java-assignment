package question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet <Employee> ts = new TreeSet<>(new SortBySalary());
		Scanner scan = new Scanner(System.in);
		int count=1;
		while(count<=4)
		{
			count++;
			System.out.println("Enter Details Of Employees");
			System.out.println("Enter Employee Id:");
			int empId = scan.nextInt();
			
			System.out.println("Enter Name Of Employee:");
			String empName = scan.next();
			
			System.out.println("Enter Salary Of Employee:");
			double salary = scan.nextDouble();
			ts.add(new Employee(empId,empName,salary));
		}
		System.out.println(ts);
		
		scan.close();
	}
}
