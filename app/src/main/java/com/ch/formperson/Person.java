package com.ch.formperson;

public class Person {
    private String document;
    private String name;
    private String lastName;

    public Person(String document, String name, String lastName) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
