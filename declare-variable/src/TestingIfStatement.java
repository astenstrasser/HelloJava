
public class TestingIfStatement {

	public static void main(String[] args) {
		System.out.println("In Eclipse, ctrl + space helps us complete some statements. "
				+ "For println we write sysout and then use the shortcut!");

		int age = 19;
		int numberOfAdults = 0;

		if (age >= 18) {
			System.out.println("You may enter.");
			System.out.println("You are over 18.");
		} else {
			if (numberOfAdults > 0) {
				System.out.println("You are under 18, but you may enter since " + "you are with an adult");
			} else {
				System.out.println("You are under 18 and you may not enter");
			}
		}

	}
}
