package entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    private Integer stuid;
    private String stuname;
    private Double stuscore;
    private Date stubirthday;
    
    public Student() {

    }
    public Student(String stuname, Double stuscore, Date stubirthday) {
        this.stuname = stuname;
        this.stuscore = stuscore;
        this.stubirthday = stubirthday;
    }
    public Student(Integer stuid, String stuname, Double stuscore, Date stubirthday) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuscore = stuscore;
        this.stubirthday = stubirthday;
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
    public Date getStubirthday() {
        return stubirthday;
    }
    public void setStubirthday(Date stubirthday) {
        this.stubirthday = stubirthday;
    }

    public String toString() {
        return "stuid="+this.stuid+",stuname="+this.stuname+",stuscore="+this.stuscore+",stubirthday="+this.stubirthday;
    }

}
