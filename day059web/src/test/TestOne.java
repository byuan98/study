package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestOne {

    public static void main(String[] args) throws Exception {
        //1����������jar
        //2��׼���Ĵ����
        String className="com.mysql.jdbc.Driver";//��������
        String user="root";//�˺�
        String pwd="root";//����
        String url="jdbc:mysql://192.168.217.19:3306/study";//MySQL��������ַ
        //3��ע������
        Class.forName(className);
        //4����ȡ����
        Connection con=DriverManager.getConnection(url,user,pwd);//�쳣:SQLException
        System.out.println(con);
//        //5��׼��SQL���
//        //String sql="insert into student values(2021001,'Godfery')";
//        String sql="create database study charset='utf8'";
//        //6����ȡstatement����
//        Statement sta=con.createStatement();
//        //7��ͨ��statement������SQL�������ݿ�
//        int hang=sta.executeUpdate(sql);//Update:Ӱ������
//        System.out.println("����"+hang+"�гɹ�");
//        //8����������
//        //9���ر������ͷ���Դ
//        sta.close();//˭���ȡ���ȹ�
        con.close();
    }
}
