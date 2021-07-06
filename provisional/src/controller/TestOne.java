package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//注解方式的action类不需要实现任何接口
@Controller //为当前类创建bean bean为控制层
@RequestMapping("/test1") //为当前类中的所有方法定义一个虚拟目录
public class TestOne {
//    一个action类中可以有多个方法,每个方法接受一种请求
//    方法声明:public String xxx(Model model){}
    @RequestMapping("/methodone.action") //为当前方法定义url;完整路径:/test/methodone.action
    public String methodOne(Model model) {
        model.addAttribute("aa","aa_value_one");
        System.out.println("public String methodOne(Model model)");
        return "/jsps/index";
    }
}
