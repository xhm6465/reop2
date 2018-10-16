package com.itheima.domain;

import java.sql.Date;

public class User {
    private String username;
    private Date date;
    private Account account;

    public String getUsername() {
        return username;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", date=" + date +
                ", account=" + account +
                '}';
    }
}
