package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
  //1、定义静态常量记录四大参数
    private static final String DRIVER_NAME;
    private static final String USER;
    private static final String PASSWORD;
    private static final String URL;
    
   static{
        DRIVER_NAME="com.mysql.jdbc.Driver";
        USER="root";
        PASSWORD="root";
        URL="jdbc:mysql://192.168.217.19:3306/study";
        
        //注册驱动:一个项目注册驱动只需要一次
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }    
    }
    
    //写一个方法获取连接
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //写一个方法关闭连接
    public static void close(Connection con,Statement sta,ResultSet set) {
        try {
            if(con!=null) {
                con.close();
            }
            if(sta!=null) {
                sta.close();
            }
            if(set!=null) {
                set.close();
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Connection con=JdbcUtil.getConnection();
        System.out.println(con);
        close(con,null,null); 
    }
}
