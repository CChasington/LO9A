
public class NegativeBalanceException extends Exception {
	private double _negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by " + Double.toString(negativeBalance));
		this._negativeBalance = negativeBalance;
	}
	
	@Override
	public String toString() {
		return "Balance of " + Double.toString(_negativeBalance) + " not allowed";
	}
}
