package test;

import java.sql.Connection;

import code.JdbcUtil;

public class TestTwo {

    public static void main(String[] args) {
        Connection con=JdbcUtil.getConnection();
        System.out.println(con);
        JdbcUtil.close(con, null, null);
    }
}
