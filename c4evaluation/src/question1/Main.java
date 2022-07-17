package question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter DOB in dd-MM-yyyy Format");
		
		String dob = sc.next();
		try {
			LocalDate birthDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate today = LocalDate.now();
			System.out.println(today.getDayOfMonth());
			System.out.println(today.getMonthValue());
			Period period = Period.between(birthDate, today);
			int years = period.getYears();
			
			int bDate = birthDate.getDayOfMonth();
			int bMonth = birthDate.getMonthValue();
			if(bDate == today.getDayOfMonth() && bMonth == today.getMonthValue() && years >= 18) {
				System.out.println("Happy birthday, You are eligible to cast your vote");
			}
			else if(years >= 18) {
				System.out.println("You are eligible to cast your vote");
			}
			else {
				System.out.println("You are not eligible to cast your vote");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
