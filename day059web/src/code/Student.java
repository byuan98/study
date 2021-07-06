package code;

import java.io.Serializable;
import java.util.Date;

//创建一个实体类;实体类:在数据库中存在一张与当前类对应关系的表,这个当前类就叫做实体类
//实体类的三个必要条件:
//1、实现Serializable接口
//2、属性私有化
//3、包装类类型
public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private Double sscore;
    private Date sbirthday;
    
    public Student() {
        
    }
    public Student(String sname,Double sscore,Date sbirthday) {
        this.sname=sname;
        this.sscore=sscore;
        this.sbirthday=sbirthday;        
    }
    public Student(Integer sid,String sname,Double sscore,Date sbirthday) {
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
        return "sid="+this.sid+",sname="+this.sname+",sscore="+this.sscore+",sbirthday="+this.sbirthday;
    }
}
