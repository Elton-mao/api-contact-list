package com.springprojectlistcontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprojectlistcontact.model.Contact;
import com.springprojectlistcontact.service.ContactService;

@RestController
@RequestMapping("/test")
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping
    public Contact save(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }
    @GetMapping("/all")
    public List<Contact> contactList() {
        List<Contact> contacts =contactService.listAll();
        return contacts;
    }
}
