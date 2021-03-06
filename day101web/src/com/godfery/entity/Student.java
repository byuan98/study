package com.godfery.entity;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{    
    private Integer stuid;
    private String stuname;
    private Teacher teacher;//多对一:定义引用记录老师
    
//    多对多:定义集合记录所有社团
    private Set<Community> comSet;
    
    public Student() {

    }
    public Student(Integer stuid, String stuname, Teacher teacher) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.teacher = teacher;
    }
    public Integer getStuid() {
        return stuid;
    }
    public Student setStuid(Integer stuid) {
        this.stuid = stuid;
        return this;
    }
    public String getStuname() {
        return stuname;
    }
    public Student setStuname(String stuname) {
        this.stuname = stuname;
        return this;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Student setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }
    public Set<Community> getComSet() {
        return comSet;
    }
    public void setComSet(Set<Community> comSet) {
        this.comSet = comSet;
    }
    
    public String toString() {
        return "Student [stuid=" + stuid + ", stuname=" + stuname + ", teacher=" + teacher + "]";
    }
}
