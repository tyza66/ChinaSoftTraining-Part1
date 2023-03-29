package com.team.service.log;

import com.team.domain.pojo.user.User;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:28
 * Github: https://github.com/tyza66
 */
public class UserManagement {
    ArrayList<User> users = new ArrayList<>();

    public UserManagement() {
        //初始化一个具有高级权限的账户admin
        User u1 = new User("admin", "admin", 1);
        users.add(u1);
    }

    //添加
    public void add(String id, String pwd) {
        User newUser = new User(id, pwd, 1);
        users.add(newUser);
    }

    //检查
    public boolean check(String id, String pwd) {
        for (User one : users) {
            if (one.getId().equals(id) && one.getPassword().equals(pwd)) {
                return true;
            }
        }
        return false;
    }
}
