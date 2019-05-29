
public class Client implements Authenticable{

	private int password;
	
	@Override
	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public boolean authenticatePassword(int password) {
		if (this.password == password) {
			return true;
		}
		return false;
	}

}
