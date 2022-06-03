package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("start of main..");
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			
			String message = null;
			
			int num3 = num1 / num2;
			
			if(num3 > 10){
				message = "Welcome to Exception Handling ";
			}
			System.out.println("Message is :"+message.toUpperCase());
			sc.close();
		}
		catch (InputMismatchException inpm) {
			System.out.println("Please enter valid number");
		}
		catch (ArithmeticException ae) {
			System.out.println("num2 should not be 0");
		}
		catch (NullPointerException np) {
			System.out.println("String value is null");
		}
		catch (Exception e) {
			System.out.println("Message is :WELCOME TO EXCEPTION HANDLING");
		}
		
		System.out.println("end of main");
	}

}
