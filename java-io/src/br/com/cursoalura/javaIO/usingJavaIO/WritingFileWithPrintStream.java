package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WritingFileWithPrintStream {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps = new PrintStream("text-file2.txt");
		
		
		ps.println("Sing us a song,");
		ps.print("you are the piano man.");

		ps.close();
		
//		could also use PrintWriter
//		
//		PrintWriter pw = new printWriter("text.txt", "UTF-8");
//		
//		pw.println("Sing us a song");
//		pw.print("You are the piano man.");
//		pw.close();
		
	}

}
