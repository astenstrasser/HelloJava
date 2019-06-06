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
		cc1.deposit(333.0);

		Account cc2 = new SavingsAccount(22, 44);
		cc2.deposit(444.0);

		Account cc3 = new CheckingAccount(22, 11);
		cc3.deposit(111.0);

		Account cc4 = new SavingsAccount(22, 22);
		cc4.deposit(222.0);

		List<Account> list = new ArrayList<Account>();
		list.add(cc1);
		list.add(cc2);
		list.add(cc3);
		list.add(cc4);
		
		for (Account account : list) {
			System.out.println(account);
		}
		
		AccountNumberComparator comparator = new AccountNumberComparator();
		list.sort(comparator);
		
		System.out.println("-----");
		
		for (Account account : list) {
			System.out.println(account);
		}
		
	}

}

class AccountNumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
    	return Integer.compare(a1.getAccountNumber(), a2.getAccountNumber());
    }
}
