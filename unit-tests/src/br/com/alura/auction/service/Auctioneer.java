package br.com.alura.auction.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.auction.domain.Auction;
import br.com.alura.auction.domain.Bid;

public class Auctioneer {

	private double highestBid = Double.NEGATIVE_INFINITY;
	private double lowestBid = Double.POSITIVE_INFINITY;
	private List<Bid> highests;

	public void evaluate(Auction auction) {
		if (auction.getBids().size() == 0) {
			throw new RuntimeException("No bids in this Auction");
		}
		
		for (Bid bid : auction.getBids()) {
			if (bid.getValue() > highestBid) {
				highestBid = bid.getValue();
			}
			if (bid.getValue() < lowestBid) {
				lowestBid = bid.getValue();
			}
		}

		highests = new ArrayList<Bid>(auction.getBids());
		Collections.sort(highests, new Comparator<Bid>() {

			public int compare(Bid bid1, Bid bid2) {
				if (bid1.getValue() < bid2.getValue())
					return 1;
				if (bid1.getValue() > bid2.getValue())
					return -1;
				return 0;
			}

		});
		highests = highests.subList(0, highests.size() > 3 ? 3 : highests.size());

	}

	public List<Bid> get3Highests() {
		return highests;
	}

	public double getHighestBid() {
		return highestBid;
	}

	public double getLowestBid() {
		return lowestBid;
	}
}
