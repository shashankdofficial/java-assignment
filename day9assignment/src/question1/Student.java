package question1;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student() {
		
	}


	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public char calculateGrade(int marks) {
		if(marks>=500) {
			this.grade = 'A';
		}
		else if(marks<500 & marks>=400) {
			this.grade = 'B';
		}
		else {
			this.grade = 'C';
		}
		return grade;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}


	public void displayDetails() {
		System.out.println("Roll no. is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks are: "+marks);
		System.out.println("Grade is: "+grade);
	}
}
