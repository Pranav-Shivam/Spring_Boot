package com.pranav.Juint5.contactInfo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
    Map<String,Contact> contactList=new ConcurrentHashMap<>();
    public void addContact(String fName,String lName,String phNo)
    {
        Contact contact=new Contact(fName,lName,phNo);
        validateContact(contact);
        checkIfContactAlreadyExist(contact);
        contactList.put(generateKey(contact),contact);
    }
    private void checkIfContactAlreadyExist(Contact contact) {
        if (contactList.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact Already Exists");
    }
    public Collection<Contact> getAllContact()
    {
        return contactList.values();
    }
    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
    }
    private void validateContact(Contact contact) {
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNumber();
    }
}
