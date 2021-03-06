package job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    private static final String DRIVER_NAME;
    private static final String USER;
    private static final String PASSWORD;
    private static final String URL;
    
    static {
        DRIVER_NAME="java.sql.Driver";
        USER="root";
        PASSWORD="root";
        URL="jdbc:mysql://192.168.217.19:3306/study";
//        URL="jdbc:mysql://192.168.133.139:3306/db_mybatis";
        
        
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }  
    }
    
//    获取数据库连接
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
//    关闭连接  
    public static void close(Connection con, Statement sta, ResultSet set) {
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
        Connection con=getConnection();
        System.out.println(con);
        close(con, null, null);
    }
}
