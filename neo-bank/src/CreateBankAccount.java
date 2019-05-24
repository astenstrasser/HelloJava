
public class CreateBankAccount {

	public static void main(String[] args) {

		Account firstBankAccount = new Account();
		firstBankAccount.balance = 200.0;
		firstBankAccount.balance += 100.0;

		Account secondBankAccount = new Account();
		secondBankAccount.balance = 450.0;

		System.out.println("Balance of First Bank Account: " + firstBankAccount.balance);
		System.out.println("Balance of Second Bank Account: " + secondBankAccount.balance);

//		When we create one object of class account, their properties are set automatically to zero / null.
//		Unless we set a start value at class definition. 

		System.out.println(firstBankAccount.agency);
		System.out.println(firstBankAccount.accountHolder);
		System.out.println(firstBankAccount.accountNumber);

		Account thirdBankAccount = firstBankAccount;
		System.out.println("Balance of Third Bank Account: " + thirdBankAccount.balance);
		System.out.println("Balance of First Bank Account: " + firstBankAccount.balance);

		if (thirdBankAccount == firstBankAccount) {
			System.out.println("They are references to the same bank account!");
		}

//		this accounts we create store only a reference to where the account is at the computer memory. 
//		is important to remember they are not the bank accounts, only references.

	}

}
