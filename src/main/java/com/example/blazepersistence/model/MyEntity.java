package com.example.blazepersistence.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "my_entity")
public class MyEntity {
    @EmbeddedId
    private Emb emb;

    @Column(name = "test")
    private String test;

    @Column(name = "case_1")
    private String case1;

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Emb getEmb() {
        return emb;
    }

    public void setEmb(Emb emb) {
        this.emb = emb;
    }

}