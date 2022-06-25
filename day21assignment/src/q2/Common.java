package q2;

public class Common {

	//In layman terms, a race condition can be defined as, a condition in which two or more threads compete together to
	//get certain shared resources.
	//For example, if thread A is reading data from the linked list and another thread B is trying to delete the same data.
	//This process leads to a race condition that may result in run time error
	//To solve the data inconsistency problem in java synchronized keyword is used.
	//So the thread-safety is achieved and race condition is avoided by the help of synchronized keyword.
	
	public void fun1(String name){
		System.out.print("Welcome");
		try{
			Thread.sleep(1000);
		}
		catch(Exception ee){
			
		}
		System.out.println(name);
	}
}
