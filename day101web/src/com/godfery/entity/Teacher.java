package com.godfery.entity;

import java.io.Serializable;
import java.util.Set;

public class Teacher implements Serializable{
    private Integer teaid;
    private String teaname;
    private String teasubject;
    private Set<Student> stuSet;//一对多:定义集合记录学生
    
    public Teacher() {

    }
    public Teacher(Integer teaid, String teaname, String teasubject, Set<Student> stuSet) {
        this.teaid = teaid;
        this.teaname = teaname;
        this.teasubject = teasubject;
        this.stuSet = stuSet;
    }
    
    public Integer getTeaid() {
        return teaid;
    }
    public Teacher setTeaid(Integer teaid) {
        this.teaid = teaid;
        return this;
    }
    public String getTeaname() {
        return teaname;
    }
    public Teacher setTeaname(String teaname) {
        this.teaname = teaname;
        return this;
    }
    public String getTeasubject() {
        return teasubject;
    }
    public Teacher setTeasubject(String teasubject) {
        this.teasubject = teasubject;
        return this;
    }

    public Set<Student> getStuSet() {
        return stuSet;
    }
    public Teacher setStuSet(Set<Student> stuSet) {
        this.stuSet = stuSet;
        return this;
    }

    public String toString() {
        return "Teacher [teaid=" + teaid + ", teaname=" + teaname + ", teasubject=" + teasubject+ "]";
    }
}