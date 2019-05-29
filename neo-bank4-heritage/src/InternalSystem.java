
public class InternalSystem {
	
	int password = 0000;
	
	public boolean authenticate(Authenticable adm) {
		boolean access = adm.authenticatePassword(this.password);
		if (access == true) {
			System.out.println("OK");
			return true;
		} else {
			System.out.println("NO ENTRY");
			return false;
		}
		
		
		
	}

}
