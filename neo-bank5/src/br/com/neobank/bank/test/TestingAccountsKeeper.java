package br.com.neobank.bank.test;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.AccountsKeeper;
import br.com.neobank.bank.model.CheckingAccount;

public class TestingAccountsKeeper {

	public static void main(String[] args) {

		AccountsKeeper accountsKeeper = new AccountsKeeper();
		Account c1 = new CheckingAccount(21, 4244);
		Account c2 = new CheckingAccount(12, 4321);

		accountsKeeper.add(c1);
		accountsKeeper.add(c2);

		int size = accountsKeeper.size();
		System.out.println(size);

		Account ref = accountsKeeper.getReference(0);
		System.out.println(ref.getAccountNumber());
		
		

	};

}
