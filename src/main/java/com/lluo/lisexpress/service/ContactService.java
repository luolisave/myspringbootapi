package com.lluo.lisexpress.service;

import java.util.List;

import com.lluo.lisexpress.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact);

    void deleteContact(String id);

    List<Contact> getContacts();
}
