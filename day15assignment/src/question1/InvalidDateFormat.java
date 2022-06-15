package question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InvalidDateFormat extends Exception {

	private String message;

	public InvalidDateFormat(String message) {
		this.message = message;
	}
	public String getMessage()
	{
		return this.message;
	}
}
