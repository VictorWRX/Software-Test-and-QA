package com.Contact;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		
		if(contactID != null && contactID.length()<= 10) {
			this.contactID = contactID;
		}
		else {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		this.setFName(firstName);
		this.setLName(lastName);
		this.setPhone(phoneNum);
		this.setAddress(address);
		
	}
	
	public void setFName(String firstName) {
		if(firstName != null && firstName.length() <= 10) {
			
			this.firstName = firstName;			
		}
		else {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
	}
	
	public void setLName(String lastName) {
		if(lastName != null && lastName.length() <= 10) {
			
			this.lastName = lastName;			
		}
		else {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
	}
	
	public void setPhone(String phoneNum) {
		if(phoneNum != null && phoneNum.length() <= 10) {
			
			this.phoneNum = phoneNum;			
		}
		else {
			throw new IllegalArgumentException("Invalid Phone#");
		}
		
	}
	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			
			this.address = address;			
		}
		else {
			throw new IllegalArgumentException("Invalid Address");
		}
		
	}
	
	public String getContactID() {
		
		return contactID;
		
	}
	
	public String getFName() {
		
		return firstName;
		
	}
	
	public String getLName() {
		
		return lastName;
		
	}
	
	public String getPhoneNumber() {
		
		return phoneNum;
		
	}
	
	public String getAddress() {
		
		return address;
		
	}
	
	
}
