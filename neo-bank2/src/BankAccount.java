
public class BankAccount {

//	private properties can not be accessed from outside the class scope. 
//	they need to be called with a method.

	private double balance;
	private int agency;
	private int accountNumber;
	Client accountHolder;

//	this accountHolder is a reference of an object client.
//	we could also do something like: Client accountHolder = new Client();
//	The reason we don't is that one client could have more than one account.

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
	
//	adding get and set methods
	

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

}
