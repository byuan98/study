//package servlet;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebFilter(filterName="filterEncoding", urlPatterns="/*")
//public class EncodingFilter implements Filter{
//    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
////      将参数列表的类型向下转换为HTTP类型
//      HttpServletRequest req=(HttpServletRequest)arg0;
//      HttpServletResponse resp=(HttpServletResponse)arg1;
////      获取步骤一设置的项目的初始化参数encoding
//      String encoding=req.getServletContext().getInitParameter("encoding");
//      req.setCharacterEncoding(encoding);
//      resp.setCharacterEncoding(encoding);
//      if(!req.getServletPath().contains(".css") && !req.getServletPath().contains(".js")) {
//          resp.setContentType("text/html;charset="+encoding);          
//      }
//      
////      放行
//      arg2.doFilter(req, resp);
//  }
//}
