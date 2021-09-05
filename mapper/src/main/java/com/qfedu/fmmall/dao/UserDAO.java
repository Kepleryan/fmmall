package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.User;

public interface UserDAO {

    public User queryUserByName(String name);
}
