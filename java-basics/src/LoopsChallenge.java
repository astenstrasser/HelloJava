
public class LoopsChallenge {

//	1. Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
//	2. O seu desafio é imprimir os fatoriais de 1 a 10!

	public static void main(String[] args) {

		System.out.println("Challenge 1: ");

		for (int tracker = 1; tracker <= 100; tracker++) {
			if (tracker % 3 == 0) {
				System.out.println(tracker);
			}
		}

		System.out.println();
		System.out.println("Challenge 2: ");

		for (int tracker = 1; tracker <= 10; tracker++) {
			int sum = 1;
			for (int factorial = 1; factorial <= tracker; factorial++) {
				sum *= factorial;
			}
			System.out.println("factorial of " + tracker + " is: " + sum);
		}

		System.out.println();
		System.out.println("Challenge 2, other way to implement it:");

		int sum2 = 1;
		for (int factorial = 1; factorial < 11; factorial++) {
			sum2 *= factorial;
			System.out.println("factorial of " + factorial + " is: " + sum2);
		}

	}

}

// This would also be an option: 
// for (int i = 3; i < 100; i += 3 ){
//    System.out.println(i);