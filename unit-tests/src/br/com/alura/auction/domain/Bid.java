package br.com.alura.auction.domain;

public class Bid {

	private User user;
	private double value;
	
	public Bid(User user, double value) {
		this.user = user;
		if (value <= 0) {
			throw new IllegalArgumentException("Invalid bid value");
		}
		this.value = value;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public double getValue() {
		return this.value;
	}
	
	
}
