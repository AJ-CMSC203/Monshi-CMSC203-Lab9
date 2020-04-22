
public class CheckingAccount extends BankAccount{
	
	private final double FEE = .15;
	private String accountNumber = super.getAccountNumber() + "-10";
	
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(accountNumber);
	}
	
	
	@Override
	public boolean withdraw(double amount) {
		double finalAmount = amount + FEE;
		super.withdraw(finalAmount);
		
		boolean completed = true;
		return completed;
	}
	
	
}
