package entity;

import java.io.Serializable;

public class Student implements Serializable{
    private Integer stuid;
    private String stuname;
    private Double stuscore;
    private Teacher teacher;

    {
        System.out.println("构造代码块");
    }
    
    public Student() {
        System.out.println("public Student()");
    }
    public Student(Integer stuid, String stuname, Double stuscore, Teacher teacher) {
        System.out.println("public Student(Integer stuid, String stuname, Double stuscore, Teacher teacher)");
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuscore = stuscore;
        this.teacher = teacher;
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
    public Double getStuscore() {
        return stuscore;
    }
    public void setStuscore(Double stuscore) {
        this.stuscore = stuscore;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuscore=" + stuscore + ", teacher=" + teacher + "]";
    }
    
    public void initMethon() {
        System.out.println("初始化工作+++++initMethon()");
    }
    public void destroyMethod() {
        System.out.println("销毁工作-----destroyMethod()");
    }
}
