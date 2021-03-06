package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;

//注解方式的action类不需要实现任何接口
@Controller //为当前类创建bean bean为控制层
@RequestMapping("/test4") //为当前类中的所有方法定义一个虚拟目录
public class TestFour {
//    一个action类中可以有多个方法,每个方法接受一种请求;方法声明:public String xxx(Model model){}
    
//    1、返回值类型是String-->返回的是请求转发的jsp的逻辑路径
    @RequestMapping("/methodOne.action")
    public String methodOne() {
        System.out.println("public String methodOne()");
        return "/jsps/index4";//jsp的逻辑路径
    }
    
//    2、返回值类型是ModelAndView-->设置request域属性和跳转的资源路径
    @RequestMapping("/methodTwo.action")
    public ModelAndView methodTwo() {
        System.out.println("public ModelAndView methodTwo()");
        ModelAndView mav=new ModelAndView();
        mav.addObject("aa", "aa_value_request_ModelAndView");
        mav.setViewName("/jsps/index4");//jsp的逻辑路径
        return mav;
    }
    
    
//    3、返回值是void-->不需要返回值,ajax请求时的需求不需要跳转到某个资源(原因:局部刷新)
    @RequestMapping("/methodThree.action")
    public void methodThree(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("public void methodThree(HttpServletRequest req, HttpServletResponse resp)");
        try {
            req.getRequestDispatcher("/jsps/index4.jsp").forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
