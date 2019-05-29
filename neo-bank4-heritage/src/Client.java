
public class Client implements Authenticable {

	private Authenticator authenticator;
	private int password;

	public Client() {
		Authenticator authenticator = new Authenticator();
		this.authenticator = authenticator;
	}

	@Override
	public void setPassword(int password) {
		this.authenticator.setPassword(password);
	}

	@Override
	public boolean authenticatePassword(int password) {
		return this.authenticator.authenticatePassword(password);
	}

	@Override
	public int getPassword() {
		return this.password;
	}
	
}
