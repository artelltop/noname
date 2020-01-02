package com.example.wstest.service;

import com.example.wstest.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void add(Users users) {

    }

    @Override
    public void delete(int uid) {

    }

    @Override
    public Users update(Users users) {
        return null;
    }

    @Override
    public Users findByUsername(String phone) {
        return null;
    }

    @Override
    public List<Users> list() {
        return null;
    }

    @Override
    public Users login(String phone, String password) {
        return null;
    }
}
