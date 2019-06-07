package br.com.alura.auction.domain;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.auction.builder.TestAuctionBuilder;
import br.com.alura.auction.service.Auctioneer;

public class AuctionTest {

	private Auctioneer auctioneer;
	private User starWarsFan;
	private User notThatFan;
	private TestAuctionBuilder testAuctionBuilder;

	@Before
	public void setUp() {
		this.auctioneer = new Auctioneer();
		this.starWarsFan = new User("Star wars fan");
		this.notThatFan = new User("Not that fan");
		this.testAuctionBuilder = new TestAuctionBuilder();
	}

	@After
	public void finish() {
//		could be used to close files, database, etc.
	}

	@Test
	public void mustAccept1BidProposal() {

		Auction auction = new TestAuctionBuilder()
				.of("Stormtrooper Outfit")
				.bid(starWarsFan, 200)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(1, auction.getBids().size());
		assertEquals(200, auction.getBids().get(0).getValue(), 0.0001);

	}

	@Test
	public void mustAcceptMoreBidsProposals() {

		Auction auction = new TestAuctionBuilder()
				.of("Stormtrooper Outfit")
				.bid(starWarsFan, 1000)
				.bid(notThatFan, 50)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(2, auction.getBids().size());
		assertEquals(1000.0, auction.getBids().get(0).getValue(), 0.00001);
		assertEquals(50.0, auction.getBids().get(1).getValue(), 0.00001);

	}

	@Test
	public void mustReject2BidsInSequenceFromSameUser() {

		Auction auction =  new TestAuctionBuilder() 
				.of("Stormtrooper Outfit")
				.bid(starWarsFan, 1000)
				.bid(starWarsFan, 5000)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(1, auction.getBids().size());
		assertEquals(1000, auction.getBids().get(0).getValue(), 0.0001);
	}

	@Test
	public void MustNotAcceptMoreThan5BidsProUser() {
		
		Auction auction =  new TestAuctionBuilder()
				.of("Stormtrooper Outfit")
				.bid(starWarsFan, 100)
				.bid(notThatFan, 120)
				.bid(starWarsFan, 200)
				.bid(notThatFan, 200)
				.bid(starWarsFan, 300)
				.bid(notThatFan, 310)
				.bid(starWarsFan, 400)
				.bid(notThatFan, 400)
				.bid(starWarsFan, 500)
				.bid(notThatFan, 490)
				.bid(starWarsFan, 10000)
				.construct();

		auctioneer.evaluate(auction);

		assertEquals(10, auction.getBids().size());
		assertEquals(490, auction.getBids().get(auction.getBids().size() - 1).getValue(), 0.00001);

	}

	@Test
	public void mustBeCapableToDoubleBids() {

		Auction auction =  new TestAuctionBuilder()
				.of("Stormtrooper Outfit")
				.bid(starWarsFan, 150)
				.bid(notThatFan, 200)
				.construct();
		
		auction.doubleLastBid(starWarsFan);

		auctioneer.evaluate(auction);

		assertEquals(3, auction.getBids().size());
		assertEquals(300, auction.getBids().get(2).getValue(), 0.000001);
	}

	@Test
	public void doesNothingWhenUserHasNoBidMadeAndDoubles() {

		
		User johnDoe = new User("John Doe");

		Auction auction =  new TestAuctionBuilder()
				.of("Stormtrooper Outfit")
				.construct();
		
		auction.doubleLastBid(johnDoe);

		auctioneer.evaluate(auction);

		assertEquals(0, auction.getBids().size());
	}

}
