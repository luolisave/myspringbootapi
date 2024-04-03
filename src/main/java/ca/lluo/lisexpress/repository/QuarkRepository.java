package ca.lluo.lisexpress.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.lluo.lisexpress.pojo.Quark;

@Repository
public interface QuarkRepository extends CrudRepository<Quark, Long> {
    List<Quark> findAllByAtomId(Long atomId);

    Quark findByAtomId(Long atomId);
}
