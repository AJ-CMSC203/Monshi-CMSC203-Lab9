
public class CheckingAccount extends BankAccount{
	
	static final double FEE = .15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		String accountNumber = super.getAccountNumber() + "-10";
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean completed = true;
		double checkClearFee;
		if(amount <= super.getBalance()) {
			checkClearFee = super.getBalance() - amount - FEE;
		}
		else {
			completed = false;
		}
			
		return completed;
	}
	
	
}
