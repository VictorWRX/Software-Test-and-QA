package com.ContactTest;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.Contact.Contact;
import com.Contact.ContactService;

class ContactServiceTest {
		
	@Test
	public void testContactService() {
		ContactService contactService = new ContactService();
		Contact contactMobile1 = new Contact("A12", "Victor", "Gomez", "1112223333", "New York");
		Contact contactMobile2 = new Contact("A3", "Maximus", "Gomez", "5556667777", "Texas");
		Contact contactMobile3 = new Contact("A19", "Dante", "Gomez", "0008889999", "Hawaii");
		
		
		assertTrue(contactService.addContact(contactMobile1));
		assertTrue(contactService.addContact(contactMobile2));
		assertTrue(contactService.addContact(contactMobile3));
		
		assertTrue(contactService.deleteContact("A12"));
		
		assertTrue(contactService.updateContactFirstName("A3", "Dante"));
		assertTrue(contactService.updateContactLastName("A3", "Maximus"));
		assertTrue(contactService.updateContactNumber("A3", "1234567890"));
		assertTrue(contactService.updateContactAddress("A3", "Alaska"));
			
		
	}
	
	@Test
	public void testContactServiceUniqueID() {
		
		ContactService contactService = new ContactService();
		Contact contactMobile1 = new Contact("A12", "Victor", "Gomez", "1112223333", "New York");
		Contact contactMobile4 = new Contact("A12", "Victor", "Gomez", "1112223333", "New York");
		contactService.addContact(contactMobile1);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{contactService.addContact(contactMobile4);});						
	}
	

}
