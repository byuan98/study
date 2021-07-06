package code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BySQL {

    public static void main(String[] args) {
//        addStudent(new Student("Echo",80.23,new Date(1998-1900,1-1,1)));
//        deleteOneStudent(2021002);
//        updateOneStudent(new Student(2021001,"Godfery",100.0,new Date(1998-1900,1-1,1)));
//        getOneStudent(2021001);
        for(int asciiA=65,asciia=97;asciiA<=90 && asciia<=122;asciiA++,asciia++) {
            String str=""+(char)(asciiA)+(char)(asciia+1)+(char)(asciia+2)+"_";
//            System.out.println(str);
            getOneStudent(str);
        }
    }
    
//    ��Java�е�һ��ѧ��������ӵ����ݿ���  
    public static void addStudent(Student stu){
        Connection con=null;
        String sql="insert into student(sname, sscore, sbirthday) values(?, ?, ?)";
        PreparedStatement pre=null;
        try {
            con=JdbcUtil.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, stu.getSname());
            pre.setDouble(2, stu.getSscore());
            pre.setDate(3, new java.sql.Date(stu.getSbirthday().getTime()));
            int hang=pre.executeUpdate();
            System.out.println("����"+hang+"�гɹ�");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, null);
        }
    }
    
//    ��������sidɾ�����ݿ��е�һ��ѧ��
    public static void deleteOneStudent(int sid) {
        Connection con=null;
        PreparedStatement pre=null;
        String sql="delete from student where sid=?";
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setInt(1, sid);
            int row=pre.executeUpdate();
            System.out.println("ɾ��"+row+"�гɹ�");
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, null);
        }
    }
    
//    ����ѧ�����������ݿ����޸�һλѧ������Ϣ
    public static void updateOneStudent(Student stu) {
        Connection con=null;
        PreparedStatement pre=null;
        String sql="update student set sname=?,sscore=?,sbirthday=? where sid=?";
        
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setString(1, stu.getSname());
            pre.setDouble(2, stu.getSscore());
            pre.setDate(3, new java.sql.Date(stu.getSbirthday().getTime()));
            pre.setInt(4, stu.getSid());
            
            int row=pre.executeUpdate();
            System.out.println("�޸�"+row+"�гɹ�");
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, null);
        }
    }

//    ��������sid�鿴һ��ѧ������Ϣ
    public static void getOneStudent(String sname) {//int sid
        Connection con=null;
        PreparedStatement pre=null;
        String sql="select * from student where sname like ?";
        ResultSet set=null;
        
        try {
            con=JdbcUtil.getConnection();
            pre=con.prepareStatement(sql);
            pre.setString(1,sname);
            set=pre.executeQuery();
            
            while(set.next()) {
                Student stu=new Student(set.getInt("sid"), set.getString("sname"), set.getDouble("sscore"), set.getDate("sbirthday"));
                System.out.println(stu);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.close(con, pre, set);
        }
    }
}
