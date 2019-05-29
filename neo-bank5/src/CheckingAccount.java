
public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agency, int accountNumber) {
		super(agency, accountNumber);
	}

	@Override
	public boolean withdrawal(double value) {
		value += 0.5;
		return super.withdrawal(value);
	}

	@Override
	public double getTaxes() {
		return super.getBalance()* 0.01;
	}
}
