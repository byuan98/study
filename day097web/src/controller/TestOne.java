package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Student;

@Controller
@RequestMapping("/test1")
public class TestOne {
//    1、如果action参数是单值数据来实现回显,只能把所有的请求参数装入request域中
    @RequestMapping("/method1.action")
    public String method1(Model model, String stuname, Double stuscore) {
        System.out.println("stuname="+stuname+",stuscore="+stuscore);
        if(stuname.equals("Godfery")) {
            return "/jsps/success1";
        }
        model.addAttribute("stuname", stuname);
        model.addAttribute("stuscore", stuscore);
        return "/jsps/index1";
    }
    
//    2.1、如果action参数是引用数据类型来实现回显,SpringMVC默认把请求参数设置为request域属性值,默认名为类名首字母小写
//    等价于:model.add("student",stu)
    @RequestMapping("/method2.action")
    public String method2(Student stu) {
        System.out.println(stu);
        if(stu.getStuname().equals("Godfery")) {
            return "/jsps/success1";
        }
        return "/jsps/index1";  
    }
    
//    2.2、如果action参数是引用数据类型来实现回显,若想自己设置属性名,可通过注解@ModelAttribute来设置
//    等价于model.add("s",stu)
    @RequestMapping("/method3.action")
    public String method3(@ModelAttribute("s")Student stu) {
        System.out.println(stu);
        if(stu.getStuname().equals("Godfery")) {
            return "/jsps/success1";
        }
        return "/jsps/index1"; 
    }
}
