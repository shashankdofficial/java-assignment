package question3;

public class ThrowThrows {

	//The throw keyword in Java is used to throw an exception explicitly.
	//We specify the exception object which is to be thrown. The exception has some message with it that provides the error description.
	
	//Syntax :- 
	// throw new exception_class("error message");
	
	public static void validate (int age) {
		if(age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote!");
		}
	}
	
	public static void main(String[] args) {
		validate(11);
	}
}
