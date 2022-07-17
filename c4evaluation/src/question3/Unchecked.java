package question3;

import java.util.Scanner;

public class Unchecked {

	//In Checked Exception
		//Caller need to wrap the method call inside the Try-Catch block'
		//(handle the exception)
		//Caller can delegate the exception handling duty to its own caller by using "Throws" keyword (Skipping the Exception)
	//NullPointerException, ClassCastException, ArithmeticException, DateTimeException, ArrayStoreException
	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
		
		sc.close();
	}
}
