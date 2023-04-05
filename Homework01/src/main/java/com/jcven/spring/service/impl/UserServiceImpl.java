package com.jcven.spring.service.impl;

import com.jcven.spring.dao.UserDao;
import com.jcven.spring.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}