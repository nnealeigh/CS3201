//I used eclipse built in JUnit class here, so the import should be correct
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test
	public void testAdd() {
		ContactService ts = new ContactService();
		Contact test1 = new Contact("1111", "John", "Description1", "123456789", "123 F st");
		Contact test2 = new Contact("2222", "Jane", "Description1", "123456789", "123 F st");
		Contact test3 = new Contact("3333", "Jim", "Description1", "123456789", "123 F st");
		
		//checking that they work
		assertEquals(true, ts.addContact(test1));
		assertEquals(true, ts.addContact(test2));
		assertEquals(true, ts.addContact(test3));
		
		//shouldn't be able to add the same task 2x
		assertEquals(false, ts.addContact(test1));
	}
	
	@Test
	public void testDelete() {
		ContactService ts = new ContactService();
		Contact test1 = new Contact("1111", "John", "Description1", "123456789", "123 F st");
		Contact test2 = new Contact("2222", "Jane", "Description1", "123456789", "123 F st");
		Contact test3 = new Contact("3333", "Jim", "Description1", "123456789", "123 F st");
		
		//checking that they work
		assertEquals(true, ts.addContact(test1));
		assertEquals(true, ts.addContact(test2));
		assertEquals(true, ts.addContact(test3));
		
		//shouldn't be able to add the same task 2x
		//I have an issue here I can't sort out, doesn't want to delete the first task added - solved 11/27
		assertEquals(true, ts.deleteContact("1111"));
		assertEquals(true, ts.deleteContact("2222"));

	}
	
	@Test
	public void testUpdate() {
		ContactService ts = new ContactService();
		Contact test1 = new Contact("1111", "John", "Description1", "123456789", "123 F st");
		Contact test2 = new Contact("2222", "Jane", "Description1", "123456789", "123 F st");
		Contact test3 = new Contact("3333", "Jim", "Description1", "123456789", "123 F st");
		
		//checking that they work
		ts.addContact(test1);
		ts.addContact(test2);
		ts.addContact(test3);
		
		//testing update task 1111
		assertEquals(true, ts.updateContact("1111", "James", "Description1", "123456789", "123 F st"));
		
		//should fail, task id 0000 doesn't exist
		assertEquals(false, ts.updateContact("0000", "James", "Description1", "123456789", "123 F st"));
		
	}
}
