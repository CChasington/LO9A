import java.io.FileNotFoundException;

/*
* Author Chase Beckley
* 
* Bank account manager with withdraw and exception handling
*/
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
	public void withdraw(double amount) throws NegativeBalanceException, FileNotFoundException{
		if (amount > _balance) {
			throw new NegativeBalanceException(_balance - amount);
		} else {
			 _balance -= amount;
		}
	}
	
	/**
	 * Withdraw a specified amount, or throw an empty exception if there is not enough to withdraw
	 * 
	 * @param amount - the amount to attempt to withdraw
	 */
	public void quickWithdraw(double amount) throws NegativeBalanceException, FileNotFoundException{
		if (amount > _balance) {
			throw new NegativeBalanceException();
		} else {
			_balance -= amount;
		}
		
	}
	
}
