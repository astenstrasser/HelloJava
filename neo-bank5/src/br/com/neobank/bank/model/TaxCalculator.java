package br.com.neobank.bank.model;

public class TaxCalculator {
	
	private double totalTaxes;
	
	public void register(Taxable t) {
//	everything that implements the interface taxable can be the input here
		double value = t.getTaxes();
		this.totalTaxes += value;
	}
	
	public double getTotalTaxes() {
		return totalTaxes;
	}
}
