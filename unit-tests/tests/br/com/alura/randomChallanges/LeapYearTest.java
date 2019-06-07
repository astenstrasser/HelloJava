package br.com.alura.randomChallanges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void mustReturnFalseWhenIsNotLeapYear() {		
		assertEquals(false, LeapYear.isLeapYear(2019));
		assertEquals(false, LeapYear.isLeapYear(2015));

	}
	
	@Test
	public void mustReturnTrueWhenIsLeapYear() {
		assertEquals(true, LeapYear.isLeapYear(2020));
		assertEquals(true, LeapYear.isLeapYear(2016));

	}
	
}
