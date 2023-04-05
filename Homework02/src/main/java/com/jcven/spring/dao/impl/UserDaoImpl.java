package com.jcven.spring.dao.impl;

import com.jcven.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("添加...");
    }

    @Override
    public void delete() {
        System.out.println("删除...");
    }

    @Override
    public void update() {
        System.out.println("更新...");
    }

    @Override
    public void select() {
        System.out.println("查询...");
    }
}
