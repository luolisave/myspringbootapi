package ca.lluo.lisexpress.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ca.lluo.lisexpress.pojo.Atom;

@Repository
public class OldAtomRepository {

    private List<Atom> atoms = new ArrayList<>();

    public List<Atom> getAtoms() {
        return atoms;
    }

    public Atom getAtom(int index) {
        return atoms.get(index);
    }

    public void saveAtom(Atom atom) {
        atoms.add(atom);
    }

    public void updateAtom(int index, Atom atom) {
        atoms.set(index, atom);
    }

    public void deleteAtom(int index) {
        atoms.remove(index);
    }

}
