package code;

import java.io.*;

import javax.servlet.*;

public class ServletWayOne implements Servlet{

    public void destroy() {
        System.out.println("public void destroy():用于销毁Serclet对象的方法");
    }

    public ServletConfig getServletConfig() {
        System.out.println("public ServletConfig getServletConfig():获取Servlet配置文件信息对象的方法");
        return null;
    }

    public String getServletInfo() {
        System.out.println("public String getServletInfo():获取Servlet作者及版本信息的方法");
        return null;
    }

    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("public void init(ServletConfig arg0):初始化Servlet对象的方法");
    }

    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        System.out.println("public void service(ServletRequest arg0, ServletResponse arg1):服务方法:接收请求、处理数据、给予响应");  
    }  
}
