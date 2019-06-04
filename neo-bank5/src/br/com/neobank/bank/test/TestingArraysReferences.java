package br.com.neobank.bank.test;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.SavingsAccount;

public class TestingArraysReferences {

	public static void main(String[] args) {

		Account[] accounts = new Account[5];

		CheckingAccount c1 = new CheckingAccount(12, 999);
		accounts[0] = c1;

		SavingsAccount c2 = new SavingsAccount(26, 543);
		accounts[1] = c2;

		System.out.println(accounts[1].getAccountNumber());

//		CheckingAccount reference = (CheckingAccount) accounts[1];
//		this would raise an ClassCastException! We can not cast an SavingsAccount as CheckingAccount

		CheckingAccount reference = (CheckingAccount) accounts[0];
		System.out.println(c1.getAccountNumber());
		System.out.println(reference.getAccountNumber());
	}

}
