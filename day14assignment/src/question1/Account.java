package question1;

public class Account {

	String accountNumber;
	double balance;
	
	void deposite(int amount) {
		balance += amount;
		System.out.println("Balance is: "+balance);
	}
	void withdraw(int amount) throws Exception {
		
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("After Withdraw amount is: "+balance);
		}
		else {
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient Fund!");
			throw ife;
		}
	}
}
