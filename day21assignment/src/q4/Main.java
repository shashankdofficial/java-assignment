package q4;

public class Main {

	public static void main(String[] args){
		
		MyThread mt=new MyThread();
		
		mt.start();
		
		System.out.println(mt.total);
	}
}
