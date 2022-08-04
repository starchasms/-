package com.example.demo.entity;

public class User {
    private Integer userId;
    private String userName;
    private String sex;
    private int phone;
    private String email;
    private String addtime;
    private String state;
    private String administratir;
    private String  password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAdministratir() {
        return administratir;
    }

    public void setAdministratir(String administratir) {
        this.administratir = administratir;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String psssword) {
        this.password = psssword;
    }
}
