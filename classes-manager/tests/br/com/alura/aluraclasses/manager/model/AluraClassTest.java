package br.com.alura.aluraclasses.manager.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

public class AluraClassTest {

	private ArrayList<AluraClass> alClasses;

	@Before
	public void setUp() {
		AluraClass c3 = new AluraClass("Java 1", 20);
		AluraClass c2 = new AluraClass("Objects and Classes", 35);
		AluraClass c1 = new AluraClass("TDD in Java", 25);
		this.alClasses = new ArrayList<AluraClass>();
		this.alClasses.add(c1);
		this.alClasses.add(c2);
		this.alClasses.add(c3);
	}

	@Test
	public void toStringMethod() {
		assertEquals("[[TDD in Java, 25], [Objects and Classes, 35], [Java 1, 20]]", alClasses.toString());
	}

	@Test
	public void mustOrderByName() {
		Collections.sort(this.alClasses);
		assertEquals("[[Java 1, 20], [Objects and Classes, 35], [TDD in Java, 25]]", alClasses.toString());
	}

	@Test
	public void mustOrderByDuration() {
		alClasses.sort(Comparator.comparing(AluraClass::getDuration));
		assertEquals("[[Java 1, 20], [TDD in Java, 25], [Objects and Classes, 35]]", alClasses.toString());

	}

}
