
public class UsingDepositMethod {

	public static void main(String[] args) {
		Account marleysAccount = new Account();
		marleysAccount.balance = 100.0;
		marleysAccount.deposit(580.00);
		if (marleysAccount.balance == 680.00) {
			System.out.println("deposit is working");
		}
	}

}
