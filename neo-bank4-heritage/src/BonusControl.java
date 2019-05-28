
public class BonusControl {
	
	private double sum;

	public void register(Employee e) {
		double bonus = e.getBonus();
		this.sum += bonus;
	}
	
	public double getSum() {
		return this.sum;
	}
	
}
