package q1;

public class MainThread extends Thread {

	Main m;
	int p = 1;
	
	@Override
	public void run() {
		fun1(m);
	}
	
	public synchronized void fun1(Main m) {
		for(int i=1; i<=10; i++) {
			p = p*i;
		}
		this.notify();
	}
}
