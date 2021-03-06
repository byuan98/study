package cn.godfery.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import cn.godfery.util.OracleJdbcUtil;

public class TestOne {
    public static void main(String[] args) throws SQLException {
        executeProcedure();
        
        executeFunction1();
        
        executeFunction2();
    }
    
//    通过Java调用存储过程
    public static void executeProcedure() throws SQLException {
        Connection con=OracleJdbcUtil.getConnection(); //获取连接
        String sql="{call package_java_test.pro_test(?, ?, ?)}"; //准备SQL模板
        CallableStatement call=con.prepareCall(sql); //获取CallableStatement对象
        
        call.registerOutParameter(2, Types.INTEGER); //指定out模式参数的数据的类型
        call.registerOutParameter(3, Types.INTEGER); //指定out模式参数的数据的类型
        call.setInt(1, 10); //给in模式的参数赋值
        call.setInt(3, 5); //给in模式的参数赋值
        
        call.execute(); //执行SQL语句
        
        Integer result1=call.getInt(2);
        Integer result2=call.getInt(3);
        
        System.out.println(result1+"::::::::::"+result2);
        
        OracleJdbcUtil.close(con, null, call);
    }
    
//    通过Java调用函数方式1
    public static void executeFunction1() throws SQLException {
        Connection con=OracleJdbcUtil.getConnection();
        String sql="{?= call package_java_test.fun_test(?, ?)}"; //准备SQL模板
        CallableStatement call=con.prepareCall(sql); //获取CallableStatement对象
        
        call.registerOutParameter(1, Types.INTEGER); //指定返回值类型(第一个问号)
        
        call.setInt(2, 5); //给参数赋值
        call.setInt(3, 6);
        
        call.execute(); //执行SQL语句
        Integer result=call.getInt(1); //获取结果集
        System.out.println("result="+result);
        
        OracleJdbcUtil.close(con, null, call);
    }

//    通过Java调用函数方式2
    public static void executeFunction2() throws SQLException {
        Connection con=OracleJdbcUtil.getConnection();
        String sql="select package_java_test.fun_test(?, ?) numberResult from dual";
        
        CallableStatement call=con.prepareCall(sql);
        
        call.setInt(1, 20); //给占位符赋值
        call.setInt(2, 19);
        
        ResultSet set=call.executeQuery();
        
        if(set.next()) {
            System.out.println("resule="+set.getInt("numberResult"));
        }
        
        OracleJdbcUtil.close(con, set, call);
    }
    
}
