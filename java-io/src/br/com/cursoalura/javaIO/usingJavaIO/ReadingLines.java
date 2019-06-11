package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadingLines {

	public static void main(String[] args) throws IOException {

		InputStream fileInputStream = new FileInputStream("text-file.txt");
		Reader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = bufferedReader.readLine();

		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}

		bufferedReader.close();

	}

}
