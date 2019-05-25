
public class TestingBank {

	public static void main(String[] args) {

		Client sam = new Client();
		sam.clientName = "Sam McMurry";
		sam.profession = "Writer";
		sam.taxNumber = "120.350.000-1";

		BankAccount samsBankAccount = new BankAccount();
		samsBankAccount.deposit(1500.00);
		samsBankAccount.accountHolder = sam;

		System.out.println(samsBankAccount.accountHolder.profession);
		System.out.println(samsBankAccount.accountHolder);

		BankAccount leasAccount = new BankAccount();

//		leasAccount.accountHolder.clientName = "Lea Johnson";
//		We cannot set a value without having the object created.
//		We need to know where to store the information.

		Client lea = new Client();
		leasAccount.accountHolder = lea;
		leasAccount.accountHolder.clientName = "Lea Johnson";
		leasAccount.deposit(250.00);

//		Now it can be done!

		System.out.println(leasAccount.accountHolder.clientName);

		System.out.println("Using get balance method: " + leasAccount.getBalance());

		leasAccount.setAccountNumber(550000);
		leasAccount.setAgency(201);
		
		System.out.println("Leas Account Number: "+ leasAccount.getAccountNumber());
		System.out.println("Leas Agency: "+ leasAccount.getAgency());

		

	}

}
