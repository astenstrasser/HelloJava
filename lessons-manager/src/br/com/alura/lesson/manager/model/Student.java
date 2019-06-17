package br.com.alura.lesson.manager.model;

public class Student {

	private String name;
	private int enrollmentNumber;
	private int id;

	public Student(String name, int enrollmentNumber, int id) {
		if (name == null) {
			throw new NullPointerException("Student Name must not be null");
		}
		this.name = name;
		this.enrollmentNumber = enrollmentNumber;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[Name: " + name + " | Enrollment Number: " + enrollmentNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enrollmentNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (enrollmentNumber != other.enrollmentNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
