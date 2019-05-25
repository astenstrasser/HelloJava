
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

//	we can also create a second constructor! 
//	In this case we want to set profession as student always when there is no given profession

//	public Client(String clientName, String taxNumber) {
//		this.clientName = clientName;
//		this.taxNumber = taxNumber;
//		this.profession = "Student";
//	}

//	to avoid duplicate coding, we can do it as follows

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
