package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyingFile {

	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("text-file.txt");
		Reader reader = new InputStreamReader(fis);
		BufferedReader buffReader = new BufferedReader(reader);

		OutputStream fos = new FileOutputStream("text-file2.txt");
		Writer writer = new OutputStreamWriter(fos);
		BufferedWriter buffWriter = new BufferedWriter(writer);

		String line = buffReader.readLine();
		while (line != null && !line.isEmpty()) {
			buffWriter.write(line);
			buffWriter.newLine();
			buffWriter.flush();
			line = buffReader.readLine();
		}

		buffReader.close();
		buffWriter.close();

	}

}
