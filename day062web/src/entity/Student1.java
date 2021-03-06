package entity;

import java.io.Serializable;

public class Student1 implements Serializable{
    private Integer stuId;
    private String stuName;
    private Double stuScore;
    
    public Student1() {
        
    }
    public Student1(String stuName, Double stuScore) {
        this.stuName=stuName;
        this.stuScore=stuScore;
    }
    public Student1(Integer stuId, String stuName, Double stuScore) {
        this.stuId=stuId;
        this.stuName=stuName;
        this.stuScore=stuScore;
    }
    
    public Integer getStuId() {
        return stuId;
    }
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public Double getStuScore() {
        return stuScore;
    }
    public void setStuScore(Double stuScore) {
        this.stuScore = stuScore;
    }
    
    public String toString() {
        return "stuId="+this.stuId+",stuName="+this.stuName+",stuScore="+this.stuScore;
    }
}
