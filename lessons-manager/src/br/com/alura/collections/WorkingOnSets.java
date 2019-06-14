package br.com.alura.collections;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.lesson.manager.model.Course;
import br.com.alura.lesson.manager.model.Student;

public class WorkingOnSets {

	public static void main(String[] args) {

		Course course = new Course("Java Collections", "Java Teacher");

		Student s1 = new Student("Marta Norton", 541212, 512312);
		Student s2 = new Student("Frankie Schien", 532412, 542315);
		Student s3 = new Student("Laura Silva", 431931, 683912);

		course.enroll(s1);
		course.enroll(s2);
		course.enroll(s3);

		Set<Student> students = course.getStudents();

		students.forEach(s -> {
			System.out.println(s);
		});

		System.out.println(students.size());

	}

}
