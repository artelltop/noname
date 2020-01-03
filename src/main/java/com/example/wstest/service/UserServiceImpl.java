package com.example.wstest.service;

import com.example.wstest.dao.UsersRepository;
import com.example.wstest.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void add(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void delete(int uid) {
        usersRepository.deleteById(uid);
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
        return usersRepository.findAll();
    }

    @Override
    public Users login(String phone, String password) {
        Users users = new Users();
        users = usersRepository.findByPhone(phone);
        if (users != null){
            if (users.getPassword().equals(password)){
                return users;
            }
        }else {
            return users = null;
        }
        return null;
    }
}
