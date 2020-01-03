package com.example.wstest.model.classs;

import com.example.wstest.model.Posts;
import com.example.wstest.model.Users;

import java.util.Date;

public class PU {


    private String nickname;

    private boolean authentication;

    private int uid;
    private int pid;
    private Date time;
    private int oid;

    public PU(String nickname, boolean authentication, int uid, int pid, Date time, int oid, int cid, String content) {
        this.nickname = nickname;
        this.authentication = authentication;
        this.uid = uid;
        this.pid = pid;
        this.time = time;
        this.oid = oid;
        this.cid = cid;
        this.content = content;
    }

    private int cid;
    private String content;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
