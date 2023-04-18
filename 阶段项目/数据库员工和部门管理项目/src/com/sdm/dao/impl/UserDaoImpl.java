package com.sdm.dao.impl;

import com.sdm.dao.UserDao;
import com.sdm.pojo.User;
import com.sdm.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: tyza66
 * Date: 2023/04/18 10:05
 * Github: https://github.com/tyza66
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserByUserName(String userName) {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT * FROM user where username = ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("username"));
                user.setPassWord(rs.getString("password"));
                return user;
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public int updatePassWordByUserName(String userName,String passWord) {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE user SET password =? WHERE username =?";
        try {
            assert conn!= null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, passWord);
            ps.setString(2, userName);
            return ps.executeUpdate();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
