//package entity;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//public class Student {
//    private static Integer idPool=2021001;
//    private Integer stuid=idPool;
//    private String stuname;
//    private String stusex;
//    private Double stuscore;
//
//    public Student() {
//        idPool++;
//    }
//
//    public Student(String stuname, String stusex, Double stuscore) {
//        idPool++;
//    }
//
//
//    public Integer getStuid() {
//        return stuid;
//    }
//    public String getStuname() {
//        return stuname;
//    }
//    public void setStuname(String stuname) {
//        this.stuname = stuname;
//    }
//    public String getStusex() {
//        return stusex;
//    }
//    public void setStusex(String stusex) {
//        this.stusex = stusex;
//    }
//    public Double getStuscore() {
//        return stuscore;
//    }
//    public void setStuscore(Double stuscore) {
//        this.stuscore = stuscore;
//    }
//
//    @Override
//    public String toString() {
//        // TODO Auto-generated method stub
//        return super.toString();
//    }
//
//    
//
//
//
//
//    //    1、为类添加的注解
//    @Target({ElementType.TYPE})
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface MyClassAnnotaion{
//        String className();//定义属性
//    }
////    2、给属性添加的注解
//    @Target({ElementType.FIELD})
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface MyFieldAnnotaion{
//        String fieldName();//定义属性
//    }
////    3、给方法添加的注解
//    @Target({ElementType.METHOD})
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface MyMethodAnnotaion{
//        String fieldValue();//定义属性
//        Class fieldClass();//定义属性
//    }  
//}
