package com.pranav.ContactDetails.service;

import com.pranav.ContactDetails.model.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsOfUser(Long userId);
}
