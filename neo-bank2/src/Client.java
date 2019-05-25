
public class Client {

	private String clientName;
	private String taxNumber;
	private String profession;

//	we could have generated the get and set methods using source -> 
//	->"Generate Getters and Setters..." -> select attributes 

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
