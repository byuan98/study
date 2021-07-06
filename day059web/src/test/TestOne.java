package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestOne {

    public static void main(String[] args) throws Exception {
        //1、导入驱动jar
        //2、准备四大参数
        String className="com.mysql.jdbc.Driver";//驱动类名
        String user="root";//账号
        String pwd="root";//密码
        String url="jdbc:mysql://192.168.217.19:3306/study";//MySQL服务器地址
        //3、注册驱动
        Class.forName(className);
        //4、获取连接
        Connection con=DriverManager.getConnection(url,user,pwd);//异常:SQLException
        System.out.println(con);
//        //5、准备SQL语句
//        //String sql="insert into student values(2021001,'Godfery')";
//        String sql="create database study charset='utf8'";
//        //6、获取statement对象
//        Statement sta=con.createStatement();
//        //7、通过statement对象发送SQL语句给数据库
//        int hang=sta.executeUpdate(sql);//Update:影响行数
//        System.out.println("插入"+hang+"行成功");
//        //8、处理结果集
//        //9、关闭连接释放资源
//        sta.close();//谁后获取就先关
        con.close();
    }
}
