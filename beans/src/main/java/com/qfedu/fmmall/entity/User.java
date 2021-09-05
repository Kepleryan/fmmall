package com.qfedu.fmmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户信息", description = "用户/买家信息")
public class User {

    @ApiModelProperty(dataType = "int", required = false)
    private int userId;

    @ApiModelProperty(dataType = "String", required = true, value = "用户注册账号")
    private String userName;

    @ApiModelProperty(dataType = "String", required = true, value = "用户注册密码")
    private String userPwd;

    @ApiModelProperty(dataType = "String", required = true, value = "用户真实姓名")
    private String userRealname;

    @ApiModelProperty(dataType = "String", required = true, value = "用户头像url")
    private String userImg;


}
