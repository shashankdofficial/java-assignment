package day6ClassUnderstanding;

class Student {
	public int roll_no;
	public String name;
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Roll No. is: "+roll_no+" Name is: "+name);
	}
}
