package br.com.alura.auction.service.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.auction.domain.Auction;
import br.com.alura.auction.domain.Bid;
import br.com.alura.auction.domain.User;
import br.com.alura.auction.service.Auctioneer;

public class TestAuctioneer {

//	using JUnit: the test must be public void, not static, no inputs.
	@Test
	public void mustEvaluateBidsInAscendingOrder() {

		User rob = new User("Rob");
		User karen = new User("Karen");
		User louise = new User("Louise");

		Auction auction = new Auction("Brand new Playstation 4");

		auction.proposes(new Bid(rob, 250));
		auction.proposes(new Bid(karen, 300));
		auction.proposes(new Bid(louise, 400));

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);
		System.out.println(auctioneer.getHighestBid());
		System.out.println(auctioneer.getLowestBid());

		Assert.assertEquals(400, auctioneer.getHighestBid(), 0.00001);
		Assert.assertEquals(250, auctioneer.getLowestBid(), 0.00001);

	}

}
