package util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BasicServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求参数
        String methodName=req.getParameter("method");
        System.out.println(methodName);
        if(methodName==null || methodName.trim().isEmpty()) {
            throw new RuntimeException("必须传递请求参数method");
        }
        
//        使用反射调用method对应的方法
        try {
            Method method=this.getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.setAccessible(true);//暴力访问
            method.invoke(this, req, resp);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
