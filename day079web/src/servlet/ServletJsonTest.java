package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import entity.Teacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/json/test")
public class ServletJsonTest extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer n=new Integer(req.getParameter("n"));
        System.out.println(n);
        PrintWriter out=resp.getWriter();
        String message;
        if(n==1) {//把一个java对象转换为json格式的字符串
            Student stu=new Student(2021001,"Godfery",new Double[]{95.5,96.5,96.3},new Teacher(10001,"Echo"));
            JSONObject json=JSONObject.fromObject(stu);//获取jsonobject对象,关联java对象
            message=json.toString();//获取json格式的字符串
        }else {//把多个java对象对应的集合转换为json格式的字符串
            List<Student> stuList=new ArrayList<Student>();
            stuList.add(new Student(2021001,"Godfery",new Double[]{95.5,96.5,96.3},new Teacher(10001,"Echo")));
            stuList.add(new Student(2021002,"Tom",new Double[]{67.5,98.7,34.7},new Teacher(10002,"Ali")));
            stuList.add(new Student(2021003,"Jreey",new Double[]{75.9,64.5,86.3},new Teacher(10003,"Annie")));
            
            JSONArray jsonArray=JSONArray.fromObject(stuList);
            message=jsonArray.toString();    
        }
        out.print(message);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    } 
}
