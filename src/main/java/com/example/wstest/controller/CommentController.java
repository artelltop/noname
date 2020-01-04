package com.example.wstest.controller;

import com.example.wstest.model.Comment;
import com.example.wstest.model.Users;
import com.example.wstest.model.classs.ComU;
import com.example.wstest.service.CommentService;
import com.example.wstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*关于评论的详情页面*/

@CrossOrigin
@RestController
@RequestMapping("{pid}/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;

    @GetMapping("/list")//一条帖子下所有的评论
    public List list(@PathVariable("pid")int pid){
        List<ComU> list3 = new ArrayList<>();
        List<Comment> list = commentService.list(pid);
        for (Comment i:list){
            Users users = userService.findByUid(i.getUid());
            ComU comU = new ComU();
            comU.setNickname(users.getNickname());
            comU.setAuthentication(users.isAuthentication());
            comU.setComment(commentService.findByComid(i.getComid()));
            list3.add(comU);
        }
        return list3;
    }

    @PostMapping("/add")//添加新的评论
    private void add(Comment comment){
        comment.setTime(new Date());
        commentService.add(comment);
    };

    @PostMapping("/delete")//删除评论
    private void delete(int comId){
        commentService.delete(comId);
    }


}
