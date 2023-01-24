package com.bridgelabz.oops;

public class AddressBook {

    Contact contact1 = new Contact();
    void addContact() {
        contact1.setName("Akhil"); // Here, assigning value to the private variables of the class Contact. Through contact1 object.
        contact1.setAge("24");
        contact1.setPhoneNumber("934-851-6847");
        contact1.setCity("Malkangiri");
        contact1.setState("Odisha");
    }
}
