//Nick Nealeigh
//SNHU
//CS320
public class Contact {

	private String contactId;
	private String name;
	private String description;
	private String phone;
	private String address;
	
	//default constructor
	public Contact() {
		this.contactId = "";
		this.name = "";
		this.description = "";
		this.phone = "";
		this.address = "";
	}
	
	//constructor
	public Contact(String contactId, String name, String description, String phone, String address) {
		this.contactId = contactId;
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.address = address;
	}
	
	//accessor/mutator generated with eclipse
	public String getContactId() {
		return contactId;
	}

//	public void settaskId(String taskId) {
//		this.taskId = taskId;
//	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		if( !name.equals(null) && !(name.length()>10) )
			this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		if( !description.equals(null) && !(description.length()>10) )
			this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if( !phone.equals(null) && !(phone.length()>10) )
			this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if( !address.equals(null) && !(address.length()>30) )
			this.address = address;
	}
	
	//toString method for
	public String toString() {
		return "Contact [taskId=" + contactId + ", name=" + name + ", description=" + description
				+ ", phoneNumber=" + phone + ", address=" + address + "]";
	}//end toString
	
}//end Contact
