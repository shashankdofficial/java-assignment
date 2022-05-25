package day6ClassUnderstanding;

class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		students[0] = new Student(01,"Shashank Dubey");
		students[1] = new Student(02,"Aditya Dubey");
		students[2] = new Student(03,"Rahul Dubey");
		students[3] = new Student(04,"Sneha Dubey");
		students[4] = new Student(05,"Rohit Dubey");
		
		//For printing we use For Loop
		for(Student student:students) {
			student.printDetails();
		}
	}

}
