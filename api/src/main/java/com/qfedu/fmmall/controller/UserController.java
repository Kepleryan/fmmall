package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.entity.User;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/user")
@Api(value = "提供用户的登录和注册接口",tags = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username",value = "用户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password",value = "用户登录密码",required = false,defaultValue = "111111")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password",defaultValue = "111111") String pwd){
        return userService.checkLogin(name,pwd);
    }

    @ApiOperation("用户注册接口")
//    @ApiImplicitParam(name = "username",value = "用户登录账号",required = true)
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public ResultVO regist(User user){
        System.out.println("regist");
        return new ResultVO(10000,"success",null);
    }
}
