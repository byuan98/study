package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Student;
import util.JdbcUtil;

public class StudentDao implements StudentDaoInter{
    public ArrayList<Student> getAllStudent() {
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet set=null;
        String sql="select * from student";
        ArrayList<Student> allStudent=new ArrayList<Student>();
        
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            set=pre.executeQuery();
            
            while(set.next()) {
                Integer stuid=set.getInt("stuid");
                String stuname=set.getString("stuname");
                Double stuscore=set.getDouble("stuscore");
                allStudent.add(new Student(stuid, stuname, stuscore));
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, set);
        }
        return allStudent; 
    }


    public ArrayList<Student> getAllStudentPaging(Integer startIndex, Integer pageSize) {
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet set=null;
        String sql="select * from student limit ?,?";
        ArrayList<Student> partStudent=new ArrayList<Student>();
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setInt(1, startIndex);//startIndex起始位置
            pre.setInt(2, pageSize);//pageSize每页显示的总数
            set=pre.executeQuery();
            while(set.next()) {
                Integer stuid=set.getInt("stuid");
                String stuname=set.getString("stuname");
                Double stuscore=set.getDouble("stuscore");
                partStudent.add(new Student(stuid, stuname, stuscore));
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, set);
        }
        return partStudent;
    }


    public Integer getStudentCount() {
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet set=null;
        String sql="select count(*) count from student";
        Integer count=0;
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            set=pre.executeQuery();
            if(set.next()) {
                count=set.getInt("count");
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, set);
        }
        return count;
    }
}
