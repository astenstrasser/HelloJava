
public class TestingIfStatement2 {

	public static void main(String[] args) {

		int age = 19;
		int numberOfAdults = 0;
		boolean withAdult = numberOfAdults >= 0;
		
		System.out.println(withAdult);

		if (age >= 18 && withAdult) {
			System.out.println("You may enter.");
		} else {
			System.out.println("You are under 18 and you may not enter");
		}
	}

}
