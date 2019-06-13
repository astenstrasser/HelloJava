package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;

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
	}

}
