package com.ltp.contacts.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// insert into atom values('1', 'content content content 1', 'desc 1', 'title 1')
// insert into atom values('2', 'content content content 2', 'desc 2', 'title 2')
@Entity
@Table(name = "quark")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "kkk", nullable = false)
    private String kkk;
    @Column(name = "vvv", columnDefinition = "TEXT")
    private String vvv;

    // @JsonIgnore //will not return this object in json if uncomment
    @ManyToOne(optional = false)
    @JoinColumn(name = "atom_id", referencedColumnName = "id", nullable = false)
    private Atom atom; // Atom.java uses @OneToMany(mappedBy = "atom"), atom is the name to link both.
                       // #ed8ei683wls

}
