
public class TestingManager {

	public static void main(String[] args) {
		Manager naomi = new Manager();
		naomi.setName("Naomi Kamaki");
		naomi.setSalary(5800);
		naomi.setTaxNumber("575322");
		naomi.setPassword(2812);
		System.out.println(naomi.getName());

		boolean authenticated = naomi.authenticatePassword(5442);
		System.out.println(authenticated);


	}

}
