package com.team.domain.pojo.user;
/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:28
 * Github: https://github.com/tyza66
 */
public class User {
    String id;
    String password;
    int permission;//0是普通用户 1是高级用户

    public User() {
    }

    public User(String id, String password, int permission) {
        this.id = id;
        this.password = password;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}
