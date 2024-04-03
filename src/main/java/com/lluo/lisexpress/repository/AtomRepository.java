package com.lluo.lisexpress.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lluo.lisexpress.pojo.Atom;

@Repository
public interface AtomRepository extends CrudRepository<Atom, Long> {
}
