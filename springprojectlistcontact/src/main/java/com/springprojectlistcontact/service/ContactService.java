package com.springprojectlistcontact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojectlistcontact.model.Contact;
import com.springprojectlistcontact.repository.ContactRepository;

@Service
public class ContactService {
    @Autowired
    private ContactRepository cRepository;

    @SuppressWarnings("null")
    public Contact saveContact(Contact contact){
        cRepository.save(contact);
        return contact;
    }
}
