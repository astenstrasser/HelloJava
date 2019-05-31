package br.com.neobank.bank.model;

public class LifeInsurance implements Taxable{

	@Override
	public double getTaxes() {
		return 40;
	}

}
