package com.ltp.contacts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.service.ContactService;

import com.ltp.contacts.pojo.Atom;
import com.ltp.contacts.service.AtomService;


@RestController
public class AtomController {
    
    @Autowired
    private ContactService contactService;

    @Autowired
    private AtomService atomService;

    @GetMapping("/atom/all")
    public ResponseEntity<List<Atom>> getAtom() {
        List<Atom> atoms = atomService.getAtoms();
        return new ResponseEntity<>(atoms, HttpStatus.OK);
    }

    // @GetMapping("/atom/{id}")
    // public ResponseEntity<Contact> getContact(@PathVariable String id) {
    //     Contact contact = contactService.getContactById(id);
    //     return new ResponseEntity<>(contact, HttpStatus.OK);
    // }
    
    // @PostMapping("/atom")
    // public ResponseEntity<HttpStatus> createContact(@RequestBody Contact contact) {
    //     contactService.saveContact(contact);
    //     return new ResponseEntity<>(HttpStatus.CREATED);
    // }

    // @PutMapping("/atom/{id}")
    // public ResponseEntity<Contact> updateContact(@PathVariable String id, @RequestBody Contact contact) {
    //     contactService.updateContact(id, contact);   
    //     return new ResponseEntity<Contact>(contactService.getContactById(id), HttpStatus.OK);
    // }

    // @DeleteMapping("/atom/{id}")
    // public ResponseEntity<HttpStatus> deleteContact(@PathVariable String id) {
    //     contactService.deleteContact(id);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }


}