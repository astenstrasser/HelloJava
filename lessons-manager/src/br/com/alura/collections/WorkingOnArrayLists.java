package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.com.alura.lesson.manager.model.Lesson;

public class WorkingOnArrayLists {

	public static void main(String[] args) {

		String dog1 = "Toby";
		String dog2 = "Nina";
		String dog3 = "Pirate";

		ArrayList<String> dogs = new ArrayList<String>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);

		System.out.println(dogs);
//		
//		dogs.remove(1);
//		System.out.println(dogs);
//		
		System.out.println(dogs.get(0));

		for (String dog : dogs) {
			System.out.println(dog);
		}

		dogs.forEach(dog -> {
			System.out.println("Dog name: " + dog);
		});

		for (int i = 0; i < dogs.size(); i++) {
			System.out.println("Dog name: " + dogs.get(i));
		}

		Collections.sort(dogs);
		System.out.println(dogs);

		Lesson c3 = new Lesson("Java 1", 20);
		Lesson c2 = new Lesson("Objects and Classes", 35);
		Lesson c1 = new Lesson("TDD in Java", 25);
		List<Lesson> lessons = new ArrayList<Lesson>();
		lessons.add(c1);
		lessons.add(c2);
		lessons.add(c3);

//		using iterator
		
		Iterator<Lesson> it = lessons.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

//		Comparing by duration
		lessons.sort(Comparator.comparing(Lesson::getDuration));

		System.out.println(lessons);

	}

}
