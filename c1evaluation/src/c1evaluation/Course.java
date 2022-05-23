package c1evaluation;
import java.util.Scanner;
public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	static void authenticate(String username, String password) {
		if(username=="admin" & password=="1234") {
			Course d = new Course();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Course Id: ");
			d.courseId = scan.nextInt();
			
			System.out.println("Enter Course Name: ");
			d.courseName = scan.next();
			
			System.out.println("Enter courseFee");
			d.courseFee = scan.nextInt();
			
			d.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or Password");
		}
	}
	public static void main(String[] args) {
		authenticate("admin","1234");
	}
}
