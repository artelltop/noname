package com.example.wstest.model;

import javax.persistence.*;

@Entity
@Table(name = "classify")
public class Classify {//帖子类别
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "classify_cid")
    @TableGenerator(name = "classify_cid", initialValue = 0,allocationSize = 1, table = "seq_table")
    private int cid;//类别id
    private String classname;//类别名

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
