package br.com.alura.auction.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.auction.builder.TestAuctionBuilder;
import br.com.alura.auction.domain.Auction;
import br.com.alura.auction.domain.Bid;
import br.com.alura.auction.domain.User;

public class AuctioneerTest {

	private User rob;
	private User karen;
	private User louise;
	private Auctioneer auctioneer;
	
	@Before
	public void setUpTest() {
		this.rob = new User("Rob");
		this.karen = new User("Karen");
		this.louise = new User("Louise");
		this.auctioneer = new Auctioneer();
	}
	
//	using JUnit: the test must be public void, not static, no inputs.
	@Test
	public void mustEvaluateBidsInAscendingOrder() {

		Auction auction = new TestAuctionBuilder()
				.of("Brand new Playstation 4")
				.bid(rob, 250)
				.bid(karen, 300)
				.bid(louise, 400)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(400, auctioneer.getHighestBid(), 0.00001);
		assertEquals(250, auctioneer.getLowestBid(), 0.00001);

	}

	@Test
	public void mustEvaluateAuctionsWithOneBid() {

		Auction auction = new TestAuctionBuilder()
				.of("SmartHome system")
				.bid(rob, 250)
				.construct();
		
		auctioneer.evaluate(auction);

		assertEquals(250, auctioneer.getHighestBid(), 0.00001);
		assertEquals(250, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustEvaluateRandomBids() {

		Auction auction = new TestAuctionBuilder()
				.of("Dog Outfit")
				.bid(rob, 50)
				.bid(karen, 10)
				.bid(louise, 80)
				.bid(rob, 5)
				.bid(karen, 70)
				.bid(louise, 15)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(80, auctioneer.getHighestBid(), 0.00001);
		assertEquals(5, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustEvaluateDescendingBids() {
	
		Auction auction = new TestAuctionBuilder()
				.of("Dog Outfit")
				.bid(rob, 50)
				.bid(karen, 45)
				.bid(louise, 40)
				.bid(rob, 35)
				.bid(karen, 30)
				.bid(louise, 25)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(50, auctioneer.getHighestBid(), 0.00001);
		assertEquals(25, auctioneer.getLowestBid(), 0.00001);
	}

	@Test
	public void mustFindThreeHighestBids() {
		
		Auction auction = new TestAuctionBuilder()
				.of("Supermagnetic Hoverboard")
				.bid(karen, 450)
				.bid(louise, 350)
				.bid(louise, 200)
				.bid(karen, 500)
				.construct();

		auctioneer.evaluate(auction);

		List<Bid> highests = auctioneer.get3Highests();

		assertEquals(3, highests.size(), 0.00001);
		assertEquals(500, highests.get(0).getValue(), 0.00001);
		assertEquals(450, highests.get(1).getValue(), 0.00001);
		assertEquals(350, highests.get(2).getValue(), 0.00001);
	}

	@Test
	public void mustReturnTwoHighestBidsIfThereWereOnlyTwoBids() {
	
		Auction auction = new TestAuctionBuilder()
				.of("RiksTeck Laptop")
				.bid(karen, 450)
				.bid(louise, 350)
				.construct();

		auctioneer.evaluate(auction);

		List<Bid> highests = auctioneer.get3Highests();

		assertEquals(2, highests.size(), 0.00001);
		assertEquals(450, highests.get(0).getValue(), 0.00001);
		assertEquals(350, highests.get(1).getValue(), 0.00001);
	}

	@Test(expected=RuntimeException.class)
	public void mustRaiseExceptiontWhenThereIsNoBid() {
		Auction auction = new TestAuctionBuilder()
				.of("RiksTeck Laptop")
				.construct();
				
		auctioneer.evaluate(auction);

	}
	

}
