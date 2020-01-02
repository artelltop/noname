package com.example.wstest.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;


@Entity
@Table(name="posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private int uid;
    private Date time;
    private int oid;
    private int cid;
    private String content;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
