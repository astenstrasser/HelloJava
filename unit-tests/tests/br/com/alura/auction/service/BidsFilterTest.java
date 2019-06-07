package br.com.alura.auction.service.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.alura.auction.domain.Bid;
import br.com.alura.auction.domain.User;
import br.com.alura.auction.service.BidsFilter;

public class TestBidsFilter {

	@Test
	public void mustSelectBidsBetween1000And3000() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter.filter(
				Arrays.asList(new Bid(joao, 2000), new Bid(joao, 1000), new Bid(joao, 3000), new Bid(joao, 800)));

		assertEquals(1, result.size());
		assertEquals(2000, result.get(0).getValue(), 0.00001);
	}

	@Test
	public void mustSelectBidsBetween500And700() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter
				.filter(Arrays.asList(new Bid(joao, 600), new Bid(joao, 500), new Bid(joao, 700), new Bid(joao, 800)));

		assertEquals(1, result.size());
		assertEquals(600, result.get(0).getValue(), 0.00001);
	}

	@Test
	public void mustSelectBidsOver5000() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter.filter(
				Arrays.asList(new Bid(joao, 10), new Bid(joao, 9000), new Bid(joao, 5), new Bid(joao, 8000)));

		assertEquals(2, result.size());
	}
	
	@Test
	public void mustNotSelectBidsUnder500() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter.filter(
				Arrays.asList(new Bid(joao, 10), new Bid(joao, 5), new Bid(joao, 5), new Bid(joao, 20)));

		assertEquals(0, result.size());
	}
	
	@Test
	public void mustNotSelectBidsBetween700And1000() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter.filter(
				Arrays.asList(new Bid(joao, 710), new Bid(joao, 800), new Bid(joao, 759), new Bid(joao, 820)));

		assertEquals(0, result.size());
	}
	
	@Test
	public void mustNotSelectBidsBetween3000And5000() {
		User joao = new User("Joao");

		BidsFilter filter = new BidsFilter();
		List<Bid> result = filter.filter(
				Arrays.asList(new Bid(joao, 3010), new Bid(joao, 4000), new Bid(joao, 3759), new Bid(joao, 4820)));

		assertEquals(0, result.size());
	}
}
