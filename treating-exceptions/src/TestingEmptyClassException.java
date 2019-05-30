
public class TestingEmptyClassException {

	public static void main(String[] args) {
		EmptyClass empty = new EmptyClass();
		try {
			empty.emptyMethod();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
