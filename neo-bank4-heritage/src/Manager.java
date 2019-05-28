
public class Manager extends Employee {

//	Manager get the same methods as Employee
	
	private int password;
	
	
//	The rule is: Managers get the usual bonus that every employee receives, added to their salary
	public double getBonus() {
		return super.getSalary();
	}
//	calling the method using super is possible to call the method with the same name in mother class.
//	If we would use salary as protected attribute, we could use super.salary to refer to it.
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
