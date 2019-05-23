
public class CreateBankAccount {

	public static void main(String[] args) {

		Account firstBankAccount = new Account();
		firstBankAccount.balance = 200.0;
		firstBankAccount.balance += 100.0;

		Account secondBankAccount = new Account();
		secondBankAccount.balance = 450.0;

		System.out.println("Balance of First Bank Account: " + firstBankAccount.balance);
		System.out.println("Balance of Second Bank Account: " + secondBankAccount.balance);

	}

}
