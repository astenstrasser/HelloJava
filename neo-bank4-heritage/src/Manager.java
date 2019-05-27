
public class Manager extends Employee {

//	Manager get the same methods as Employee
	
	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}

	public boolean authenticatePassword(int password) {
		if (this.password == password) {
			return true;
		} else {
			return false;
		}
	}

}
