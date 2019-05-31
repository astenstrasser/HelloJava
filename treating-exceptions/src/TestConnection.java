
public class TestConnection {

	public static void main(String[] args) {
	
//		One way to assure the connection will be closed:
//		Using finally. Problems: we need to create the reference before
//		in order we wont have errors when we try to close it on finally.
//		
//		Connection c = null;
//		try {
//			c = new Connection();
//			c.readData();
//		} catch (IllegalStateException ise) {
//			System.out.println("Connection Error");
//		} finally {
//			c.close();
//		}
//		
//		The improved way is to implement a "try with resources"
		
		
		try (Connection c = new Connection()) {
			c.readData();
		} catch (IllegalStateException ise) {
			System.out.println("Connection Error");
		}
		
	}
	
}
