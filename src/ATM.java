
public class ATM {
	private BankAccount _bankAccount;
	
	public ATM() {
		_bankAccount = new BankAccount(500);
	}
	

	
	public void handleTransactions() {
		
		//Negative balance Exception on withdraw
		
		try {
			_bankAccount.withdraw(600);
		} catch(NegativeBalanceException e) {
			System.out.println(e);            
	        System.out.println(e.getMessage()); 
		}
		
		//Negative balance exception on quickWithdraw
		
		try {
			_bankAccount.quickWithdraw(600);
			
		} catch(NegativeBalanceException e) {
			System.out.println(e);            
	        System.out.println(e.getMessage()); 
		}
		
	}
	
	public static void main(String[] args) {
	    ATM atm = new ATM();
	    atm.handleTransactions();
	}
	
	
}
