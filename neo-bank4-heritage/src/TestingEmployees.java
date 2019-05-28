
public class TestingEmployees {

	public static void main(String[] args) {

		Employee alice = new Manager();
		alice.setName("Alice Hausmann");
		alice.setTaxNumber("500188");
		alice.setSalary(3500);
		System.out.println("Alices's bonus is: " + alice.getBonus());
	}

}
