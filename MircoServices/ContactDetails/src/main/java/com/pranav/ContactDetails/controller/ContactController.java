package com.pranav.ContactDetails.controller;

import com.pranav.ContactDetails.model.Contact;
import com.pranav.ContactDetails.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    public ContactController()
    {
        System.out.println("Hello");
    }
    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        System.out.println("HIIIIII");
        return this.contactService.getContactsOfUser(userId);
    }
}
