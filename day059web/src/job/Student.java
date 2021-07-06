package job;

import java.io.Serializable;
import java.util.Date;

//定义一个实现类
public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private Double sscore;
    private Date sbirthday;
    
    public Student() {
        
    }
    public Student(String sname, Double sscore, Date sbirthday) {
        this.sname=sname;
        this.sscore=sscore;
        this.sbirthday=sbirthday;
    }
    public Student(Integer sid, String sname, Double sscore, Date sbirthday) {
        this.sid=sid;
        this.sname=sname;
        this.sscore=sscore;
        this.sbirthday=sbirthday;
    }
    
    public Integer getSid() {
        return this.sid;
    }
    public void setSid(Integer sid) {
        this.sid=sid;
    }
    public String getSname() {
        return this.sname;
    }
    public void setSname(String sname) {
        this.sname=sname;
    }
    public Double getSscore() {
        return this.sscore;
    }
    public void setSscore(Double sscore) {
        this.sscore=sscore;
    }
    public Date getSbirthday() {
        return this.sbirthday;
    }
    public void setSbirthday(Date sbirthday) {
        this.sbirthday=sbirthday;
    }
    
    public String toString() {
        return "sid="+this.sid+",sname="+this.sname+",sscore="+this.sscore+"sbirthday="+this.sbirthday;
    }
    
}
