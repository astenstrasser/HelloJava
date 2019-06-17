package br.com.alura.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorkingOnHashMap {

	public static void main(String[] args) {

		Map<Integer, String> people = new HashMap<>();

		people.put(21, "Leonardo Cordeiro");
		people.put(27, "Fabio Pimentel");
		people.put(19, "Silvio Mattos");
		people.put(23, "Romulo Henrique");
		
		System.out.println(people.keySet());
		System.out.println(people.values());
		
		Set<Integer> ages = people.keySet();
		ages.forEach(age -> {
			System.out.println(people.get(age));
		});
		
		System.out.println("....");
		
		people.values().forEach(person ->{
			System.out.println(person);
		});
		
		System.out.println("....");

		
		people.keySet().forEach(person -> {
			System.out.println(person);

		});
		
		System.out.println("....");

		
		Set<Entry<Integer, String>> namesAssociatedToAge = people.entrySet();
		for(Entry<Integer, String> association : namesAssociatedToAge){
		    System.out.println(association.getKey() + " - " + association.getValue());
//		    System.out.println(association);
		}
		
	}

}
