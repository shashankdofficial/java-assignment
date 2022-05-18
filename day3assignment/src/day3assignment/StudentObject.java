package day3assignment;

public class StudentObject {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int a, String name, int marks) {
		System.out.println("Roll is: "+a);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
	}

	public static void main(String[] args) {
		
		StudentObject d1 = new StudentObject();
		d1.roll = 10;
		d1.name = "Shashank";
		d1.marks = 600;
		d1.displayStudentDetails(d1.roll, d1.name, d1.marks);

		StudentObject d2 = new StudentObject();
		d2.roll = 96;
		d2.name = "Pankaj";
		d2.marks = 450;
		d2.displayStudentDetails(d2.roll, d2.name, d2.marks);
		
		StudentObject d1 = null;
		StudentObject d2 = null;
	}

}
