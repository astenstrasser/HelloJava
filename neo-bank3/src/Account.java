
public class Account {

	private double balance;
	private int agency;
	private int accountNumber;
	private Client accountHolder;
	private static int total;

//	creating constructor method
	public Account(int agency, int accountNumber, Client accountHolder) {
		if (agency < 0 || accountNumber < 0) {
			System.out.println("Bank account could not be created, invalid data");
			return;
		}
		total++;
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 0;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public boolean withdrawal(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	public boolean transfer(double value, Account destinationAccount) {
		if (this.withdrawal(value)) {
			destinationAccount.deposit(value);
			return true;
		}
		return false;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAgency() {
		return this.agency;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public Client getAccountHolder() {
		return this.accountHolder;
	}

	public static int getTotal() {
		return total;
	}

}
