package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WritingFile {

	public static void main(String[] args) throws IOException {

		OutputStream fileOutputStream = new FileOutputStream("text-file2.txt");
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		bufferedWriter.write("Sing us a song,");
		bufferedWriter.newLine();
		bufferedWriter.write("you are the piano man.");

		bufferedWriter.close();

	}

}
