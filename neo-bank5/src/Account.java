
public abstract class Account {

	private double balance;
	private int agency;
	private int accountNumber;
	private Client accountHolder;
	private static int total;

	public Account(int agency, int accountNumber, Client accountHolder) {
		Account.total++;
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 0;
	}
	
	public Account(int agency, int accountNumber) {
		Account.total++;
		this.agency = agency;
		this.accountNumber = accountNumber;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdrawal(double value) throws NotEnoughMoneyException {
		if (this.balance < value) {
			throw new NotEnoughMoneyException("Not enough Money");
		}
		this.balance -= value; 
	}

	public void transfer(double value, Account destinationAccount) throws NotEnoughMoneyException {
		this.withdrawal(value);
		destinationAccount.deposit(value);
		
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAgency() {
		return this.agency;
	}

	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("Can not set a value <= 0 as agency");
			return;
		}
		this.agency = agency;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		if (accountNumber <= 0) {
			System.out.println("Can not set a value <= 0 as account number");
			return;
		}
		this.accountNumber = accountNumber;
	}

	public Client getAccountHolder() {
		return this.accountHolder;
	}
	
	public void setAccountHolder(Client accountHolder) {
		this.accountHolder = accountHolder;
	}
	

	public static int getTotal() {
		return total;
	}

}
