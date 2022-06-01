package question2;
import java.util.Scanner;

public class AllStudents {

public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = s1.next();
		
		
		System.out.println("Enter Address");
		String address = s1.next();
		
		
		System.out.println("Enter physicsMarks");
		int physics = s1.nextInt();
		System.out.println("Enter chemistryMarks");
		int chemistry = s1.nextInt();
		System.out.println("Enter mathsMarks");
		int maths = s1.nextInt();	
		ScienceStudent student = new ScienceStudent(physics,chemistry,maths);
		student.setName(name);
		student.setAddress(address);
		int per1=student.getPercentage();
		System.out.println("Name:"+student.getName());
		System.out.println("Address:"+student.getAddress());
		System.out.println("Percentage of Science Student:"+per1+'%');
		System.out.println("=========================");
		System.out.println(" ");

		System.out.println("Enter historyMarks");
		int hisotry = s1.nextInt();
		System.out.println("Enter civicsMarks");
		int civics = s1.nextInt();

		System.out.println("==========================");

		System.out.println("Enter Student Name");
		String name2 = s1.next();
		System.out.println("Enter Address");
		String address2 = s1.next();
		HistoryStudent history = new HistoryStudent(hisotry,civics);
		history.setAddress(address2);
		history.setName(name2);
		int per=history.getPercentage();
		
		System.out.println("Name:"+student.getName());
		System.out.println("Address:"+student.getAddress());
		System.out.println("Percentage of History Studrnt:"+per+"%");
		
		s1.close();
	}

}
