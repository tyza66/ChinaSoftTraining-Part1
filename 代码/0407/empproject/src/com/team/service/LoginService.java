package com.team.service;

import sun.security.util.Password;
import java.util.ArrayList;

public class LoginService {
    private ArrayList<String[]> users = new ArrayList<>();
    private String[] currentUser;

    //实现注册功能
    public void register(String userName, String password) {
        String[] user = {userName, password};
        users.add(user);
    }

    //实现登录功能
    public boolean login(String userName, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i)[0].equals(userName) && users.get(i)[1].equals(password)) {
                currentUser = users.get(i);
                return true;
            }
        }
        return false;
    }

    //实现修改用户名功能
    public boolean modifyUserName(String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (currentUser == users.get(i)) {
                users.get(i)[0] = userName;
                return true;
            }
        }
        return false;
    }

    //实现修改密码功能
    public boolean modifyPassword(String password) {
        for (int i = 0; i < users.size(); i++) {
            if (currentUser == users.get(i)) {
                users.get(i)[1] = password;
                return true;
            }
        }
        return false;
    }
}
