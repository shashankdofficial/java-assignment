package day6ClassUnderstanding;

public class CLA {

	public static void main(String[] args) {
		String s0 = args[0];
		String s1 = args[1];
		
//		System.out.println(s0+s1);
//		System.out.println(s1);
		
		//Parsing to convert them into Integer
		
		int i0 = Integer.parseInt(s0);
		int i1 = Integer.parseInt(s1);
		
		System.out.println(i0+i1);
	}

}
