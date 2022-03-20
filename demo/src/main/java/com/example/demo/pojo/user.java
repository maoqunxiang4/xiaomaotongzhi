package com.example.demo.pojo;

import org.apache.ibatis.type.Alias;

@Alias("u")
public class user {
    private String usernumber;
    private String pwd;
    private String work;

    public user() {
    }

    public user(String usernumber, String pwd, String work) {
        this.usernumber = usernumber;
        this.pwd = pwd;
        this.work = work;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "user{" +
                "usernumber='" + usernumber + '\'' +
                ", pwd='" + pwd + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
