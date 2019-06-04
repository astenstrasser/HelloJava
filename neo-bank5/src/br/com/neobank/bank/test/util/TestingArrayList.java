package br.com.neobank.bank.test.util;

import java.util.ArrayList;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.CheckingAccount;

public class TestingArrayList {

	public static void main(String[] args) {

//		Generics:<datatype>
		ArrayList<Account> list = new ArrayList<Account>();
		Account c1 = new CheckingAccount(21, 4244);
		Account c2 = new CheckingAccount(12, 4321);

		list.add(c1);
		list.add(c2);

		System.out.println("Size: " + list.size());

		Account ref = list.get(0);
		System.out.println(ref.getAccountNumber());

		list.remove(0);
		System.out.println("Tamanho: " + list.size());

		Account cc3 = new CheckingAccount(33, 311);
		list.add(cc3);

		Account cc4 = new CheckingAccount(33, 322);
		list.add(cc4);

		for (int i = 0; i < list.size(); i++) {
			Object objRef = list.get(i);
			System.out.println(objRef);
		}

		System.out.println("----------");

		for (Account account : list) {
			System.out.println(account);
		}

	}

}
