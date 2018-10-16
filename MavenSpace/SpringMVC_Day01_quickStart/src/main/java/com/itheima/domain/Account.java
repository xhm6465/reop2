package com.itheima.domain;

public class Account {
    private String aname;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aname='" + aname + '\'' +
                '}';
    }
}
