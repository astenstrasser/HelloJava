package br.com.alex.neobank;

import br.com.neobank.bank.model.Account;
import br.com.neobank.bank.model.CheckingAccount;

public class TestLibrary {
	
	public static void main(String[] args) {
		
		Account account1 = new CheckingAccount(123,1234);
		account1.deposit(150.00);
		
		Account account2 = new CheckingAccount(432,9483);
		
		try {
			account1.transfer(900, account2);			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
