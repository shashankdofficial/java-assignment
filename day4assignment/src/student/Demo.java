package student;

public class Demo {
	
	String a;
	int b;
	float f;
	void func() {
		
	}
	public Demo(){
		System.out.println("Empty");
	}
	public Demo(String a){
		this();
		this.func();
		this.a = a;
		System.out.println("From a "+a);
	}
	public Demo(int b){
		this("ABC");
		this.b = b;
		System.out.println("From b "+b);
	}
	public Demo(float f){
		this.f = f;
		System.out.println("from f "+f);
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo(1);
	}

}
