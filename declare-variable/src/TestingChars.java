
public class TestingChars {
	
	public static void main(String[] args) {
		
		char letter = 'a';
		System.out.println(letter);
		
		char letter2 = 66; //ASCII values 
		System.out.println(letter2);
		
		letter2 = (char) (letter2 + 1); //Without casting it wouldn't be possible
		System.out.println(letter2);
		
		String sentence = "Alura, online technology courses";
		sentence = sentence + 12345; //Here it is possible to sum a integer into a String, the result appears correctly.
		System.out.println(sentence);
	
		
	}

}
