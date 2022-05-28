package student;

public class Student {

	private int roll;
	private String name;
	private int marks;
	
//	@Override //if we override it here we will not get the address of object of student class in DEMO class
//	public String toString() {
//		return "Welcome to Student Class";
//	}
	
	//For getting the name which will pass through parameter
//	@Override
//	public String toString() {
//		return name;
//	}
	
	//To get the return of roll number or marks we have to change the int into String so for that we concat empty string
	//in the return
//		@Override
//		public String toString() {
//			return roll+" = "+marks+" = "+name;
//		}
	
	//We can create ToString using right click --> source --> to string
	
	
	
	public Student() {

	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
	
	
}
