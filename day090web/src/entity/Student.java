package entity;

import java.io.Serializable;

public class Student implements Serializable{
    private Integer stuid;
    private String stuname;
    private String stusex;
    private Double stuscore;
    
    {
        System.out.println("构造代码块");
    }
    
    
    public Student() {
        System.out.println("public Student()");
    }
    
    public Student(Integer stuid, String stuname, String stusex, Double stuscore) {
        System.out.println("public Student(Integer stuid, String stuname, String stusex, Double stuscore)");
        this.stuid = stuid;
        this.stuname = stuname;
        this.stusex = stusex;
        this.stuscore = stuscore;
    }
    public Integer getStuid() {
        System.out.println("public Integer getStuid()");
        return stuid;
    }
    public void setStuid(Integer stuid) {
        System.out.println("public void setStuid(Integer stuid)");
        this.stuid = stuid;
    }
    public String getStuname() {
        System.out.println("public String getStuname()");
        return stuname;
    }
    public void setStuname(String stuname) {
        System.out.println("public void setStuname(String stuname)");
        this.stuname = stuname;
    }
    public String getStusex() {
        System.out.println("public String getStusex()");
        return stusex;
    }

    public void setStusex(String stusex) {
        System.out.println("public void setStusex(String stusex)");
        this.stusex = stusex;
    }

    public Double getStuscore() {
        System.out.println("public Double getStuscore()");
        return stuscore;
    }
    public void setStuscore(Double stuscore) {
        System.out.println("public void setStuscore(Double stuscore)");
        this.stuscore = stuscore;
    }

    public String toString() {
        return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stusex=" + stusex + ", stuscore=" + stuscore
                + "]";
    }
    
    
}
