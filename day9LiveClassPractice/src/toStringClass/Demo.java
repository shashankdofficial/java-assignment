package toStringClass;

public class Demo {

	void fun1() {
		System.out.println("Inside fun1 of Demo");
	}
	
//	@Override
//	public String toString() {
//		return "Welcome to Java";
//	}
	
	@Override //Using shortcut ctrl + spaceBar
	public String toString() {
		return "Welcome To JAVA";
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		//d1.fun1();
		
		//String s = d1.toString(); //We can call all Object class methods
		//because every class is the child class of Object Class
		
		//System.out.println(s);
		
		System.out.println(d1); //it will print the same
		//because it will call from PrintLn
		//printLn belongs to PrintStream
		
		//Now because it is that every class is the child class of Object class we can Override that toString method
		//So let do it
		
		//This is called Dynamic Polymorphium
	}

}
