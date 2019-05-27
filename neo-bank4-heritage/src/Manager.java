
public class Manager extends Employee {

//	Manager get the same methods as Employee
	
	private int password;
	
	public double getBonus() {
		return super.salary;
	}
	
//	this.salary would make developers expect this attribute salary to be in class Manager.
//	super.salary makes clear that this attribute is inherited from mother class.
	
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
