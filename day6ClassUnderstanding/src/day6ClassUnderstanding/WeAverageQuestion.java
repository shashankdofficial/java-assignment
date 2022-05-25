package day6ClassUnderstanding;

public class WeAverageQuestion {

	public static void main(String[] args) {
		int[] age = {34,56,26,87,90};
		int total = 0;
		int average = 0;
		for(int item: age) {
			total += item;
		}
		average = total/age.length;
		
		System.out.println(average);
	}

}
