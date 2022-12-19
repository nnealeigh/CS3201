import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContactTest {
	
	private String contactId, name, longName, description, longDescription, phone, address;


	@BeforeEach
	void setUp() {
		contactId = "0123456789";
		name = "John Doe";
		longName = "John Doe Jane Doe James";
		description = "Description";
		longDescription = "Description Lorem ipsum dolor sit amet, consectetur adipiscing Lorem ipsum dolor sit amet, consectetur adipiscing";
		phone = "123456789";
	    address = "Lorem ipsum dolor sit amet, consectetur adipiscing";		
	}
	@Test
	void defaultConstructor() {
		Contact test = new Contact();
	}
	
	@Test
	void testName() {
		Contact test = new Contact(contactId, name, description, phone, address);
		assertThrows(IllegalArgumentException.class,
                () -> test.setname(longName));
	}
	
	@Test
	void testDescription() {
		Contact test = new Contact(contactId, name, description, phone, address);
		assertThrows(IllegalArgumentException.class,
                () -> test.setdescription(longDescription));
	}

	@Test
	void testToString() {
		Contact test = new Contact(contactId, name, description, phone, address);
		String testString = test.toString();
	}
}
