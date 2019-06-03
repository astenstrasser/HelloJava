package br.com.alura.auction.service;

import br.com.alura.auction.domain.Auction;
import br.com.alura.auction.domain.Bid;

public class Auctioneer {

	private double highestBid = Double.NEGATIVE_INFINITY;
	private double lowestBid = Double.POSITIVE_INFINITY;

	public void evaluate(Auction auction) {
		for (Bid bid : auction.getBids()) {
			if (bid.getValue() > highestBid) {
				highestBid = bid.getValue();
			}
			if (bid.getValue() < lowestBid) {
				lowestBid = bid.getValue();
			}
		}
	}

	public double getHighestBid() {
		return highestBid;
	}

	public double getLowestBid() {
		return lowestBid;
	}
}
