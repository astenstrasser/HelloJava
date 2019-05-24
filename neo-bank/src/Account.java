public class Account {
	double balance;
	int agency;
	int accountNumber;
	String accountHolder;

	// to set a start value for a property, just do it at class definition:
	// int agency = 01;

	public void deposit(double value) {
		this.balance += value;
	}

//	void is used here to inform that this method won't return anything.

	public boolean withdrawal(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	public boolean transfer(double value, Account destinationAccount) {
		if (this.withdrawal(value)){
			destinationAccount.deposit(value);
			return true;
		}
		return false;
	}

}
