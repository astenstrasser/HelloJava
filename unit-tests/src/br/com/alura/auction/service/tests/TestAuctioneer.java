package br.com.alura.auction.service.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

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

		assertEquals(400, auctioneer.getHighestBid(), 0.00001);
		assertEquals(250, auctioneer.getLowestBid(), 0.00001);

	}

	@Test
	public void mustEvaluateAuctionsWithOneBid() {
		User rob = new User("Rob");
		Auction auction = new Auction("SmartHome system");
		auction.proposes(new Bid(rob, 250));
		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(250, auctioneer.getHighestBid(), 0.00001);
		assertEquals(250, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustEvaluateRandomBids() {
		User rob = new User("Rob");
		User karen = new User("Karen");
		User louise = new User("Louise");

		Auction auction = new Auction("Dog Outfit");

		auction.proposes(new Bid(rob, 50));
		auction.proposes(new Bid(karen, 10));
		auction.proposes(new Bid(louise, 80));
		auction.proposes(new Bid(rob, 5));
		auction.proposes(new Bid(karen, 70));
		auction.proposes(new Bid(louise, 15));

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(80, auctioneer.getHighestBid(), 0.00001);
		assertEquals(5, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustEvaluateDescendingBids() {
		User rob = new User("Rob");
		User karen = new User("Karen");
		User louise = new User("Louise");

		Auction auction = new Auction("Dog Outfit");

		auction.proposes(new Bid(rob, 50));
		auction.proposes(new Bid(karen, 45));
		auction.proposes(new Bid(louise, 40));
		auction.proposes(new Bid(rob, 35));
		auction.proposes(new Bid(karen, 30));
		auction.proposes(new Bid(louise, 25));

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(50, auctioneer.getHighestBid(), 0.00001);
		assertEquals(25, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustFindThreeHighestBids() {
		User karen = new User("Karen");
		User louise = new User("Louise");
		Auction auction = new Auction("Supermagnetic Hoverboard");

		auction.proposes(new Bid(karen, 450));
		auction.proposes(new Bid(louise, 350));
		auction.proposes(new Bid(louise, 200));
		auction.proposes(new Bid(karen, 500));

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		List<Bid> highests = auctioneer.get3Highests();

		assertEquals(3, highests.size(), 0.00001);
		assertEquals(500, highests.get(0).getValue(), 0.00001);
		assertEquals(450, highests.get(1).getValue(), 0.00001);
		assertEquals(350, highests.get(2).getValue(), 0.00001);
	}

	@Test
	public void mustReturnTwoHighestBidsIfThereWereOnlyTwoBids() {
		User karen = new User("Karen");
		User louise = new User("Louise");
		Auction auction = new Auction("RiksTeck Laptop");

		auction.proposes(new Bid(karen, 450));
		auction.proposes(new Bid(louise, 350));

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		List<Bid> highests = auctioneer.get3Highests();

		assertEquals(2, highests.size(), 0.00001);
		assertEquals(450, highests.get(0).getValue(), 0.00001);
		assertEquals(350, highests.get(1).getValue(), 0.00001);
	}

	@Test
	public void mustReturnEmptyListWhenThereIsNoBid() {
		Auction auction = new Auction("RiksTeck Laptop");

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		List<Bid> highests = auctioneer.get3Highests();

		assertEquals(0, highests.size(), 0.00001);
	}

}
