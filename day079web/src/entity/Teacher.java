package entity;

import java.io.Serializable;

public class Teacher implements Serializable{
    private Integer tid;
    private String tname;

    public Teacher() {
        
    }
    public Teacher(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }
    
    public Integer getTid() {
        return tid;
    }
    public void setTid(Integer tid) {
        this.tid=tid;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname=tname;
    }
    public String toString() {
        return "tid="+this.tid+",tname="+this.tname;
    }
}
