package student;

public class StudentDetails {

	int roll;
	String name;
	int age;
	//zero argument constructor
	public StudentDetails() {
		roll= 01;
		name= "Shashank";
		age = 24;
	}
	//overloaded parameterized constructor
	public StudentDetails(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public void showDetails() {
		System.out.println("Roll Number : "+roll);
		System.out.println("Employee Name : "+name);
		System.out.println("Age is : "+age);
	}
	public static void main(String[] args) {
		StudentDetails std1=new StudentDetails();
		std1.showDetails();
		StudentDetails std2=new StudentDetails(02, "Gautam", 25);
		std2.showDetails();
	}
}
