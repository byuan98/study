package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Student;

//注解方式的action类不需要实现任何接口
@Controller //为当前类创建bean bean为控制层
@RequestMapping("/test3") //为当前类中的所有方法定义一个虚拟目录
public class TestThree {
//    一个action类中可以有多个方法,每个方法接受一种请求;方法声明:public String xxx(Model model){}
    
//    action方法参数类型1:Model-->request的域对象
    @RequestMapping("/methodOne.action")
    public String methodOne(Model model) {
        model.addAttribute("aa", "aa_value_methodOne");
        System.out.println("public String methodOne(Model model)");
        return "/jsps/index3";
    }
    
//    action方法参数类型2:HttpServletRequest-->请求对象
//    请求对象的作用:
//    1、获取请求参数;2、获取请求头;3、作为request域对象;4、进行请求转发与请求包含
    @RequestMapping("/methodTwo.action")
    public String methodTwo(HttpServletRequest req) {
        req.setAttribute("aa", "aa_value_request_methodTwo");
        System.out.println("public String methodTwo(HttpServletRequest req)");
        return "/jsps/index3";
    }
    
//    action方法参数类型3:HttpServletResponse-->响应对象
//    响应对象的作用:
//    1、设置响应体;2、设置响应头;3、重定向;添加cookie
    @RequestMapping("/methodThree.action")
    public String methodThree(HttpServletResponse resp) {
        System.out.println("public String methodThree(HttpServletRequest resp)");
        try {
            resp.sendRedirect("/provisional/jsps/index3.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e); 
        }
        return null;
    }
    
//    action方法参数类型4:HttpSession-->会话对象
//    会话对象的作用:
//    1、作为session域对象;2、其他功能,如(获取id、获取context、清空session)
    @RequestMapping("/methodFour.action")
    public String methodFour(HttpSession session) {
        session.setAttribute("bb", "bb_value_session_methodFour");
        System.out.println("public String methodFour(HttpSession session)");
        return "/jsps/index3";
    }
    
//    action方法参数类型5:单值参数(接受同名的请求参数)
    @RequestMapping("/methodFive.action")
    public String methodFive(Integer stuid, String stuname) {
        System.out.println("public String methodFive(Integer stuid="+stuid+", String stunname="+stuname+")");
        return "/jsps/index3";
    }
    
//    action方法参数类型6:引用数据类型参数(通过对象的属性来接受同名的请求参数)
    @RequestMapping("/methodSix.action")
    public String methodSix(Student stu) {
        System.out.println("public String methodSix(Student stu="+stu+")");
        return "/jsps/index3";
    }
}
