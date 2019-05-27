
public class Employee {

	private String name;
	private String taxNumber;
	private double salary;

	public double getBonus() {
		return this.salary * 0.1;
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
