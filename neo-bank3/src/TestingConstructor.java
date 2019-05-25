
public class TestingConstructor {

	public static void main(String[] args) {

		Client mark = new Client("Mark Schwuz", "032.750.000-12", "Lawyer");
		Account marksBankAccount = new Account(0150, 650820, mark);

		marksBankAccount.deposit(800.00);
		System.out.println(marksBankAccount.getAccountHolder().getClientName());
		System.out.println(marksBankAccount.getBalance());

		Client brenda = new Client("Brenda Marques", "014.432.750-00", "Architect");
		Account brendasBankAccount = new Account(-180, -412280, brenda);

		System.out.println(brendasBankAccount);

		int numberOfBankAccounts = Account.getTotal();
		System.out.println(numberOfBankAccounts);

		brendasBankAccount = new Account(180, 412280, brenda);

		numberOfBankAccounts = Account.getTotal();
		System.out.println(numberOfBankAccounts);

	}
}
