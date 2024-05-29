package com.example.myapp.model;

import java.util.ArrayList;

public class ContactManager {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    public static void addContact(Contact contact){
        contacts.add(contact);
    }

    public static ArrayList<Contact> getContacts(){
        return contacts;
    }

}
