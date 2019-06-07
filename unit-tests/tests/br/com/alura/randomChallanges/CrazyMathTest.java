package br.com.alura.randomChallanges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.alura.randomChallanges.CrazyMath;

public class CrazyMathTest {

	@Test
	public void biggerThan30() {

		int n = 35;
		double answer = CrazyMath.crazyCalculation(n);
		assertEquals(n * 4, answer, 0.0001);
	}
	
	@Test
	public void equal30() {

		int n = 30;
		double answer = CrazyMath.crazyCalculation(n);
		assertEquals(n * 3, answer, 0.0001);
	}
	
	@Test
	public void between10And30() {

		int n = 20;
		double answer = CrazyMath.crazyCalculation(n);
		assertEquals(n * 3, answer, 0.0001);
	}
	
	@Test
	public void equals10() {

		int n = 10;
		double answer = CrazyMath.crazyCalculation(n);
		assertEquals(n * 2, answer, 0.0001);
	}
	
	@Test
	public void smallerThan10() {

		int n = 1;
		double answer = CrazyMath.crazyCalculation(n);
		assertEquals(n * 2, answer, 0.0001);
	}

}
