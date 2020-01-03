package com.example.wstest.service;

import com.example.wstest.model.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
     void add() {
        Users users = new Users();
        users.setPhone("132238627");
        users.setAuthentication(true);
        users.setInformation("2");
        users.setNickname("zzw2");
        users.setOrgid(0);
        users.setPassword("14567");
        userService.add(users);
    }

    @Test
    void delete() {
        userService.delete(1);

    }
}