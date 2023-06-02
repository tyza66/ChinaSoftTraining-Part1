package com.sdm;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Author: tyza66
 * Date: 2023/06/02 13:49:37
 * Github: https://github.com/tyza66
 **/

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    //servlet是单实例多线程

    public MyServlet() {
        System.out.println("My Servlet constructor...");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        System.out.println("doget");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        System.out.println("My Servlet service...");
        //根据请求方式调用对应的方法
        String method = req.getMethod();
        //System.out.println(method);
        if("GET".equals(method)) {
            doGet(req, resp);
        } else if ("POST".equals(method)) {
            doPost(req, resp);
        }
    }

    @Override
    public void destroy() {
        System.out.println("My Servlet destroy...");
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("My Servlet init...");
    }
}
