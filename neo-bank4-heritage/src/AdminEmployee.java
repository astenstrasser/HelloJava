
public abstract class AdminEmployee extends Employee {
	
	int password;
	
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
