package day7assignment;

public class Student {
	int studId;
	String studName;
	public double examFee;
	
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
	Student s1 = new Student();
	double ex = s1.examFee;
	double transportFee(int tfee) {
		return tfee;
		
	}	
}


class Hosteller extends Student{
	double hostelFee;

	public Hosteller() {

	}

	public Hosteller(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	
}