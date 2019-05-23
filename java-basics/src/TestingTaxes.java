
public class TestingTaxes {

	public static void main(String[] args) {

		double salary = 3300.0;
		double tax;
		double taxToPay;

		if (salary >= 1900.0 && salary <= 2800.0) {
			tax = 7.5 / 100;
			taxToPay = salary * tax;
			if (taxToPay > 142) {
				System.out.println(142.0);
			} else {
				System.out.println(taxToPay);
			}
		} else {
			if (salary > 2800.01 && salary <= 3751.0) {
				tax = 15.0 / 100;
				taxToPay = salary * tax;
				if (taxToPay > 350.0) {
					System.out.println(350.0);
				} else {
					System.out.println(taxToPay);
				}
			} else {
				if (salary >= 3751.1 && salary <= 4664.00) {
					tax = 22.5 / 100;
					taxToPay = salary * tax;
					if (taxToPay > 636.0) {
						System.out.println(636.0);
					} else {
						System.out.println(taxToPay);
					}
				}
			}
		}
	}
}