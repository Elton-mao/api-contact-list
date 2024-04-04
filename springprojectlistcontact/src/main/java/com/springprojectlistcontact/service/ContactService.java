package com.springprojectlistcontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojectlistcontact.model.Contact;
import com.springprojectlistcontact.repository.ContactRepository;

@Service
public class ContactService {
    @Autowired
    private ContactRepository cRepository;

    public Contact saveContact(Contact contact){
        cRepository.save(contact);
        return contact;
    }
    public List<Contact> listAll(){
        List<Contact> contact = cRepository.findAll();
        return contact;
    }
    
}
