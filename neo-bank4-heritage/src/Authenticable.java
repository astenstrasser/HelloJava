
public abstract interface Authenticable{
		
	public void setPassword(int password);
	
	public boolean authenticatePassword(int password);
	
	public int getPassword();
	
}
