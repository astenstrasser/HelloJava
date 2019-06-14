package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.lesson.manager.model.Course;
import br.com.alura.lesson.manager.model.Lesson;

public class WorkingOnCourses {
	
	public static void main(String[] args) {
		Course course = new Course("Java Collections", "Camila Meier");
		course.add(new Lesson("ArrayList 1", 25));
		course.add(new Lesson("LinkedList", 18));
		
		List<Lesson> lessonsImutable = course.getLessons();
		List<Lesson> lessonsToSort = new ArrayList<>(lessonsImutable);
		
		Collections.sort(lessonsToSort);
		System.out.println(lessonsToSort);
		
	System.out.println(course);
	}

}
