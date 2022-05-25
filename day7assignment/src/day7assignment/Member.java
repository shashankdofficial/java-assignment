package day7assignment;


class Member {
	String name; 
	int age; 
	String phone_number; 
	String address;
	double salary;
	
	void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialisation;
	String department;
	public Employee() {}
	public Employee(String name, int age, String phone_number, String address, double salary) {}
	
}
class Manager extends Member{
	String specialisation;
	String department;
}

