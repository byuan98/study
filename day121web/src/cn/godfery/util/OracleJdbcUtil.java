package cn.godfery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJdbcUtil {
    private static final String DRIVER_NAME;
    private static final String URL;
    private static final String USER_NAME;
    private static final String PASSWORD;
    
    static {
        DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
        URL="jdbc:oracle:thin:@192.168.133.139:1521/orcl";
        USER_NAME="scott";
        PASSWORD="root";
        
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void close(Connection con, ResultSet set, Statement sta) {
        try {
            if(con!=null) {con.close();}
            
            if(set!=null) {set.close();}
            
            if(sta!=null) {sta.close();}
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
