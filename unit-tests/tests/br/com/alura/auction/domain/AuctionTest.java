package br.com.alura.auction.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.auction.service.Auctioneer;

public class AuctionTest {

	@Test
	public void mustAccept1BidProposal() {
		Auction auction = new Auction("Stormtrooper Outfit");

		User starWarsFan = new User("Star wars fan");
		Bid b1 = new Bid(starWarsFan, 200);
		auction.proposes(b1);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(1, auction.getBids().size());
		assertEquals(200, auction.getBids().get(0).getValue(), 0.0001);

	}

	@Test
	public void mustAcceptMoreBidsProposals() {

		Auction auction = new Auction("Stormtrooper Outfit");

		User starWarsFan = new User("Star wars fan");
		Bid b1 = new Bid(starWarsFan, 1000);
		auction.proposes(b1);

		User notThatFan = new User("Not that fan");
		Bid b2 = new Bid(notThatFan, 50);
		auction.proposes(b2);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(2, auction.getBids().size());
		assertEquals(1000.0, auction.getBids().get(0).getValue(), 0.00001);
		assertEquals(50.0, auction.getBids().get(1).getValue(), 0.00001);

	}

	@Test
	public void mustReject2BidsInSequenceFromSameUser() {
		Auction auction = new Auction("Stormtrooper Outfit");

		User starWarsFan = new User("Star wars fan");
		Bid b1 = new Bid(starWarsFan, 1000);
		auction.proposes(b1);
		Bid b2 = new Bid(starWarsFan, 5000);
		auction.proposes(b2);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(1, auction.getBids().size());
		assertEquals(1000, auction.getBids().get(0).getValue(), 0.0001);
	}

	@Test
	public void MustNotAcceptMoreThan5BidsProUser() {
		Auction auction = new Auction("Stormtrooper Outfit");

		User starWarsFan = new User("Star wars fan");
		User notThatFan = new User("Not that fan");

		Bid b1 = new Bid(starWarsFan, 100);
		auction.proposes(b1);
		Bid b2 = new Bid(notThatFan, 120);
		auction.proposes(b2);
		Bid b3 = new Bid(starWarsFan, 200);
		auction.proposes(b3);
		Bid b4 = new Bid(notThatFan, 200);
		auction.proposes(b4);
		Bid b5 = new Bid(starWarsFan, 300);
		auction.proposes(b5);
		Bid b6 = new Bid(notThatFan, 310);
		auction.proposes(b6);
		Bid b7 = new Bid(starWarsFan, 400);
		auction.proposes(b7);
		Bid b8 = new Bid(notThatFan, 400);
		auction.proposes(b8);
		Bid b9 = new Bid(starWarsFan, 500);
		auction.proposes(b9);
		Bid b10 = new Bid(notThatFan, 490);
		auction.proposes(b10);
		Bid b11 = new Bid(starWarsFan, 10000);
		auction.proposes(b11);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(10, auction.getBids().size());
		assertEquals(490, auction.getBids().get(auction.getBids().size() - 1).getValue(), 0.00001);

	}

	@Test
	public void mustBeCapableToDoubleBids() {
		Auction auction = new Auction("Stormtrooper Outfit");
		User starWarsFan = new User("Star wars fan");
		User notThatFan = new User("Not that fan");

		Bid b1 = new Bid(starWarsFan, 150);
		auction.proposes(b1);
		Bid b2 = new Bid(notThatFan, 200);
		auction.proposes(b2);

		auction.doubleLastBid(starWarsFan);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(3, auction.getBids().size());
		assertEquals(300, auction.getBids().get(2).getValue(), 0.000001);
	}

	@Test
	public void doesNothingWhenUserHasNoBidMadeAndDoubles() {
		Auction auction = new Auction("Stormtrooper Outfit");

		User johnDoe = new User("John Doe");

		auction.doubleLastBid(johnDoe);

		Auctioneer auctioneer = new Auctioneer();
		auctioneer.evaluate(auction);

		assertEquals(0, auction.getBids().size());
	}

}
