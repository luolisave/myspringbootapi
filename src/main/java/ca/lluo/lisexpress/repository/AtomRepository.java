package ca.lluo.lisexpress.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.lluo.lisexpress.pojo.Atom;

@Repository
public interface AtomRepository extends CrudRepository<Atom, Long> {
}
