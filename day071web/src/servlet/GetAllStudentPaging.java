package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PagingBean;
import dao.StudentDao;
import entity.Student;

@WebServlet("/test/getallstudentpaging")
public class GetAllStudentPaging extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNumber; 
        Integer pageSize=10;//每页记录的数量
        try {
            pageNumber=new Integer(req.getParameter("pageNumber"));
        }catch(NumberFormatException e) {//如果获取不到数字
            pageNumber=1;
        }
        StudentDao studao=new StudentDao();
        Integer count=studao.getStudentCount();//获取总记录数
        PagingBean<Student> paging=new PagingBean<Student>();
        paging.setCount(count);
        paging.setPageSize(pageSize);
        paging.setPageNumber(pageNumber);
        
        List<Student> partStudent=studao.getAllStudentPaging(paging.getStartIndex(), paging.getPageSize());
        
        paging.setList(partStudent);
        
        req.setAttribute("paging", paging);
        req.getRequestDispatcher("/jsp/pagingoptimization.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }   
}
