package br.com.alura.auction.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auction {

	private String description;
	private List<Bid> bids;

	public Auction(String description) {
		this.description = description;
		this.bids = new ArrayList<Bid>();
	}

	public void proposes(Bid bid) {
		if (isValid(bid)) {
			bids.add(bid);
		}
	}

	private boolean isValid(Bid bid) {
		return ((bids.size() == 0) || (getBidAuthor(bids.size() - 1) != bid.getUser()))
				&& (countBidsFrom(bid.getUser()) < 5);
	}

	public int countBidsFrom(User user) {
		int total = 0;
		for (Bid bid : bids) {
			if (bid.getUser() == user) {
				total++;
			}
		}
		return total;
	}

	private User getBidAuthor(int position) {
		return bids.get(position).getUser();
	}

	public String getDescription() {
		return description;
	}

	public List<Bid> getBids() {
		return Collections.unmodifiableList(bids);
	}

	public void doubleLastBid(User user) {
		if (countBidsFrom(user) != 0) {
			Bid lastBid = null;
			for (Bid bid : bids) {
				if (bid.getUser() == user) {
					lastBid = bid;
				}
			}
			proposes(new Bid(user, lastBid.getValue() * 2));
		}
	}

}
