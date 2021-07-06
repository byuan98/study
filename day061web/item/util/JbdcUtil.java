package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JbdcUtil {

    private static final String DRIVER_NAME;
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;
    
    static {
        DRIVER_NAME="com.mysql.jdbc.Driver";
        USER="root";
        PASSWORD="root";
        URL="jdbc:mysql://192.168.217.19:3306/study";
        
        try {
            Class.forName(DRIVER_NAME);
        }catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
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
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
    public static void main(String[] args) {
        Connection con=getConnection();
        System.out.println(con);
        close(con,null,null);

    }

}
