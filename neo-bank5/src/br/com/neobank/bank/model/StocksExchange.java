package br.com.neobank.bank.model;

public class StocksExchange implements Taxable {

	@Override
	public double getTaxes() {
		return 50;
	}

}
