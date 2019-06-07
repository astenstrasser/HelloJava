package br.com.alura.auction.builder;

import br.com.alura.auction.domain.Auction;
import br.com.alura.auction.domain.Bid;
import br.com.alura.auction.domain.User;

public class TestAuctionBuilder {

	private Auction auction;

	public TestAuctionBuilder() {
	}

	public TestAuctionBuilder of(String description) {
		this.auction = new Auction(description);
		return this;
	}

	public TestAuctionBuilder bid(User user, double value) {
		this.auction.proposes(new Bid(user, value));
		return this;
	}

	public Auction construct() {
		return auction;
	}

}
