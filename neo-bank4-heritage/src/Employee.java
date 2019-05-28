
public class Employee {

	private String name;
	private String taxNumber;
//	protected double salary;
	
//	The protected modifier implicates that this attribute 
//	is valid for this class and for children classes. 
//	But we still want to keep it private. Is always better to use it encapsulated.
//	We can use the getter getSalary() to access it from other files.  
	private double salary;

	public double getBonus() {
		return this.salary * 0.05;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

}
