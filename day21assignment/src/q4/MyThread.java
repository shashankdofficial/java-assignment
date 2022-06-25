package q4;

public class MyThread extends Thread {

	
	//Whenever we need to suspend a synchronized thread unconditionally then we use wait() method.
	//Whenever we need to resume a suspended(waiting) thread then we use notify() method.
	//In the inter-thread communication the thread which require updation it has to call wait() method.
	//The thread which performing updation it will call notify() method, so that waiting thread will gets the notification
	//and it continues its execution with those updation.
	
	int total=0;
	public void run(){
		for(int i=0;i<=100;i++){
			total=total+i;
		}
	}
}
