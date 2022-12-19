import java.util.*;
public class ContactService {
	
	//Contact list
	private ArrayList<Contact> Contacts;
	
	public ContactService() {
		Contacts = new ArrayList<>();
	}
	
	//add Contact method
	//iterates over contacts list to check if a Contact already exists, adds it to the list if it doesn't
	public boolean addContact(Contact Contact) {
		boolean ContactExists = false;
		for(Contact k:Contacts) {
			if(k.getContactId().equals(Contact.getContactId())) {
				ContactExists = true;
			}//if k 
		}//for k:contacts
		if (!ContactExists) {
			Contacts.add(Contact);
			return true;
		}
		else
			return false;
	}//end addcontact
	
	//delete Contact method
	//iterates over Contact list to check if the Contact exists, deletes it if it does
	public boolean deleteContact(String contactId) {
		for (Contact k:Contacts) {
			if(k.getContactId().equals(contactId) ) {
				Contacts.remove(k);
				return true;
			}//if
		}//for k:contacts
		return false;		
	}//end deletecontact
	
	//
	public boolean updateContact(String contactId, String name, String description, String phone, String address) {
		for (Contact k:Contacts) {
			//if the Contact id matches, check each parameter for null/length requirement before updating
			if(k.getContactId().equals(contactId)) {
				if( !name.equals(null) && !(name.length()>10) ){
					k.setname(name);
				}
				if( !description.equals(null) && !(description.length()>10) ){
					k.setdescription(description);
				}
				if( !phone.equals(null) && !(phone.length()>10) ){
					k.setPhone(phone);
				}
				if( !address.equals(null) && !(address.length()>30) ){
					k.setAddress(address);
				}
				return true;
			}//end if Contact =
		}//end for
		return false;
	}//end updatecontact
	
	public void printcontacts() {
		for (Contact c:Contacts)
			System.out.println(c.toString());
	}//endPrint
	
}//contactService
