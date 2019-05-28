
public class CheckingAccount extends Account {

	public CheckingAccount(int agency, int accountNumber) {
		super(agency, accountNumber);
//		here we are calling the constructor method of the mother class.
	}

//	marker override asserts that we are dealing with the same method.
//	we can also call the mother method there.
//	the withdrawal rule for Checkings accounts is: 0,50 tax pro withdrawal.
	@Override
	public boolean withdrawal(double value) {
		value += 0.5;
		return super.withdrawal(value);
	}
}
