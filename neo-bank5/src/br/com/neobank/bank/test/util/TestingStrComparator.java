package br.com.neobank.bank.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.Client;
import br.com.neobank.bank.model.SavingsAccount;

public class TestingStrComparator {

	public static void main(String[] args) {

		Account cc1 = new CheckingAccount(22, 33);
		Client clienteCC1 = new Client();
		clienteCC1.setClientName("Nico");
		cc1.setAccountHolder(clienteCC1);
		cc1.deposit(333.0);

		Account cc2 = new SavingsAccount(22, 44);
		Client clienteCC2 = new Client();
		clienteCC2.setClientName("Guilherme");
		cc2.setAccountHolder(clienteCC2);
		cc2.deposit(444.0);

		Account cc3 = new CheckingAccount(22, 11);
		Client clienteCC3 = new Client();
		clienteCC3.setClientName("Paulo");
		cc3.setAccountHolder(clienteCC3);
		cc3.deposit(111.0);

		Account cc4 = new SavingsAccount(22, 22);
		Client clienteCC4 = new Client();
		clienteCC4.setClientName("Ana");
		cc4.setAccountHolder(clienteCC4);
		cc4.deposit(222.0);

		List<Account> list = new ArrayList<Account>();
		list.add(cc1);
		list.add(cc2);
		list.add(cc3);
		list.add(cc4);

		list.forEach(account -> System.out.println(account));

//		with comparator:
//		list.sort(new Comparator<Account>() {
//			@Override
//			public int compare(Account a1, Account a2) {
//				String nomeC1 = a1.getAccountHolder().getClientName();
//				String nomeC2 = a2.getAccountHolder().getClientName();
//				return nomeC1.compareTo(nomeC2);
//			}
//		});

//		using lambda:
		list.sort( ( a1, a2)-> {
				String nomeC1 = a1.getAccountHolder().getClientName();
				String nomeC2 = a2.getAccountHolder().getClientName();
				return nomeC1.compareTo(nomeC2); 
			}
		);
		
		System.out.println("---------");

		for (Account account : list) {
			System.out.println(account);
		}

	}

}
