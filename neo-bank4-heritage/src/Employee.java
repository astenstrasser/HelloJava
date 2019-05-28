//when a class is abstract we can not create instances of this class.
//it serves as a generic class. The instances should be created of children classes.

public abstract class Employee {

	private String name;
	private String taxNumber;
//	protected double salary;
	
//	The protected modifier implicates that this attribute 
//	is valid for this class and for children classes. 
//	But we still want to keep it private. Is always better to use it encapsulated.
//	We can use the getter getSalary() to access it from other files.  
	private double salary;

	
//	the getBonus method is implemented diferently in each children class. We don't need an implementation of it.
//	But every children class needs!
	public abstract double getBonus();

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
