package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/text/r")
public class ServletR extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        System.out.println("r获取请求参数--->name="+name);
        Object aValue=req.getAttribute("a");
        System.out.println("r;request域属性--->"+aValue);
        
        resp.setHeader("r", "r_value");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.print("<font color='red' size=6>ServletR设置响应体成功</font><br/>");
        out.print("<font color='red' size=6>请求参数name="+name+"</font><br/>");
        out.print("<font color='red' size=6>域属性a="+aValue+"</font><br/>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
