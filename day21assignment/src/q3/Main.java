package q3;

public class Main {

	public static void main(String[] args) {
		
		Common c1 = new Common();
		Common c2 = new Common();
		
		ThreadA t1=new ThreadA(c1,"Shashank");
		ThreadB t2=new ThreadB(c2,"Rohit");
		
		t1.start();
		t2.start();
	}
}
