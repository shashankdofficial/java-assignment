package question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("Java");
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your Paragraph:");
		String match = s1.nextLine();
		
		
		Matcher m = p.matcher(match);
		while (m.find()) {
		count++;
		System.out.println(m.start() + "------" + m.end() + "------" + m.group());
		}
		System.out.println("The no of occurences:" + count);
		
		s1.close();
	}

}
