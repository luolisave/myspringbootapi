package ca.lluo.lisexpress.service;

import java.util.List;

import ca.lluo.lisexpress.pojo.Quark;

public interface QuarkService {
    void save(Quark quark, Long atomId, Long quarkId);

    List<Quark> getAllByAtomId(Long id);

    Quark getByAtomId(Long id);

    void deleteById(Long id);

    List<Quark> getAll();
}
