package br.com.neobank.bank.test;

import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.SavingsAccount;

public class TestingClassObject {

	public static void main(String[] args) {

//	testing overriding method toString() of class object.

		Object checkingAccount = new CheckingAccount(123, 4532);
		Object savingsAccount = new SavingsAccount(321, 4321);

		System.out.println(checkingAccount);
		System.out.println(savingsAccount);

	}
}
