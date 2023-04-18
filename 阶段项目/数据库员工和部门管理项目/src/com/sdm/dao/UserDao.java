package com.sdm.dao;

import com.sdm.pojo.User;

public interface UserDao {
    //通过用户名获得用户信息
    public User getUserByUserName(String userName);
    //通过用户名修改用户密码
    public int updatePassWordByUserName(String userName,String passWord);
    //插入一个新的账户
    public int insertUser(User user);
}
