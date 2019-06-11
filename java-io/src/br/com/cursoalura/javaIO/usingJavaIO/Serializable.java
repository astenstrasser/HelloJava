package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String nome = "My String is an Object";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String serialized = (String) ois.readObject();
		ois.close();
		
		System.out.println(serialized);
		
		ClientSerializable client = new ClientSerializable();
		client.setName("Serializable client");
		client.setProfession("Writer");
		client.setTaxId(12535);
		
		oos = new ObjectOutputStream(new FileOutputStream("objetoClient.bin"));
		oos.writeObject(client);
		oos.close();
		
		ois = new ObjectInputStream(new FileInputStream("objetoClient.bin"));
		ClientSerializable clientSerializable = (ClientSerializable) ois.readObject();
		System.out.println(clientSerializable.getProfession());
		ois.close();
	}


}
