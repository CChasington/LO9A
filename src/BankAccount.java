import java.io.FileNotFoundException;

public class BankAccount {
	private int _balance;
	
	public BankAccount(int balance) {
		this._balance = balance;
	}
	
	public void withdraw(double amount) throws NegativeBalanceException, FileNotFoundException {
		if (amount > _balance) throw new NegativeBalanceException(_balance - amount);
	}
}
