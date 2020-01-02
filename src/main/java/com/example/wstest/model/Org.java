package com.example.wstest.model;

import javax.persistence.*;

@Entity
@Table(name="org")
public class Org {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private String orginformation;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOrginformation() {
        return orginformation;
    }

    public void setOrginformation(String orginformation) {
        this.orginformation = orginformation;
    }
}
