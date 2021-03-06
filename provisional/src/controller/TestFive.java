package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;

//注解方式的action类不需要实现任何接口
@Controller //为当前类创建bean bean为控制层
@RequestMapping("/test5") //为当前类中的所有方法定义一个虚拟目录
public class TestFive {
//    一个action类中可以有多个方法,每个方法接受一种请求;方法声明:public String xxx(Model model){}
    
//    方式1:使用String来接收,在方法中通过simpledateformat实现字符串与日期的转换
    @RequestMapping("/methodOne.action")
    public String methodOne(String str, Model model) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(str);
            model.addAttribute("date", date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return "/jsps/index5";
    }
    
//    方式2:页面传递的字符串格式必须是yyyy/MM/dd;SpringMVC可以直接转换为date
//    @RequestMapping("/methodTwo.action")
//    public String methodTwo(Date date, Model model) {
//        model.addAttribute("date", date);
//        return "/jsps/index5";
//    }
    
//    注意:方式2与方式3不能共存
//    方式3:设置参数解析器
    @RequestMapping("/methodThree.action")
    public String methodThree(Date date, Model model) {
        model.addAttribute("date", date);
        return "/jsps/index5";
    }
    @InitBinder
    public void setDateBinder(HttpServletRequest req,ServletRequestDataBinder bind) {
//        参数1:指定字符串转换为日期的转换格式; 参数2:是否允许为空
        CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
        bind.registerCustomEditor(Date.class, editor);
    }
}
