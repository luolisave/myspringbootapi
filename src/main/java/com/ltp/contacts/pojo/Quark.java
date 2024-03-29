package com.ltp.contacts.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    @ManyToOne(optional = false)
    @JoinColumn(name = "atom_id", referencedColumnName = "id", nullable = false)
    private Atom atom;

}
