package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.UserDAO;
import com.qfedu.fmmall.entity.User;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public ResultVO checkLogin(String name, String pwd) {
        // 1.根据账号查询用户信息
        User user = userDAO.queryUserByName(name);

        // 2.判断
        if (user == null) {
            // 用户名不存在
            return new ResultVO(10001, "用户名不存在", null);
        } else {
            // 3.对输入的密码pwd进行加密
            // 使用加密后的密码，和user中发密码进行匹配
            if (user.getUserPwd().equals(pwd)) {
                // 验证成功
                return new ResultVO(10000, "登录成功", user);
            } else {
                // 密码错误
                return new ResultVO(10001, "密码错误", null);
            }
        }
    }
}
