package com.ltp.contacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.contacts.pojo.Atom;
import com.ltp.contacts.pojo.Quark;
import com.ltp.contacts.repository.AtomRepository;
import com.ltp.contacts.repository.QuarkRepository;

@Service
public class QuarkServiceImpl implements QuarkService {

    @Autowired
    private QuarkRepository quarkRepository;

    @Autowired
    private AtomRepository atomRepository;

    @Override
    public void save(Quark quark, Long atomId, Long quarkId) {
        Atom atom = atomRepository.findById(atomId).get();
        quark.setAtom(atom); // link foreign key to atom table
        this.quarkRepository.save(quark);
    }

    @Override
    public List<Quark> getAllByAtomId(Long id) {
        return this.quarkRepository.findAllByAtomId(id);
    }

    @Override
    public Quark getByAtomId(Long id) {
        return this.quarkRepository.findByAtomId(id);
    }

    @Override
    public void deleteById(Long id) {
        this.quarkRepository.deleteById(id);
    }

    @Override
    public List<Quark> getAll() {
        return (List<Quark>) this.quarkRepository.findAll();
    }

}
