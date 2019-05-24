
public class UsingWithdrawalMethod {

	public static void main(String[] args) {

		Account sarahsAccount = new Account();
		sarahsAccount.balance = 800.0;
		sarahsAccount.withdrawal(500);
		if (sarahsAccount.balance == 300.0) {
			System.out.println("sucess case is working");
		} else {
			System.out.println("sucess case is not working");
		}

		boolean didItWorked = sarahsAccount.withdrawal(890.0);
		if (didItWorked == false) {
			System.out.println("fail case is working");
		} else {
			System.out.println("fail case is not working");
		}
	}

}
