package com.qfedu.fmmall.entity;

import javax.persistence.*;

public class User123 {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pwd")
    private String userPwd;

    @Column(name = "user_realname")
    private String userRealname;

    @Column(name = "user_img")
    private String userImg;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_pwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * @return user_realname
     */
    public String getUserRealname() {
        return userRealname;
    }

    /**
     * @param userRealname
     */
    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    /**
     * @return user_img
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * @param userImg
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}