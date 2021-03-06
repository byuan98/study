package com.godfery.entity;

import java.io.Serializable;

public class Student implements Serializable{
    private Integer stuid;
    private String stuname;
    private Double stuscore;
    
    public Student() {
        
    }
    public Student(Integer stuid, String stuname, Double stuscore) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuscore = stuscore;
    }
    public Integer getStuid() {
        return this.stuid;
    }
    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }
    public String getStuname() {
        return this.stuname;
    }
    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    public Double getStuscore() {
        return this.stuscore;
    }
    public void setStuscore(Double stuscore) {
        this.stuscore = stuscore;
    }

    public String toString() {
        return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuscore=" + stuscore + "]";
    }
}
