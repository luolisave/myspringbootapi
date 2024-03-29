package com.ltp.contacts.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// insert into atom values('1', 'content content content 1', 'desc 1', 'title 1')
// insert into atom values('2', 'content content content 2', 'desc 2', 'title 2')
@Entity
@Table(name = "atom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Atom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "desc", columnDefinition = "VARCHAR(250)")
    private String desc;
    // @Lob
    // @Column(name = "content", columnDefinition = "BLOB") //
    // https://www.baeldung.com/hibernate-lob
    // private String content;
    @Column(name = "content", columnDefinition = "TEXT") // TEXT uses CHARACTER VARYING internally. 1GB max
    private String content;

}
