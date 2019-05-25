
public class Client {

	private String clientName;
	private String taxNumber;
	private String profession;

//	with the use of the constructor method, we may not need every setter

	public Client(String clientName, String taxNumber, String profession) {
		this.clientName = clientName;
		this.taxNumber = taxNumber;
		this.profession = profession;
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
