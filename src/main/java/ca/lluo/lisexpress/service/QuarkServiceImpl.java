package ca.lluo.lisexpress.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.lluo.lisexpress.exception.ItemNotFoundException;
import ca.lluo.lisexpress.pojo.Atom;
import ca.lluo.lisexpress.pojo.Quark;
import ca.lluo.lisexpress.repository.AtomRepository;
import ca.lluo.lisexpress.repository.QuarkRepository;

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
        Optional<Quark> quark = quarkRepository.findByAtomId(id);
        if (quark.isPresent()) {
            return quark.get();
        } else {
            throw new ItemNotFoundException(id);
        }
        // return this.quarkRepository.findByAtomId(id);
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
