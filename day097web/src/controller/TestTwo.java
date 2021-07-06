package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Student;

@Controller
@RequestMapping("/test2")
public class TestTwo {
//    响应数据是json,方法添加一个注解@ResponseBody
    @RequestMapping("/method1.action")
    @ResponseBody//把方法的对象类型的返回值 转换为json串,传递给客户端
    public Student method1(Integer stuage) {
        Student stu=new Student("Godfery",98.5);
        System.out.println(stu);
        return stu;
    }
    
//    请求参数是json串
//    注解:@RequestBaby:说明要用java对象stu接受请求参数对应的json对象
//    ajax是局部刷新,不能响应页面
//    响应一个字符串方式1:通过response拼凑一个字符串
    @RequestMapping("/method2.action")
    public void method2(@RequestBody Student stu,HttpServletResponse resp) {
        System.out.println(stu);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().print("请求参数是json接受成功!stu="+stu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
//    响应一个字符串方式2:通过ResponseBody注解响应的是字符串/json串
    @RequestMapping(value="/method3.action",produces="application/json;charset=utf-8")
    @ResponseBody //即可以返回一个字符,还可以返回一个json串
    public String method3(@RequestBody Student stu) {
        System.out.println(stu);
        return "请求参数是json接受成功!stu="+stu;
    }
    
//    请求是json响应也是json
    @RequestMapping("/method4.action")
    @ResponseBody //即可以返回一个字符串,还可以返回一个json串
    public Student method4(@RequestBody Student stu) {
        System.out.println(stu);
        Student s=new Student("Echo",97.5);
        return s;
    }
}
