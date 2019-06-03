package br.com.neobank.bank.test;

public class TestingString {

	public static void main(String[] args) {

//		trying String methods.

//		replace
		String name = "Alura";
		name = name.replace("A", "a");
		System.out.println(name);

//		lowercase
		String mama = "MAMA";
		mama.toLowerCase();
		System.out.println(mama);
		String mamaLow = mama.toLowerCase();
		System.out.println(mamaLow);

//		get position (charAt(int))
		String abc = "abcdefg";
		char position = abc.charAt(1);
		System.out.println(position);

//		get index of String
		int index = abc.indexOf("cd");
		System.out.println(index);

//		form substrings giving positions
		System.out.println(abc.substring(2));
		System.out.println(abc.substring(0, 2));

//		length
		System.out.println(abc.length());
		for (int i = 0; i < abc.length(); i++) {
			System.out.println(abc.charAt(i));
		}

//		is empty?
		String empty = "";
		System.out.println(empty.isEmpty());

//		trim
		String notThatEmpty = " ";
		empty = notThatEmpty.trim();
		System.out.println(empty.isEmpty());

//		contains
		name = "Stundent";
		boolean contains = name.contains("und");
		System.out.println(contains);

//		Class StringBuilder:
//		mutable object, more efficient then method .concat("string")
		StringBuilder builder = new StringBuilder("This");
		builder.append(" is");
		builder.append(" a");
		builder.append(" very");
		builder.append(" long");
		builder.append(" text");
		System.out.println(builder);
		String aVeryLongText = builder.toString();
		System.out.println(aVeryLongText);

	}

}