package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Quark;

@Repository
public interface QuarkRepository extends CrudRepository<Quark, Long> {
}
