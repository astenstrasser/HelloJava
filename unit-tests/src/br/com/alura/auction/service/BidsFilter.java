package br.com.alura.auction.service;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.auction.domain.Bid;

public class BidsFilter {

	public List<Bid> filter(List<Bid> bids) {
		ArrayList<Bid> result = new ArrayList<Bid>();

		for (Bid bid : bids) {
			if (bid.getValue() > 1000 && bid.getValue() < 3000)
				result.add(bid);
			else if (bid.getValue() > 500 && bid.getValue() < 700)
				result.add(bid);
			else if (bid.getValue() > 5000)
				result.add(bid);
		}

		return result;
	}

}
