package br.com.alura.lesson.manager.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Course {

	private String name;
	private String teacher;
	private List<Lesson> lessons = new LinkedList<Lesson>();
	private Set<Student> students = new HashSet<Student>();

	public Course(String name, String teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public String getTeacher() {
		return teacher;
	}

	public List<Lesson> getLessons() {
		return Collections.unmodifiableList(lessons);
	}

	public void add(Lesson lesson) {
		this.lessons.add(lesson);
	}

	public int getDuration() {
		int duration = 0;
		for (Lesson lesson : lessons) {
			duration += lesson.getDuration();
		}
		return duration;
	}

	@Override
	public String toString() {
		return "[Course: " + this.name + " | Teacher: " + this.teacher + "]";
	}

	public void enroll(Student s) {
		this.students.add(s);
	}

	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}
	
	public boolean isEnrolled(Student s) {
		return this.students.contains(s);
	}
	
	

}
