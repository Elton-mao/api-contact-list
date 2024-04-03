package com.springprojectlistcontact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprojectlistcontact.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, String> {

}
