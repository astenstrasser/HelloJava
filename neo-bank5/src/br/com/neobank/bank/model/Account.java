package br.com.neobank.bank.model;

/** 
 * Abstract Class that represents an generic account
 * 
 * @author Alexandra M. Stens.
 * @version 1.0
 */

public abstract class Account {
	
	private double balance;
	private int agency;
	private int accountNumber;
	private Client accountHolder;
	private static int total;

	/**
	 * Constructor method to initialize account object from agency number, account number and a client as account holder.
	 * @param agency
	 * @param accountNumber
	 * @param accountHolder
	 */
	public Account(int agency, int accountNumber, Client accountHolder) {
		Account.total++;
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 0;
	}
	
	/**
	 * Constructor method to initialize account object from agency number and account number.
	 * @param agency
	 * @param accountNumber
	 */
	public Account(int agency, int accountNumber) {
		Account.total++;
		this.agency = agency;
		this.accountNumber = accountNumber;
	}

	/**
	 * Deposit given value in bank account.
	 * @param value
	 */
	public void deposit(double value) {
		this.balance += value;
	}

	/**
	 * Method to withdrawal money from an account.
	 * Balance should be greater then withdrawal value.
	 * @param value
	 * @throws NotEnoughMoneyException
	 */
	public void withdrawal(double value) throws NotEnoughMoneyException {
		if (this.balance < value) {
			throw new NotEnoughMoneyException("Not enough Money");
		}
		this.balance -= value; 
	}

	/**
	 * Transfer given value from account to destination account.
	 * @param value
	 * @param destinationAccount
	 * @throws NotEnoughMoneyException
	 */
	public void transfer(double value, Account destinationAccount) throws NotEnoughMoneyException {
		this.withdrawal(value);
		destinationAccount.deposit(value);
		
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAgency() {
		return this.agency;
	}

	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("Can not set a value <= 0 as agency");
			return;
		}
		this.agency = agency;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		if (accountNumber <= 0) {
			System.out.println("Can not set a value <= 0 as account number");
			return;
		}
		this.accountNumber = accountNumber;
	}

	public Client getAccountHolder() {
		return this.accountHolder;
	}
	
	public void setAccountHolder(Client accountHolder) {
		this.accountHolder = accountHolder;
	}
	

	public static int getTotal() {
		return total;
	}

}
