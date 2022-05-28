package newDemoAndA;

public class Demo extends A{

	@Override
	public void funA() {
		System.out.println("inside funA of A");
	}
	
	public void funX(A a1) {
		System.out.println("Inside funX of Demo");
		a1.funA();
	}
	
	public static void main(String[] args) {

		Demo d1 = new Demo();
		
		//d1.funX(d1);
//		d1.funX(new A());
		
		//we can pass Null, Child Object and Parents object in Parameter
		
		
		//Now if we pass the B class object
		d1.funX(new B());
		//then the Overridden of B class will be print
		
	}

}
