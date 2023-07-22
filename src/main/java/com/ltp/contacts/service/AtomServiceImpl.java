package com.ltp.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.contacts.pojo.Atom;
import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.repository.AtomRepository;

@Service
public class AtomServiceImpl implements AtomService {

    @Autowired
    private AtomRepository atomRepository;

    // @Override
    // public Contact getContactById(String id) {
    //     return contactRepository.getContact(findIndexById(id));
    // }

    @Override
    public Atom getByKey(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByKey'");
    }

    @Override
    public List<Atom> getAtoms() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAtoms'");
    }

    // @Override
    // public void saveContact(Contact contact) {
    //     contactRepository.saveContact(contact);
    // }

    // @Override
    // public void updateContact(String id, Contact contact) {
    //     contactRepository.updateContact(findIndexById(id), contact);
    // }

    // @Override
    // public void deleteContact(String id) {
    //     contactRepository.deleteContact(findIndexById(id)); 
    // }

    // @Override
    // public List<Contact> getContacts() {
    //     return contactRepository.getContacts();
    // }


    // private int findIndexById(String id) {
    //     return IntStream.range(0, contactRepository.getContacts().size())
    //         .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
    //         .findFirst()
    //         .orElseThrow();
    // }

}
