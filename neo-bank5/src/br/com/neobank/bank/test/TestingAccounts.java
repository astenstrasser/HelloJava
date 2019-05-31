package br.com.neobank.bank.test;

import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.SavingsAccount;

public class TestingAccounts {

	public static void main(String[] args) {

		CheckingAccount ca = new CheckingAccount(123, 4567);
		ca.deposit(100.00);

		SavingsAccount sa = new SavingsAccount(980, 7654);
		sa.deposit(100.00);

		try {
			ca.transfer(20.00, sa);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(ca.getBalance());
		System.out.println(sa.getBalance());

	}

}
