package com.ContactTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.Contact.Contact;

class ContactTest {
		
	@Test
	public void testContactID() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12123321654", "Victor", "Gomez", "1112223333", "New York");});
						
	}
	
	@Test
	public void testContactIDNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact(null, "Victor", "Gomez", "1112223333", "New York");});
						
	}
	
	@Test
	public void testContactFirstName() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor9816521", "Gomez", "1112223333", "New York");});
				
	}
	
	@Test
	public void testContactFirstNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", null, "Gomez", "1112223333", "New York");});
				
	}
	
	@Test
	public void testContactLastName() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor", "Gomez3219813231", "1112223333", "New York");});
		
	}
	
	@Test
	public void testContactLastNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor", null, "1112223333", "New York");});
		
	}
	
	@Test
	public void testContactPhone() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor", "Gomez", "1112223333650320", "New York");});
		
	}
	
	@Test
	public void testContactPhoneNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor", "Gomez", null, "New York");});
		
	}
	
	@Test
	public void testContactAddress() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor9816521", "Gomez", "1112223333", "New York98761621984632109843210984621984163541984516512");});
		
	}
		
	@Test
	public void testContactAddressNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("A12", "Victor9816521", "Gomez", "1112223333", null);});
		
	}
	

}
