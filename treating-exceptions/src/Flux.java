
public class Flux {

	public static void main(String[] args) {
		System.out.println("Main begins");
		firstMethod();
		System.out.println("Main ends");
	}

	public static void firstMethod() {
		System.out.println("1. Method begins");
		try {
			secondMethod();
		} catch(ArithmeticException | NullPointerException exception) {
			String msg = exception.getMessage();
			System.out.println("Message: "+ msg);
			exception.printStackTrace(); 
		}
		System.out.println("1. Method ends");
	}

	public static void secondMethod() {
		System.out.println("2. Method begins");
		for (int i = 0; i <= 3; i++) {
//			try {
			int a = 9/0;
//				EmptyClass emptyReference = null;
//				emptyReference.emptyMethod();
//				
//			} catch (ArithmeticException exception){
//				System.out.println("Catched a Arithmetic Exception. Msg: "+exception.getMessage());
//			} catch (NullPointerException exception) {
//				System.out.println("Catched a Null Pointer Exception. Msg: "+exception.getMessage());
//			}
		}
		System.out.println("2. Method ends");
	}

}
