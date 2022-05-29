package question2;

import java.util.Scanner;

public class Child extends Parent {

	@Override
	void method1(int number) {
		System.out.println("Number is: "+number);
	}
	
	void method4() {
		System.out.println("Inside method4 in Child Class");
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		int number = s1.nextInt();
		
		
//		Child c1 = new Child();
//		c1.method1(number);

		Parent p = new Child();
		p.method1(number);
		p.method2();
		p.method3();
		Child c = (Child)p;
		c.method4();
		
		
		s1.close();
	}
}
