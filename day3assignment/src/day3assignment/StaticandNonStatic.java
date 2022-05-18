package day3assignment;

public class StaticandNonStatic {
	
	static int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		// Static variable can call in the main method directly.
//		whereas
//		Non-Static variables are not, to call non-static variables we have to create and object
		
		System.out.println(x);
		
		//to call non-static now we create object which store the address of the object in the hard-disk.
		StaticandNonStatic v1 = new StaticandNonStatic();
		
		System.out.println(v1.y);
	}

}
