package day6ClassUnderstanding;

public class ForLoopForPrinting {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//First way loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Second way Loop
		for(int item: arr) {
			System.out.println(item);
		}
	}

}
