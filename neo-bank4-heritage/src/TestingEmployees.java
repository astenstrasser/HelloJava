
public class TestingEmployees {

	public static void main(String[] args) {

		Employee alice = new Employee();
		alice.setName("Alice Hausmann");
		alice.setTaxNumber("500188");
		alice.setSalary(3500);
		System.out.println(alice.getBonus());
	}

}
