
public class TestingAccounts {

	public static void main(String[] args) {

		CheckingAccount ca = new CheckingAccount(123, 4567);
		ca.deposit(100.00);
		
		SavingsAccount sa = new SavingsAccount(980, 7654);
		sa.deposit(100.00);

		ca.transfer(20.00, sa);
		
		System.out.println(ca.getBalance());
		System.out.println(sa.getBalance());
	
	}

}
