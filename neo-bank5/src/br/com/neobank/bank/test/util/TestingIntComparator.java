package br.com.neobank.bank.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.SavingsAccount;

public class TestingIntComparator {

	public static void main(String[] args) {

		Account cc1 = new CheckingAccount(22, 33);
		Account cc2 = new SavingsAccount(22, 44);
		Account cc3 = new CheckingAccount(22, 11);
		Account cc4 = new SavingsAccount(22, 22);

		List<Account> list = new ArrayList<Account>();
		list.add(cc1);
		list.add(cc2);
		list.add(cc3);
		list.add(cc4);

		list.forEach(account -> System.out.println(account));

		list.sort((a1, a2) -> Integer.compare(a1.getAccountNumber(), a2.getAccountNumber()));

		System.out.println("-----");
//
		list.forEach(account -> System.out.println(account));

	}

}
