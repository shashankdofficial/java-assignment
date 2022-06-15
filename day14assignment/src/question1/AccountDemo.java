package question1;

public class AccountDemo {

	public static void main(String[] args) throws InsufficientFundsException {
		
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
		ac.deposite(500);
		ac.deposite(2000);
		
		System.out.println(ac.balance);
		ac.withdraw(1700);
	}

}
