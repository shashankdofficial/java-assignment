package question3;

import java.util.Scanner;

public class Demo {
	
	void showDetials(Month m) {
		switch(m.toString()) {
		case "JAN":
			System.out.println("This is the first month of the year January");
			break;
		case "FEB":
			System.out.println("This is the second month of the year February");
			break;
		case "MAR":
			System.out.println("This is the third month of the year March");
			break;
		case "APR":
			System.out.println("This is the fourth month of the year April");
			break;
		case "MAY":
			System.out.println("This is the fifth month of the year May");
			break;
		case "JUN":
			System.out.println("This is the sixth month of the year June");
			break;
		case "JULY":
			System.out.println("This is the seventh month of the year July");
			break;
		case "AUG":
			System.out.println("This is the eigthth month of the year August");
			break;
		case "SEPT":
			System.out.println("This is the nineth month of the year September");
			break;
		case "OCT":
			System.out.println("This is the tenth month of the year October");
			break;
		case "NOV":
			System.out.println("This is the eleventh month of the year November");
			break;
		case "DEC":
			System.out.println("This is the last month of the year December");
			break;
		}
	
	}

	public static void main(String[] args) {
		try {
			Demo demo = new Demo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter month name -");
			String month = sc.next();
			sc.close();
			Month m = Month.valueOf(month);
			demo.showDetials(m);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid Month Name");
		}
	}

}
