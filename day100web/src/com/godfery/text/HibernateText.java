package com.godfery.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.godfery.entity.Student;

public class HibernateText {
    public static void main(String[] args) {
        
        
        Configuration con=new Configuration();//读取hibernate.xml核心配置文件
        
        con.addClass(Student.class);//读取映射文件hbm.xml文件
        
        SessionFactory factory=con.buildSessionFactory();//获取SessionFactory对象
        
        Session session=factory.openSession();//获取Session会话(获取连接)
        
        Transaction transaction=session.beginTransaction();//获取事务对象
        
        transaction.begin();//开启事务
        
        Student stu=new Student(101,"Ysdcad",96.5);//因为配置文件中选择了assigned所以需要人为添加主键
        
        session.save(stu);//增加一个

        transaction.commit();//提交事务
        
        session.close();//关闭session
        
    }
}
