package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.User;
import com.qfedu.fmmall.vo.ResultVO;

public interface UserService {

    public ResultVO checkLogin(String name, String pwd);
}
