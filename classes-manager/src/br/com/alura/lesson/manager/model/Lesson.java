package br.com.alura.lesson.manager.model;

public class Lesson implements Comparable<Lesson>{

	private String name;
	private int duration;

	public Lesson(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "["+ this.name + ", "+this.duration+ "]";
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	@Override
	public int compareTo(Lesson otherLesson) {
		return this.getName().compareTo(otherLesson.getName());
	}

}
