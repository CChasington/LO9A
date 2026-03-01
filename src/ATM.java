import java.io.FileNotFoundException;

/*
* Author Jiah Folvarko
* 
* ATM for calling transactions involving the bank account
*/
public class ATM {
	private BankAccount _bankAccount;
	
	public ATM() {
		_bankAccount = new BankAccount(500);
	}
	

	// Attempt to withdraw from the bank
	public void handleTransactions() {
		
		//Negative balance Exception on withdraw
		
		try {
			_bankAccount.withdraw(600);
		} catch(NegativeBalanceException e) {
			System.out.println(e);            
	        System.out.println(e.getMessage()); 
		}catch (FileNotFoundException e) {
	        System.out.println("Error writing to log file.");
	    }
		
		//Negative balance exception on quickWithdraw
		
		try {
			_bankAccount.quickWithdraw(600);
			
		} catch(NegativeBalanceException e) {
			System.out.println(e);            
	        System.out.println(e.getMessage()); 
		}  catch (FileNotFoundException e) {
	        System.out.println("Error writing to log file.");
	    }
		
	}
	
	public static void main(String[] args) {
	    ATM atm = new ATM();
	    atm.handleTransactions();
	}
	
	
}
