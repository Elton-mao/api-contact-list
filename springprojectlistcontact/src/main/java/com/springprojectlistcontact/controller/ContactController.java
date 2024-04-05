package com.springprojectlistcontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprojectlistcontact.dto.ContactDTO;
import com.springprojectlistcontact.model.Contact;
import com.springprojectlistcontact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping
    public Contact save(@RequestBody ContactDTO data){
        Contact contact = new Contact(data.name(), data.email());
        return contactService.saveContact(contact);
    }

    @GetMapping
    @CrossOrigin
    public List<Contact> contactList() {
        List<Contact> contacts = contactService.listAll();
        return contacts;
    }
    
}
