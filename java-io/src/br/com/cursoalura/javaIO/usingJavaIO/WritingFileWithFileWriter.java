package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFileWithFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("text-file2.txt");

		fw.write("Sing us a song,");
		fw.write(System.lineSeparator());
		fw.write("you are the piano man.");

		fw.close();

//		could also use a buffered writer with file writer:

//		FileWriter fw = new FileWriter("text.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		bw.write("Sing us a song");
//		bw.newLine();
//		bw.write("You are the piano man");
//		
//		bw.close();

	}

}
