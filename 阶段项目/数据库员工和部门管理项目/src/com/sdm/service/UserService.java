package com.sdm.service;

import com.sdm.dao.UserDao;
import com.sdm.dao.impl.UserDaoImpl;
import com.sdm.pojo.User;

/**
 * Author: tyza66
 * Date: 2023/04/18 10:17
 * Github: https://github.com/tyza66
 */
public class UserService {
    public UserDao ud= new UserDaoImpl();
    public boolean checkUser(String userName, String passWord) {
        User user = ud.getUserByUserName(userName);
        if(user == null) return false;
        if(user.getPassWord().equals(passWord)){
            return true;
        }
        return false;
    }

    public void addUser(User user) {
        ud.insertUser(user);
    }

    public void changePassword(String user,String pass){
        ud.updatePassWordByUserName(user, pass);
    }
}
