package com.example.wstest.model.classs;

import com.example.wstest.model.Comment;
import lombok.Data;

@Data
public class ComU {
    private Comment comment;
    private String nickname;
    private Boolean authentication;
}
