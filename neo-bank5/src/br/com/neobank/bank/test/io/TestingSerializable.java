package br.com.neobank.bank.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.neobank.bank.model.CheckingAccount;
import br.com.neobank.bank.model.Client;

public class TestingSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Client client = new Client("cool client", "435245", "developer");
		CheckingAccount ca = new CheckingAccount(1234, 542412);
		ca.setAccountHolder(client);
		ca.deposit(1241.20);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.bin"));
		oos.writeObject(ca);
		oos.close();
		
//		get Obj. back:
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.bin"));
		CheckingAccount caNew = (CheckingAccount) ois.readObject();
		ois.close();
		
		System.out.println(caNew.getAccountHolder().getClientName());
		
		
		
	}
}
