
public class TestingMethods {

	public static void main(String[] args) {
		Account marleysAccount = new Account();
		Account sarahsAccount = new Account();

		marleysAccount.balance = 100.0;
		marleysAccount.deposit(580.00);
		if (marleysAccount.balance == 680.00) {
			System.out.println("deposit is working");
		}

		sarahsAccount.balance = 800.0;
		sarahsAccount.withdrawal(500);
		if (sarahsAccount.balance == 300.0) {
			System.out.println("sucess withdrawal case is working");
		} else {
			System.out.println("sucess withdrawal case is not working");
		}

		boolean didItWorked = sarahsAccount.withdrawal(890.0);
		if (didItWorked == false) {
			System.out.println("fail withdrawal case is working");
		} else {
			System.out.println("fail withdrawal case is not working");
		}

		System.out.println(sarahsAccount.balance);
		System.out.println(marleysAccount.balance);
		
		if (sarahsAccount.transfer(20.0, marleysAccount) 
				&& sarahsAccount.balance == 280.00 
				&& marleysAccount.balance == 700.00) {
			System.out.println("transfer is working");
		} else {
			System.out.println("transfer is not working");
		}

	}

}
