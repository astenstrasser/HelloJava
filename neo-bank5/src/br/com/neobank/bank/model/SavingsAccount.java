package br.com.neobank.bank.model;

public class SavingsAccount extends Account {

	public SavingsAccount(int agency, int accountNumber) {
		super(agency, accountNumber);
	}

	@Override
	public String toString() {
		return "Savings Account - "+super.toString();
	}
	
}
