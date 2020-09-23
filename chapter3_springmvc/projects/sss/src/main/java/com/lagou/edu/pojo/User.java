package com.lagou.edu.pojo;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 23:17
 *
 * @author liuku
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3451018253989325484L;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
