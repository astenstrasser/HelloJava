package br.com.neobank.bank.test;

import org.junit.*;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.AccountsKeeper;
import br.com.neobank.bank.model.CheckingAccount;

public class TestAccountsKeeper {

	@Test
	public void SizeFunction() {
		AccountsKeeper accountsKeeper = new AccountsKeeper();
		Account c1 = new CheckingAccount(21, 4244);
		Account c2 = new CheckingAccount(12, 4321);

		accountsKeeper.add(c1);
		accountsKeeper.add(c2);

		int size = accountsKeeper.size();
		Assert.assertEquals(2, size);
	}

	@Test
	public void mustBeCapableToUseMethodsOnReferencesFromArray() {
		AccountsKeeper accountsKeeper = new AccountsKeeper();
		Account c1 = new CheckingAccount(21, 4244);

		accountsKeeper.add(c1);

		Account ref = accountsKeeper.getReference(0);
		Assert.assertEquals(4244, ref.getAccountNumber());
	}

}
