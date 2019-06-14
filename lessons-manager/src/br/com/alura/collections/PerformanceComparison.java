package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PerformanceComparison {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Time HashSet: " + tempoDeExecucao);

		Collection<Integer> numeros1 = new ArrayList<Integer>();

		inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros1.add(i);
		}

		for (Integer numero : numeros1) {
			numeros1.contains(numero);
		}

		fim = System.currentTimeMillis();

		tempoDeExecucao = fim - inicio;
		System.out.println("Time ArrayList: " + tempoDeExecucao);

	}

}
