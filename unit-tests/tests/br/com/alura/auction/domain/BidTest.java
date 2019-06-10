package br.com.alura.auction.domain;

import org.junit.Before;
import org.junit.Test;

public class BidTest {

	private User calvin;
	
	@Before
	public void setUpTests() {
		this.calvin = new User("Calvin José");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mustGetExceptionWhenBidValueIsNull() {
		Bid b1 = new Bid(calvin, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mustGetExceptionWhenBidValueIsNegative() {
		Bid b1 = new Bid(calvin, -1);
	}
	
}
