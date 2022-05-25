package day7assignment;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	void displayDetails() {
		System.out.println(studId);
		System.out.println(studName);
		System.out.println(examFee);
	}
	double payFee() {
		return examFee;
	}

	public Student() {
		
	}

	public Student(int studId, String studName, double examFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
}
class DayScholar extends Student{
	double transportFee;
}
class Hosteller extends Student{
	double hostelFee;
}