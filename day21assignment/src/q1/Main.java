package q1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MainThread m = new MainThread();
		
		m.start();
		
		synchronized(m) {
			m.wait();
			System.out.println(m.p);
		}

	}
}
