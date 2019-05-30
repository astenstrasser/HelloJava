
public class Flux {

	public static void main(String[] args) {
		System.out.println("Main begins");
		firstMethod();
		System.out.println("Main ends");
	}

	public static void firstMethod() {
		System.out.println("1. Method begins");
		secondMethod();
		System.out.println("1. Method ends");
	}

	public static void secondMethod() {
		System.out.println("2. Method begins");
		System.out.println("Inside 2. Method");
		System.out.println("2. Method ends");
	}

}
