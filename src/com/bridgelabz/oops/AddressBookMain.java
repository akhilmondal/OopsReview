package com.bridgelabz.oops;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address book problem");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        System.out.println("Name of the contact is: " + addressBook1.contact1.getName());
        System.out.println("Age of " + addressBook1.contact1.getName() + " is: " + addressBook1.contact1.getAge());
        System.out.println("Phone number of " + addressBook1.contact1.getName() + " is: " + addressBook1.contact1.getPhoneNumber());
        System.out.println("City of " + addressBook1.contact1.getName() + " is: " + addressBook1.contact1.getCity());
        System.out.println("State of " + addressBook1.contact1.getName() + " is: " + addressBook1.contact1.getState());
    }
}
