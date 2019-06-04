package br.com.neobank.bank.test;

import org.junit.*;

import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.SavingsAccount;

public class TestAccount {

	@Test
	public void testDeposit() {
		CheckingAccount ca = new CheckingAccount(123, 4567);
		ca.deposit(100.00);
		Assert.assertEquals(100.00, ca.getBalance(), 0.0001);
	}

	@Test
	public void testTransferBetween2AccountTypes() {
		CheckingAccount ca = new CheckingAccount(123, 4567);
		ca.deposit(100.00);

		SavingsAccount sa = new SavingsAccount(980, 7654);
		sa.deposit(100.00);

		try {
			ca.transfer(20.00, sa);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		double expectedBalanceCA = 79.50;
		double expectedBalanceSA = 120.00;

		Assert.assertEquals(expectedBalanceCA, ca.getBalance(), 0.00001);
		Assert.assertEquals(expectedBalanceSA, sa.getBalance(), 0.00001);

	}

}
