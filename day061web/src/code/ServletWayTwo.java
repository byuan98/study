package code;

import java.io.*;
import javax.servlet.*;

public class ServletWayTwo extends GenericServlet{
    
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        System.out.println("public void service(ServletRequest arg0, ServletResponse arg1):服务方法:接收请求、处理数据、给予响应");        
    }
}
