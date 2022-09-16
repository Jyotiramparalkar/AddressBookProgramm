package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		AddressBook addressBook1 = new AddressBook();
		
		String firstName1,lastName1, address1, city1, state1, zip1, phoneNo1, email1;
		
		//Adding 1st person
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName1 = input.nextLine();
		lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		zip1 = input.nextLine();
		phoneNo1 = input.nextLine();
		email1 = input.nextLine();		
			
		Contact personObj1 =  new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);
		addressBook1.addToAddressBook(personObj1);
		
		personObj1.showdetails();
		
		//Adding 2nd person
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName1 = input.nextLine();
		lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		zip1 = input.nextLine();
		phoneNo1 = input.nextLine();
		email1 = input.nextLine();
		
		Contact personObj2 =  new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);
		addressBook1.addToAddressBook(personObj2);
			
		personObj2.showdetails();
		
		//Edit email id for given name
		System.out.println("Enter name to edit person details");
		String name=input.nextLine();
		addressBook1.editPersonEmailId(name);
		
		System.out.println("Data after edit");
		personObj1.showdetails();
		personObj2.showdetails();
		
		input.close();
	}

	

}