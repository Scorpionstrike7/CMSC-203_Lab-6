
public class SavingsAccount extends BankAccount {
	
	private double rate = 0.0025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance) {
		
		super(name, balance);
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}
	
	public SavingsAccount(SavingsAccount account, double balance){
		super(account, balance);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}
	
	public void postInterest() {
		this.setBalance((this.getBalance() * this.rate) + this.getBalance());
	}
	
	@Overrides
	public String getAccountNumber() {
		return this.accountNumber + "-" + savingsNumber;

	}

}
