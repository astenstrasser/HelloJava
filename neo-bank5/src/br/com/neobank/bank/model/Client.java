package br.com.neobank.bank.model;

public class Client {

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

}
