package day6ClassUnderstanding;

public class Doubled {
	public static void main(String[] args) {
		int[] marks = {10,20,30};
		
		//Make a function of integer
		int[] doubled = doubleTheArray(marks);
		for(int item:doubled) {
			System.out.println(item);
		}
	}
	//make the public static integer array method is mandatory
	public static int[] doubleTheArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i] = 2*array[i];
		}
		return array;
		//then return the integer array
	}
}
