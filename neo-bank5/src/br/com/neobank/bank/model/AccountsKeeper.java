package br.com.neobank.bank.model;

public class AccountsKeeper {

	private Account[] references;
	private int position;

	public AccountsKeeper() {
		this.references = new Account[10];
		this.position = 0;
	}

	public void add(Account c) {
		this.references[this.position] = c;
		this.position++;
	}

	public int size() {
		return this.position;
	}

	public Account getReference(int i) {
		return this.references[i];
	}

}
