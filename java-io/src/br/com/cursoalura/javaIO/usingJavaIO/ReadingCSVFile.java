package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ReadingCSVFile {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("accounts.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
//			System.out.println(line);

			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(", ");

			String accountType = lineScanner.next();
			int agency = lineScanner.nextInt();
			int accountNumber = lineScanner.nextInt();
			String name = lineScanner.next();
			double balance = lineScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"),
					"Account: %s | %04d-%08d | Account Holder: %15s | Balance: %08.2f%n", accountType, agency,
					accountNumber, name, balance);
			
			lineScanner.close();
		}

		scanner.close();

	}

}
