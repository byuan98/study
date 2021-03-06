package servlet;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Student;
import util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/student/all")
public class ServletStudentAll extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//设置请求参数编码集
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet set=null;
        ArrayList<Student> list=new ArrayList<>();
        String sql="select * from student";
        
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            set=pre.executeQuery();
            while(set.next()) {
                list.add(new Student(set.getInt("stuid"), set.getString("stuname"), set.getDouble("stuscore")));
                
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, set);
        }
        
        //响应一个html
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Writer out=resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<title>所有学生信息</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<table>");
        out.write("<tr><th>学生编号</th><th>学生姓名</th><th>学生分数</th></tr>");
        for(Student stu:list) {
            out.write("<tr>");
            out.write("<td>"+stu.getStuid()+"</td>");
            out.write("<td>"+stu.getStuname()+"</td>");
            out.write("<td>"+stu.getStuscore()+"</td>");
            out.write("</tr>");
        }
        out.write("</table>");
        out.write("<a href='http://www.baidu.com'></a>");
        out.write("</body>");
        out.write("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}