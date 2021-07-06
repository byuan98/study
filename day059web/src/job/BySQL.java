package job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class BySQL {

    public static void main(String[] args) {
//        for(int count=0;count<1000;count++) {
//            String sname=""+(char)(Math.random()*26+'A')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a');
//            Double sscore=((int)(Math.random()*1000))/10.0;
//            Date sbirthday=new Date((int)(Math.random()*10+1990),(int)(Math.random()*10+2),(int)(Math.random()*25+2)+1);
//            System.out.println(sname+"::"+sscore+":::"+sbirthday.getYear()+":::"+sbirthday.getMonth()+":::"+sbirthday.getDate());
            addOneStudent();
//        }
    }
    
//    向表中增加一个学生类
    public static void addOneStudent() {
        Connection con=null;
        String sql="insert into student(sname, sscore, sbirthday) values(?, ?, ?)";
        PreparedStatement pre=null;
        con=JdbcUtil.getConnection();
        for(int count=0;count<100000;count++) {
            String sname=""+(char)(Math.random()*26+'A')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'a');
            Double sscore=((int)(Math.random()*1000))/10.0;
            Date sbirthday=new Date((int)(Math.random()*10+1990)-1900,(int)(Math.random()*10+2),(int)(Math.random()*25+2)+1);
            System.out.println(sname+"::"+sscore+":::"+sbirthday.getYear()+":::"+sbirthday.getMonth()+":::"+sbirthday.getDate());
            Student stu=new Student(sname,sscore,sbirthday);
            try {
                pre=con.prepareStatement(sql);
                pre.setString(1, stu.getSname());
                pre.setDouble(2, stu.getSscore());
                pre.setDate(3, new java.sql.Date(stu.getSbirthday().getTime()));
                
                int row=pre.executeUpdate();
                
                System.out.println("本次共插入了"+row+"行");
            }catch(SQLException e) {
                throw new RuntimeException(e);
//        }finally {
//            JdbcUtil.close(con, pre, null);
//        }
            }
        }
    }

}
