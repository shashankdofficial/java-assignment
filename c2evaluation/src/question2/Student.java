package question2;

public class Student {

	int roll;
	String name;
	String address;
	int marks;
	
	
	public Student() {

	}


	public Student(int roll, String name, String address, int marks) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	public void printDetails() {
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Address is: "+address);
		System.out.println("Marks is: "+marks);
	}
	public void averageStudent() {
		
	}
	
}
