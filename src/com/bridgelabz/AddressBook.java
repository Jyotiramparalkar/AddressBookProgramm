package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {	
	
	//Created an array of size 100 to store contacts
	ArrayList<Contact> allContacts = new ArrayList<Contact>();
	//Contact[] allContacts = new Contact[100];
	
	public void addToAddressBook(Contact personContact) {
		allContacts.add(personContact);
	}
	
}
