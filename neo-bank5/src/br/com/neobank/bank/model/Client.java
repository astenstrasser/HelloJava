package br.com.neobank.bank.model;

import java.io.Serializable;

public class Client implements Serializable{

	private String clientName;
	private String taxNumber;
	private String profession;


	public Client(String clientName, String taxNumber, String profession) {
		this.clientName = clientName;
		this.taxNumber = taxNumber;
		this.profession = profession;
	}

	public Client(String clientName, String taxNumber) {
		this(clientName, taxNumber, "Student");
	}
	
	public Client() {
		this.clientName = "";
		this.taxNumber = "";
		this.profession = "";
	}

	public String getClientName() {
		return this.clientName;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


}
