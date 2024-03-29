package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.pojo.Quark;

public interface QuarkService {
    void save(Quark quark, Long atomId, Long quarkId);

    List<Quark> getAllByAtomId(Long id);

    Quark getByAtomId(Long id);

    void deleteById(Long id);

    List<Quark> getAll();
}
