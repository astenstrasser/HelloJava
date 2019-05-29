
public class TestingInternalSystem {

	public static void main(String[] args) {

		Manager m = new Manager();
		m.setPassword(0000);

		InternalSystem is = new InternalSystem();
		is.authenticate(m);
		
		
		Authenticable testingReference = new Engineer();
		System.out.println(testingReference);

	}

}
