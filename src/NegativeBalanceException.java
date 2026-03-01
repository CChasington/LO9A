import java.io.FileNotFoundException;

import java.io.PrintWriter;

/**
 * Author Chase Beckley
 * 
 * Exception for if a negative balance is attempted to be set. Writes to file "logfile.txt"
 */

public class NegativeBalanceException extends Exception {
	private double _negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	
	/**
	 * @param negativeBalance - the amount that the account was attempted to be set to.
	 */
	public NegativeBalanceException(double negativeBalance) throws FileNotFoundException {
		super("Amount exceeds balance by " + Double.toString(negativeBalance));
		this._negativeBalance = negativeBalance;

		PrintWriter writer = new PrintWriter("logfile.txt");
		writer.println("Amount exceeds balance by " + Double.toString(negativeBalance));
        
	}
	
	@Override
	public String toString() {
		return "Balance of " + Double.toString(_negativeBalance) + " not allowed";
	}
}
