package com.sdm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Author: tyza66
 * Date: 2023/06/02 14:51:59
 * Github: https://github.com/tyza66
 **/

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String[] hobby = request.getParameterValues("hobby");//获得请求的单数 返回的是一个数组
        if(hobby!= null && hobby.length != 0){
            for (String tmp:hobby){
                System.out.println(tmp);
            }
        }
        System.out.println(uname + " " + pwd + " " + hobby);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String[] hobby = request.getParameterValues("hobby");//获得请求的单数 返回的是一个数组
        if(hobby!= null && hobby.length != 0){
            for (String tmp:hobby){
                System.out.println(tmp);
            }
        }
        System.out.println(uname + " " + pwd);
    }

}
