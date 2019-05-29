
public class TestingInternalSystem {

	public static void main(String[] args) {

		Manager m = new Manager();
		m.setPassword(0000);

		Authenticator authenticator = new Authenticator();
		InternalSystem is = new InternalSystem();
		is.authenticate(m, authenticator);
		
		
		Authenticable testingReference = new Engineer();
		System.out.println(testingReference);

	}

}
