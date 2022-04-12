
public class CheckingAccount extends BankAccount {
	
	private static final double Fee = 0.15;
	private String accountNumber;
	
	public CheckingAccount(String name, double amount) {
		
		super(name, amount);
		this.accountNumber = this.getAccountNumber()+ "-10";
		this.setAccountNumber(this.accountNumber);
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		boolean result = super.withdraw(amount + this.Fee);
		
		return result;
	}
}
