package com.friends.itour.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Teacher {
    @Id
    private  Integer id;
    @Column(name="username")
    private  String userName;
    @Column(name="password")
    private  String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
