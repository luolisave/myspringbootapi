package com.ltp.contacts.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.contacts.pojo.Atom;
import com.ltp.contacts.pojo.Contact; // TODO: REMOVE
import com.ltp.contacts.repository.AtomRepository;
import com.ltp.contacts.repository.OldAtomRepository;

@Service
public class AtomServiceImpl implements AtomService {

    @Autowired
    private OldAtomRepository oldAtomRepository; // TODO: REMOVE

    @Autowired
    private AtomRepository atomRepository;

    @Override
    public void saveAtom(Atom atom) {
        this.atomRepository.save(atom);
    }

    @Override
    public Atom getAtomById(Long id) {
        return this.atomRepository.findById(id).get();
    }

    @Override
    public void deleteAtomById(Long id) {
        this.atomRepository.deleteById(id);
    }

    @Override
    public List<Atom> getAtoms() {
        return (List<Atom>) this.atomRepository.findAll();
    }

}
