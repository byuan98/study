package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/getandpost")
public class TestOne extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        
        String name=req.getParameter("name");
        System.out.println("接收到的参数为"+name);
        
        String[] nameAll= {"abc", "def", "123", "321"};
        Boolean exist=false;
        for(String namePart:nameAll) {
            if(namePart.equals(name)) {
                resp.getWriter().print("用户名"+name+"已存在");
                return;
            }
        }
        resp.getWriter().print("用户名"+name+"可用");
    }
    
}
