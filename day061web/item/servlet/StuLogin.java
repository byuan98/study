package servlet;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import entity.Stulogin;

public class StuLogin extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String sname=req.getParameter("sname");
        String spwd=req.getParameter("spwd");
        
        Connection con=null;
        PreparedStatement pre=null;
        Stulogin stu=null;
        ResultSet set=null;
        String sql="select * from stulogin where sname=? and spwd=?";
        try {
            con=util.JbdcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setString(1, sname);
            pre.setString(2, spwd);
            set=pre.executeQuery();
            
            if(set.next()) {
                int sid=set.getInt("sid");
                stu=new Stulogin(sid,sname,spwd);
            }
            
            
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            util.JbdcUtil.close(con, pre, set);
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        
        if(stu==null) {
            resp.getWriter().print("<font size='7px' color='red'>登陆失败</font>");
        }else {
            resp.getWriter().print("<font size='7px' color='green'>登陆成功</font>");
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    

}
