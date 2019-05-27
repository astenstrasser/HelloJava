
public class TestingManager {

	public static void main(String[] args) {
		Manager naomi = new Manager();
		naomi.setName("Naomi Kamaki");
		naomi.setSalary(5800);
		naomi.setTaxNumber("575322");
		naomi.setPassword(2812);
		System.out.println("Naomi's full name is: "+naomi.getName());
		System.out.println("Naomi's bonus is: "+naomi.getBonus());
		boolean authenticated = naomi.authenticatePassword(5442);
		System.out.println("Testing fail authentication: "+authenticated);
		authenticated = naomi.authenticatePassword(2812);
		System.out.println("Testing sucess authentication: "+authenticated);
		
		

	}

}
