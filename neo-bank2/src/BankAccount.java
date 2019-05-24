
public class BankAccount {

	double balance;
	int agency;
	int accountNumber;
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

}
