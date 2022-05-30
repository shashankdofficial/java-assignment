package question4;

public class Person {
	
	Address a1 = new Address();
	
	String name;
	String gender;

}

class Instructor extends Person{	
	
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", a1=" + a1 + ", name=" + name
				+ ", gender=" + gender + "]";
	}
	int instructorId;
	int salary;
	
}

class Student extends Person{
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", a1=" + a1 + ", name=" + name + ", gender=" + gender + "]";
	}
	int studentId;
	String courseEnrolled;
	int courseFee;
}