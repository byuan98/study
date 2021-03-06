package dao;

import java.util.ArrayList;

import entity.Student;

public interface StudentDaoInter {
//    查询所有学生
    public ArrayList<Student> getAllStudent();
    
//    查询所有学生并进行分页，传入两个参数，startIndex起始位置，pageSize每页的显示数量
    public ArrayList<Student> getAllStudentPaging(Integer startIndex, Integer pageSize);

    
    public Integer getStudentCount();
}
