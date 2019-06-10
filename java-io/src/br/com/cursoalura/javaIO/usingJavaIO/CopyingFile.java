package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyingFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("text-file.txt");
		Reader reader = new InputStreamReader(fis);
		BufferedReader buffReader = new BufferedReader(reader);

		FileOutputStream fos = new FileOutputStream("my-copy.txt");
		Writer writer = new OutputStreamWriter(fos);
		BufferedWriter buffWriter = new BufferedWriter(writer);

		String line = buffReader.readLine();

		while (line != null) {
			buffWriter.write(line);
			buffWriter.newLine();
			line = buffReader.readLine();
		}

		buffReader.close();
		buffWriter.close();

	}

}
