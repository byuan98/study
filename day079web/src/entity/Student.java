package entity;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private Double[] sscore;
    private Teacher teacher;
    
    public Student() {

    }
    public Student(String sname, Teacher teacher, Double[] sscore) {
        this.sname = sname;
        this.teacher = teacher;
        this.sscore = sscore;
    }
    public Student(Integer sid, String sname, Double[] sscore, Teacher teacher) {
        this.sid = sid;
        this.sname = sname;
        this.sscore = sscore;
        this.teacher = teacher;
    }
    public Integer getSid() {
        return sid;
    }
    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public Double[] getSscore() {
        return sscore;
    }
    public void setSscore(Double[] sscore) {
        this.sscore = sscore;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return "sid="+this.sid+",sname="+this.sname+",sscore="+Arrays.toString(this.sscore)+",teacher="+this.teacher;
    }    
}