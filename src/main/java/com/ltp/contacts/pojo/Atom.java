package com.ltp.contacts.pojo;

public class Atom {

    private String key;
    private String value;

    public Atom(String key){
        this.key = key;
    } 

    public String getValue() {
        return this.value;
    }

    public void setValue(String name) {
        this.value = name;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
