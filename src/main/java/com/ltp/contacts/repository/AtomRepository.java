package com.ltp.contacts.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Atom;

@Repository
public class AtomRepository {
    
    private List<Atom> atoms = new ArrayList<>();

    public List<Atom> getContacts() {
        return atoms;
    }

    public Atom getContact(int index) {
        return atoms.get(index);
    }

    public void saveContact(Atom atom) {
        atoms.add(atom);
    }

    public void updateContact(int index, Atom atom) { 
        atoms.set(index, atom); 
    }
    
    public void deleteContact(int index) {
        atoms.remove(index);
    }

}
