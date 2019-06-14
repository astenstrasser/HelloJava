package br.com.alura.lesson.manager.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {

	private Course course;

	@Before
	public void setUpTests() {
		this.course = new Course("Java Collections", "Camila Meier");
		this.course.add(new Lesson("ArrayList 1", 25));
		this.course.add(new Lesson("LinkedList", 18));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mustNotBeAbleToModifyList() {
		this.course.getLessons().add(new Lesson("Unmodifiable?", 0));
	}
	
	@Test
	public void courseDuration() {
		assertEquals(this.course.getDuration(), 43);
	}
	
}
