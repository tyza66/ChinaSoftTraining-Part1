package com.team.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private Map<String,String> map=new HashMap<>();


    //注册
    public void register(String username,String password){
       map.put(username, password);
    }

    //登录
    public boolean login(String username,String password){
        String value = map.get(username);
        if(value!=null){

            if(value.equals(password)){
                System.out.println("登录成功");
                return true;

            }else{
                System.out.println("密码错误");
            }
        }else{
            System.out.println("用户名不存在");
        }
        return false;
    }

    //修改密码功能 参数是 用户名 和 新密码
    public boolean updatePassword(String username,String password){
        String value = map.get(username);
        if(value!=null){

            map.put(username, password);
            return true;
        }else{
            System.out.println("该用户名不存在");
        }
        return false;
    }
}
