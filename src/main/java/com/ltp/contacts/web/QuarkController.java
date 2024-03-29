package com.ltp.contacts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.contacts.pojo.Atom;
import com.ltp.contacts.pojo.Quark;
import com.ltp.contacts.service.QuarkService;

@RestController
public class QuarkController {

    @Autowired
    private QuarkService quarkService;

    @GetMapping("/atom/{id}/quarks")
    public ResponseEntity<List<Quark>> getAtoms(@PathVariable Long id) {
        // Quark quark = quarkService.getByAtomId(id);
        List<Quark> quark = quarkService.getAllByAtomId(id);
        return new ResponseEntity<List<Quark>>(quark, HttpStatus.OK);
    }

    @PostMapping("/atom/{id}/quark")
    public ResponseEntity<HttpStatus> createAtom(@RequestBody Quark quark, @PathVariable Long id) {
        quarkService.save(quark, id, null);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // @GetMapping("/atom/all")
    // public ResponseEntity<List<Atom>> getAtoms() {
    // List<Atom> atoms = atomService.getAtoms();
    // return new ResponseEntity<List<Atom>>(atoms, HttpStatus.OK);
    // }

    // @PostMapping("/atom")
    // public ResponseEntity<HttpStatus> createAtom(@RequestBody Atom atom) {
    // atomService.saveAtom(atom);
    // return new ResponseEntity<>(HttpStatus.CREATED);
    // }

    // @GetMapping("/atom/{id}")
    // public ResponseEntity<Atom> getAtom(@PathVariable Long id) {
    // Atom a = atomService.getAtomById(id);
    // return new ResponseEntity<Atom>(a, HttpStatus.OK);
    // }

    // @DeleteMapping("/atom/{id}")
    // public ResponseEntity<Atom> deleteAtom(@PathVariable Long id) {
    // atomService.deleteAtomById(id);
    // return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }

    // ========================================================================
    // ============================ TESTING AND LEARNING CODE BELOW:

}