package student;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(10,"Ram",850);
		
		
		//Because we override Student toString in Student class we will now not get theAdresss of object
		//Instead we get the message which we pass there.
		System.out.println(s1);
		
		//Now if suppose we have to take the name which we pass in parameter RAM then in Object class we return the name.
		//now it will give the name Ram
		
		//now let suppose i have to get the roll number then
		//read in Object class
	}
}
