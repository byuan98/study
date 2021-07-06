package entity;

public class Student {
    public Integer stuid;//公共的学号
    protected String stuname;//受保护的姓名
    private String stusex;//私有的性别
    Double stuscore;//缺省的分数
    
//    public Student() {//公共的构造方法
//        
//    }
    protected Student(Integer stuid) {//受保护的构造方法
        this.stuid = stuid;
    }
    private Student(Integer stuid, String stuname) {//私有的构造方法
        this.stuid = stuid;
        this.stuname = stuname;
    }
    Student(Integer stuid, String stuname, String stusex) {//缺省的构造方法
        this.stuid = stuid;
        this.stuname = stuname;
        this.stusex = stusex;
    }  
}
