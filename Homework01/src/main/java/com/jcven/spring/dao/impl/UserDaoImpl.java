package com.jcven.spring.dao.impl;

import com.jcven.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("张三") && password.equals("123")) {
            return true;
        }
        return false;
    }
}