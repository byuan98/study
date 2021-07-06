package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestOne implements Controller{

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        req.setCharacterEncoding("utf-8");//设置请求编码集
        
        String stuname=req.getParameter("stuname");//接受请求参数
        Integer stuage=new Integer(req.getParameter("stuage"));
        System.out.println("stuname="+stuname+"::stuage="+stuage);
        
        ModelAndView mav=new ModelAndView();
        req.setAttribute("aa", "aa_value");//设置request域属性
        mav.addObject("bb", "bb_value");//设置request域属性
        mav.setViewName("/jsps/success.jsp");//设置请求转发的资源的路径
        
        return mav;
    }

}
