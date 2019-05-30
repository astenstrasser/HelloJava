
public class ThrowingExceptions {

	public static void main(String[] args) {
		System.out.println("Main begins");
		firstMethod();
		System.out.println("Main ends");
	}

	public static void firstMethod() {
		System.out.println("1. Method begins");
		try {
			secondMethod();
		} catch (ArithmeticException | NullPointerException exception) {
			String msg = exception.getMessage();
			System.out.println("Message: " + msg);
			exception.printStackTrace();
		}
		System.out.println("1. Method ends");
	}

	public static void secondMethod() {
		System.out.println("2. Method begins");
		throw new ArithmeticException("Customized Exception");
//		System.out.println("2. Method ends");
	}

}
