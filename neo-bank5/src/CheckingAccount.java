
public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agency, int accountNumber) {
		super(agency, accountNumber);
	}

	@Override
	public void withdrawal(double value) throws NotEnoughMoneyException {
		value += 0.5;
		super.withdrawal(value);
	}

	@Override
	public double getTaxes() {
		return super.getBalance()* 0.01;
	}
}
