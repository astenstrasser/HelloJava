
public class TestingWhile {

	public static void main(String[] args) {
		
		int tracker = 0;
		
		while (tracker <= 10) {
			System.out.println(tracker);
			tracker ++;	 
//			in Java we can use 'tracker += 1' or 'tracker ++' or even '++tracker' 
//			instead 'tracker = tracker + 1.' 
		}
		
		System.out.println(tracker);
		
	}
	
}
