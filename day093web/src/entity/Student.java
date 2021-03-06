package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student implements StudentInter{
    @Value("2021001")
    private Integer stuid;
    @Value("Godfery")
    private String stuname;

    
    public Student() {
        
    }
    public Student(Integer stuid, String stuname) {
        this.stuid = stuid;
        this.stuname = stuname;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public void study() {
        System.out.println(this.stuname+"正在学习");
    }

    public Double add(Double number1, Double number2) {
        System.out.println(this.stuname+"正在计算"+number1+"/"+number2);
        System.out.println(number1+"/"+number2+"="+number1/number2);
        return number1/number2;
    }

    public void sleep() {
        System.out.println(this.stuname+"正在睡觉");
    }

}
