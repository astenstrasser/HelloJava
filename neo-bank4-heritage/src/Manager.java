
public class Manager extends Employee implements Authenticable {

	private int password;
	private Authenticator authenticator;

	public double getBonus() {
		return super.getSalary();
	}

	public Manager() {
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
