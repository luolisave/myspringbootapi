package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.pojo.Atom;

public interface AtomService {
    Atom getByKey(String key);
    List<Atom> getAtoms();
    // void saveContact(Contact contact);
    // void updateContact(String id, Contact contact);
    // void deleteContact(String id);
    // List<Contact> getContacts();
}
