
public class InternalSystem {
	
	int password = 0000;
	public static int systemPassword;
	
	public boolean authenticate(Authenticable authenticable, Authenticator authenticator) {
		boolean access = authenticator.authenticatePassword(authenticable.getPassword());
		if (access == true) {
			System.out.println("OK");
			return true;
		} else {
			System.out.println("NO ENTRY");
			return false;
		}
		
		
		
	}

}
