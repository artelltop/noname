package com.example.wstest.model;

import javax.persistence.*;

@Entity
@Table(name = "org")
public class Org {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "org_oid")
    @TableGenerator(name = "org_oid", initialValue = 0,allocationSize = 1, table = "seq_table")
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
