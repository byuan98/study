package entity;

import java.io.Serializable;

public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private String spwd;
    
    public Student() {
        
    }
    public Student(String sname, String spwd) {
        super();
        this.sname = sname;
        this.spwd = spwd;
    }
    public Student(Integer sid, String sname, String spwd) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
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
    public String getSpwd() {
        return spwd;
    }
    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }   
}
