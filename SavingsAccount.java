
public class SavingsAccount extends BankAccount {
	
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber = super.getAccountNumber();
	
	//default constructor
	public SavingsAccount(String name, double amount){
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + Integer.toString(savingsNumber);
	}
	
	
	
	public void postInterest(){
		double interestAmount = super.getBalance() * (rate / 12);
		double finalAmount = super.getBalance() + interestAmount;
		super.setBalance(finalAmount);
	}
	
	
	//copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		
		savingsNumber++;
		
		accountNumber = oldAccount.accountNumber + Integer.toString(savingsNumber);
	}

}
