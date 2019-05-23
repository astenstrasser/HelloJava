
public class TestingConversion {
	
	public static void main(String[] args) {
		
		double salary = 1270.50;
		int value = (int) salary; //This is called casting
		System.out.println(value);

		// Other variable types:

		short shortValue = 2131;
		byte b = 127;
		long bigNumber = 32432423523L;
		System.out.println(bigNumber);

		
		double value1 = 0.2;
		double value2 = 0.1;
		double sum = value1 + value2;
		System.out.println(sum);
		
//		float floatValue = 3.14; Cannot do it, it only accepts as a double. We need to convert it. Float is smaller then double.
		
		float floatValue = 3.14f; //This is also a casting method. In this operation information could get lost.
		System.out.println(floatValue);
		
		
	}

}