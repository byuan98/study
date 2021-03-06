package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//注解方式的action类不需要实现任何接口
@Controller //为当前类创建bean bean为控制层
@RequestMapping("/test2") //为当前类中的所有方法定义一个虚拟目录
public class TestTwo {
//    一个action类中可以有多个方法,每个方法接受一种请求;方法声明:public String xxx(Model model){}

//    默认情况下action可以接受get和post请求
    @RequestMapping("/methodOne.action") //为当前方法定义url;完整路径:/test/methodone.action
    public String methodOne(Model model) {//参数Model是request域对象
        model.addAttribute("aa", "aa_value_getAndPost");
        System.out.println("public String methodOne(Model model)");
        return "/jsps/index2";
    }
    
//    只能接受get请求
    @RequestMapping(value="/methodTwo.action",method={RequestMethod.GET})
    public String methodTwo(Model model) {
        model.addAttribute("aa", "aa_value_get");
        System.out.println("public String methodTwo(Model model)");
        return "/jsps/index2";
    }
    
//    只能接受post请求
    @RequestMapping(value="/methodThree.action",method={RequestMethod.POST})
    public String methodThree(Model model) {
        model.addAttribute("aa", "aa_value_post");
        System.out.println("public String methodThree(Model model)");
        return "/jsps/index2";
    }
    
    @RequestMapping(value="/methodFour.action",method={RequestMethod.GET,RequestMethod.POST})
    public String methodFour(Model model) {
        model.addAttribute("aa", "aa_value_postAndGet");
        return "/jsps/index2";
    }
    
}
