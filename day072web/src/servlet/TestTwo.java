package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import entity.Teacher;

@WebServlet("/test/json")
public class TestTwo extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        
        Integer sid=new Integer(req.getParameter("sid"));
        Student stu=new Student(sid, "Godfery", new Double[]{98.5, 85.6, 95.3}, new Teacher(1001, "Echo"));
//        把学生的信息转换成JSON格式的字符串
        String message="{\"sid\":"+stu.getSid()+",\"sname\":\""+stu.getSname()+"\",\"sscore\":"+Arrays.toString(stu.getSscore())+",\"teacher\":{\"tid\":"+stu.getTeacher().getTid()+",\"tname\":\""+stu.getTeacher().getTname()+"\"}}";
        System.out.println(message);
        resp.getWriter().print(message);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    
    public static void main(String[] args) {
        Student stu=new Student(1, "Godfery", new Double[]{98.5, 85.6, 95.3}, new Teacher(1001, "Echo"));
//        把学生的信息转换成JSON格式的字符串
        String message="{\"sid\":"+stu.getSid()+",\"sname\":"+stu.getSname()+",\"sscore\":"+Arrays.toString(stu.getSscore())+",\"teacher\":{\"tid\":"+stu.getTeacher().getTid()+",\"tname\":"+stu.getTeacher().getTname()+"}}";
     System.out.println(message);
    }
}
