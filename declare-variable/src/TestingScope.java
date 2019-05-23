
public class TestingScope {

	public static void main(String[] args) {

		int age = 19;
		int numberOfAdults = 2;
		boolean withAdult;

		if (numberOfAdults > 0) {
			withAdult = true;
		} else {
			withAdult = false;
		}

		if (age >= 18 && withAdult) {
			System.out.println("You may enter.");
		} else {
			System.out.println("You are under 18 and you may not enter");
		}
	}

}
