package question3;

public class FinallyKey {

	
	//Finally block is the block which will always be executed whether Exception is handled or not.
	//if you want explicitly stop to be execute finally block then we have to write in try block System.exit(1);
	//Finally block is used only where Try and Catch block occurs.
	//we cannot use Finally block individually.
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Start Try");
			
			System.out.println(100/0);
			
			System.out.println("End of Try");
		} 
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("Inside Finally");
		}
	}

}
