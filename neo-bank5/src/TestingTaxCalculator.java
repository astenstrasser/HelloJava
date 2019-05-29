
public class TestingTaxCalculator {
	public static void main(String[] args) {

		StocksExchange stocks = new StocksExchange();
		LifeInsurance lifeInsurance = new LifeInsurance();
		CheckingAccount checkingAccount = new CheckingAccount(121, 93212);

		checkingAccount.deposit(800.00);

		TaxCalculator taxCalculator = new TaxCalculator();

		taxCalculator.register(stocks);
		taxCalculator.register(lifeInsurance);
		taxCalculator.register(checkingAccount);

		System.out.println(taxCalculator.getTotalTaxes());

	}

}
