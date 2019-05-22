
public class TestingValues {

	public static void main(String[] args) {
		int firstValue = 5;
		int secondValue = 10;
		secondValue = firstValue;
		firstValue = 10;
		
		System.out.println(secondValue);
		
// This means Java stores the value of the variable, not the space in memory where it is stored. 
	}
	
}
