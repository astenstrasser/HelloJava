package br.com.neobank.bank.test;

import br.com.neobank.bank.model.CheckingAccount;

public class TestingArrays {

	public static void main(String[] args) {

		CheckingAccount[] accounts = new CheckingAccount[2];

		CheckingAccount c1 = new CheckingAccount(12, 2313);
		CheckingAccount c2 = new CheckingAccount(15, 5432);

		accounts[0] = c1;
		accounts[1] = c2;

		accounts[0].deposit(1000.00);

	}

}
