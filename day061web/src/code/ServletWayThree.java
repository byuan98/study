package code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServletWayThree extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收Get请求");
        resp.setContentType("text/html;charset=utf-8");//设定客户端浏览器的识别编码集
        resp.setCharacterEncoding("utf-8");//用指定的编码集去覆盖request对象中的默认的编码集
        resp.getWriter().print("<font size='7px' color='green'>响应成功</font>");//在浏览器上打印输出
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收Post请求");
    }
}
