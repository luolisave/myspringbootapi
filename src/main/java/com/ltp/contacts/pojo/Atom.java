package com.ltp.contacts.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

// insert into atom values('1', 'content content content 1', 'desc 1', 'title 1')
// insert into atom values('2', 'content content content 2', 'desc 2', 'title 2')
@Entity
@Table(name = "atom")
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return this.title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
