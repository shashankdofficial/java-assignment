package question1;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.deposite(1100);
		
		try {
			ac.withdraw(500);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ac.withdraw(500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ac.withdraw(500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
