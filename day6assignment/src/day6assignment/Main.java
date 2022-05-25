package day6assignment;
import java.util.Scanner;
class Main{
	public static String reverseString(String sr) {
		int leng=sr.length();
		String[] arr=sr.split("");
		String reverse="";
		for(int i=leng-1;i>=0;i--) {
			reverse=reverse+arr[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String To Reverse");
		String originalString=sc.next();
		String result=reverseString(originalString);
		
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		
		sc.close();
	}
}
