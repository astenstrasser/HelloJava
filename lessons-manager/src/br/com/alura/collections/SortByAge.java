package br.com.alura.collections;

import java.util.Comparator;

import br.com.alura.lesson.manager.model.Employee;

public class SortByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
//		Integer.compare(e1.getAge(), e2.getAge());
		return e1.getAge() - e2.getAge();
		
	}

}
