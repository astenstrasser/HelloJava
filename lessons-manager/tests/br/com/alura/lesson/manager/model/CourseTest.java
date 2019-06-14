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
		this.course.enroll(new Student("Stud 1", 1111, 1111));
		this.course.enroll(new Student("Stud 2", 2222, 2222));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mustNotBeAbleToModifyLessonsList() {
		this.course.getLessons().add(new Lesson("Unmodifiable?", 0));
	}
	
	@Test
	public void courseDuration() {
		assertEquals(this.course.getDuration(), 43);
	}
	
	@Test
	public void enrollment() {
		assertEquals(this.course.getStudents().size(), 2);
	}
	
	@Test
	public void isEnrolled() {
		Student std = new Student("Stud 1", 1111, 1111);
		assertEquals(true, this.course.isEnrolled(std));
	}
	
}
