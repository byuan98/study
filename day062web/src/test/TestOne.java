package test;

import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Student1;

public class TestOne {

    public static void main(String[] args) {   
        ArrayList<Student1> list=new ArrayList<Student1>();
        for(int number=0;number<50;number++) {
            String stuname=""+(char)(Math.random()*26+'A')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a');
            Double stuscore=(int)(Math.random()*1000)/10.0;
            list.add(new Student1(stuname, stuscore));
        }
        addList(list);
        
    }
    
    public static void addList(ArrayList<Student1> list) {
        Connection con=null;
        PreparedStatement pre=null;
        String sql="insert into student(stuname, stuscore) values(?, ?)";
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            for(Student1 stu:list) {
                pre.setString(1,stu.getStuName());
                pre.setDouble(2, stu.getStuScore());
                pre.addBatch();
            }
            pre.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, null);
        }
    }
}
