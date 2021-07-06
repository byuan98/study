package com.godfery.entity;

import java.io.Serializable;
import java.util.Set;

public class Community implements Serializable{
    private Integer comid;
    private String comname;
    
//    定义集合记录社团内的所有学生
    private Set<Student> stuSet;
    
    public Community() {

    }
    public Community(Integer comid, String comname) {
        this.comid = comid;
        this.comname = comname;
    }

    public Integer getComid() {
        return comid;
    }
    public void setComid(Integer comid) {
        this.comid = comid;
    }
    public String getComname() {
        return comname;
    }
    public void setComname(String comname) {
        this.comname = comname;
    }
    public Set<Student> getStuSet() {
        return stuSet;
    }
    public void setStuSet(Set<Student> stuSet) {
        this.stuSet = stuSet;
    }
    
    public String toString() {
        return "Community [comid=" + comid + ", comname=" + comname + "]";
    }   
}
