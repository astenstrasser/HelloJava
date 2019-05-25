
public class TestingBank {

	public static void main(String[] args) {

		Client sam = new Client();
		sam.setClientName("Sam McMurry");
		sam.setProfession("Writer");
		sam.setTaxNumber("120.350.000-1");

		BankAccount samsBankAccount = new BankAccount();
		samsBankAccount.deposit(1500.00);
		samsBankAccount.setAccountHolder(sam);

		System.out.println(samsBankAccount.getAccountHolder().getProfession());
		System.out.println(samsBankAccount.getAccountHolder());

		BankAccount leasAccount = new BankAccount();

//		leasAccount.getAccountHolder().setClientName("Lea Johnson");
//		We cannot set a value without having the object created.
//		We need to know where to store the information.

		Client lea = new Client();
		leasAccount.setAccountHolder(lea);
		leasAccount.getAccountHolder().setClientName("Lea Johnson");
		leasAccount.deposit(250.00);

//		Now it can be done!

		System.out.println(leasAccount.getAccountHolder().getClientName());

		System.out.println("Using get balance method: " + leasAccount.getBalance());

		leasAccount.setAccountNumber(550000);
		leasAccount.setAgency(201);

		System.out.println("Leas Account Number: " + leasAccount.getAccountNumber());
		System.out.println("Leas Agency: " + leasAccount.getAgency());

	}

}
