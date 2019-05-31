package br.com.neobank.bank.model;

public class NotEnoughMoneyException extends Exception {

	public NotEnoughMoneyException(String msg) {
		super(msg);
	}
	
}
