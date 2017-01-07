package com.renyi.user.module;

/**
 * Created by chenrenyi on 2017/1/4.
 */
public class User {
    private String username;
    private long id;

    public User(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
