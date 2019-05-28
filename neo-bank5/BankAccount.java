
public class BankAccount {


	private double balance;
	private int agency;
	private int accountNumber;
	private Client accountHolder;

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

	public boolean transfer(double value, BankAccount destinationAccount) {
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

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Client getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(Client accountHolder) {
		this.accountHolder = accountHolder;
	}

}
