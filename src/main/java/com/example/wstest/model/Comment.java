package com.example.wstest.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {//评论
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "comment_comid")
    @TableGenerator(name = "comment_comid", initialValue = 0,allocationSize = 1, table = "seq_table")
    private int comid;//评论id
    private int uid;//评论者id
    private Date time;//时间
    private String content;//内容
    private int pid;//帖子id

    public int getComid() {
        return comid;
    }

    public void setComid(int comid) {
        this.comid = comid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
