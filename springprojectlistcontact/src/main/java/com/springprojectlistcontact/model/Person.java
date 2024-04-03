package com.springprojectlistcontact.model;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String cpf;
    private Contact contact; 
}
