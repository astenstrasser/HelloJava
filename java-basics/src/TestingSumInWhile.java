
public class TestingSumInWhile {

	public static void main(String[] args) {
		int tracker = 0;
		int sumResult = 0;

		while (tracker <= 10) {
			sumResult += tracker;
			tracker++;
			System.out.println(sumResult);
		}
	}

}
