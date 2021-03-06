package entity;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//创建bean的注解
//@Controller //为控制层的类创建bean
//@Service //为业务层的类创建bean
//@Repository //为持久层的类创建bean
@Component("teacher") //不确定为那一层的类创建bean,参数值为bean的名字
//@Component() //如果不指定名字则默认名为类名首字母小写(teacher)
@Scope("singleton") //设置作用域
@Lazy //设置懒加载,只有在调用getBean方法时才创建对象
public class Teacher implements Serializable{
    @Value("10001")
    private Integer teaid;
    @Value("Echo")
    private String teaname;
    
//    @Resource(name="test")//通过name属性来指定test关联的Test对象
//    @Autowired //类似于autowire="byType",寻找相同类型的bean
//               如果只有一个则直接装配,如果有多个找与属性同名的装配
    private Test test;
    
    {
        System.out.println("构造代码块");
    }
    
    public Teacher() {

    }
    public Teacher(Integer teaid, String teaname) {
        this.teaid = teaid;
        this.teaname = teaname;
    }
    public Integer getTeaid() {
        return teaid;
    }
    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }
    public String getTeaname() {
        return teaname;
    }
    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public String toString() {
        return "Teacher [teaid=" + teaid + ", teaname=" + teaname + "]";
    }
    
    @PostConstruct //指定初始化方法
    public void initMethon() {
        System.out.println("初始化工作+++++initMethon()");
    }
    @PreDestroy //指定销毁方法
    public void destroyMethod() {
        System.out.println("销毁工作-----destroyMethod()");
    }
}
