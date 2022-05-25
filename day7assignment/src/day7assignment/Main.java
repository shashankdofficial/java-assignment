package day7assignment;

public class Main{
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Manager manager = new Manager();
		
		employee1.name = "Gautam Maurya";
		employee1.age = 25;
		employee1.phone_number = "9651442006";
		employee1.address = "Sichayi Vibhag";
		employee1.salary = 25000;
		
		Employee employee2 = new Employee("Rohit",20,"2563254215","Ghora Aspatal",25000);
		
		manager.name = "Shashank Dubey";
		manager.age = 24;
		manager.phone_number = "7905096489";
		manager.address = "Shbham Nagar";
		manager.salary = 40677;
		
		System.out.println(employee1.name);
		System.out.println(employee1.age);
		System.out.println(employee1.phone_number);
		System.out.println(employee1.address);
		System.out.println(employee1.salary);
		System.out.println("==============");
		System.out.println(employee2);
		System.out.println("==============");
		System.out.println(manager.name);
		System.out.println(manager.age);
		System.out.println(manager.phone_number);
		System.out.println(manager.address);
		System.out.println(manager.salary);
		
		employee1.printSalary();
	}
}
