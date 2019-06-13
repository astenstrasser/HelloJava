package br.com.alura.lesson.manager.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class LessonTest {

	private ArrayList<Lesson> lessons;

	@Before
	public void setUp() {
		Lesson c3 = new Lesson("Java 1", 20);
		Lesson c2 = new Lesson("Objects and Classes", 35);
		Lesson c1 = new Lesson("TDD in Java", 25);
		this.lessons = new ArrayList<Lesson>();
		this.lessons.add(c1);
		this.lessons.add(c2);
		this.lessons.add(c3);
	}

	@Test
	public void toStringMethod() {
		assertEquals("[[TDD in Java, 25], [Objects and Classes, 35], [Java 1, 20]]", lessons.toString());
	}

	@Test
	public void mustOrderByName() {
		Collections.sort(this.lessons);
		assertEquals("[[Java 1, 20], [Objects and Classes, 35], [TDD in Java, 25]]", lessons.toString());
	}

}
