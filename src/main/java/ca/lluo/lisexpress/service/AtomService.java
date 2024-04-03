package ca.lluo.lisexpress.service;

import java.util.List;

import ca.lluo.lisexpress.pojo.Atom;

public interface AtomService {
    void saveAtom(Atom atom);

    Atom getAtomById(Long id);

    void deleteAtomById(Long id);

    List<Atom> getAtoms();
    // void saveContact(Contact contact);
    // void updateContact(String id, Contact contact);
    // void deleteContact(String id);
    // List<Contact> getContacts();
}
