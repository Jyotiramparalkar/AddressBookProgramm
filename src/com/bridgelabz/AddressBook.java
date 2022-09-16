package com.bridgelabz;

public class AddressBook {	
	
	//Created an array of size 10 to store contacts
	Contact[] allContacts = new Contact[10];
	static int index=0;
		
	public void addToAddressBook(Contact personContact) {
		allContacts[index]=personContact;
		index++;
	}
	
	public void editPersonEmailId(String name) {
		int i=0, ch=0;
		for(; i < allContacts.length-1; i++) 
		{	
			System.out.println(allContacts[i].firstName);
			String temp= allContacts[i].firstName;
			if(temp == name) {
				allContacts[i].emailId = "change@gmail.com";
				ch=1;
				break;
			}
		}
		
		if(ch==0) {
			System.out.println("Invaild contact details ::");
		}
	}
	
}