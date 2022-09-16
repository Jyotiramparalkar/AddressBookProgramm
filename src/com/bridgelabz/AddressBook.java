package com.bridgelabz;

import java.util.Scanner;

public class AddressBook 
{
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	int phoneNumber;
	String emailId;	

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			int phoneNumber, String emailId) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public void showdetails() 
	{
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Zip : "+zip);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email Id : "+emailId);
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String firstName1,lastName1, address1, city1, state1, zip1, email1;
		int phoneNo1;
		
		System.out.println("Enter all details of contact ::");
		System.out.println("Enter the first name ::");
		firstName1 = in.nextLine();
		System.out.println("Enter the last name ::");
	    lastName1 = in.nextLine();
		System.out.println("Enter the Address name ::");
		address1 = in.nextLine();
		System.out.println("Enter the City name ::");
		city1 = in.nextLine();
		System.out.println("Enter the State name ::");
		state1 = in.nextLine();
		System.out.println("Enter the zip code ::");
		zip1 = in.nextLine();
		System.out.println("Enter a Phone number ::");
		phoneNo1 = in.nextInt();
		System.out.println("Enter the Email-ID ::");
		email1 = in.nextLine();		
		
		AddressBook addressBookObj1 = new AddressBook(firstName1, lastName1, address1, city1, state1, zip1,
				 phoneNo1, email1);
		addressBookObj1.showdetails();
		
		in.close();

	}
	
}
