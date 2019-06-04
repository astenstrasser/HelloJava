package br.com.neobank.bank.test;

import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.LifeInsurance;
import br.com.neobank.bank.model.StocksExchange;
import br.com.neobank.bank.model.TaxCalculator;
import org.junit.*;

public class TestTaxCalculator {

	@Test
	public void taxCalculator() {
		StocksExchange stocks = new StocksExchange();
		LifeInsurance lifeInsurance = new LifeInsurance();
		CheckingAccount checkingAccount = new CheckingAccount(121, 93212);

		checkingAccount.deposit(100.00);

		TaxCalculator taxCalculator = new TaxCalculator();

		taxCalculator.register(stocks);
		taxCalculator.register(lifeInsurance);
		taxCalculator.register(checkingAccount);

		Assert.assertEquals(91.00, taxCalculator.getTotalTaxes(), 0.00001);
	}

}
