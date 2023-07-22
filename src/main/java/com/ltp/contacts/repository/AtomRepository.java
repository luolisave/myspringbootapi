package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Atom;

@Repository
public interface AtomRepository extends CrudRepository<Atom, Long> {
}
