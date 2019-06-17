package br.com.alura.collections;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import br.com.alura.lesson.manager.model.Employee;

public class SortByAgeTest {

	@Test
	public void mustBeAbleToSortByAge() {
		Employee e1 = new Employee("Leon", 52);
		Employee e2 = new Employee("Del Mar", 24);
		Employee e3 = new Employee("Sarah", 35);

		Set<Employee> employees = new TreeSet<>(new SortByAge());

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		Iterator<Employee> it = employees.iterator();
		assertEquals(it.next().getAge(), 24);
		assertEquals(it.next().getAge(), 35);
		assertEquals(it.next().getAge(), 52);
	}

}
