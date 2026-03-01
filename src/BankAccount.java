import java.io.FileNotFoundException;

public class BankAccount {
	private double _balance;
	
	public BankAccount(double balance) {
		this._balance = balance;
	}
	
	/**
	 * Withdraw a specified amount, or throw an exception if there is not enough to withdraw
	 * 
	 * @param amount - the amount to attempt to withdraw
	 */
	public void withdraw(double amount) throws NegativeBalanceException, FileNotFoundException {
		if (amount > _balance) throw new NegativeBalanceException(_balance - amount);
		
		amount = _balance;
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceException, FileNotFoundException {
		if (amount > _balance) throw new NegativeBalanceException();
		
		amount = _balance;
	}
	
}
