package br.com.alura.aluraclasses.manager.model;

public class AluraClass implements Comparable<AluraClass>{

	private String name;
	private int duration;

	public AluraClass(String name, int duration) {
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
	public int compareTo(AluraClass otherClass) {
		return this.getName().compareTo(otherClass.getName());
	}

}
