package com.godfery.text;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.godfery.entity.Student;
import com.godfery.util.HibernateSessionFactroy;

public class HibernateText {
    public static void main(String[] args) {
        Session session=new HibernateSessionFactroy().getSession();//获取Session对象,对应jdbc连接
        Transaction transaction=session.beginTransaction();//获取事务,只有dml才有事务

        transaction.begin();//开启事务
        
        Student stu=new Student();
        stu.setStuname("Pfjodch");
        stu.setStuscore(93.6);
        session.save(stu);
//        Hibernate: select max(stuid) from student
//        Hibernate: insert into student (stuname, stuscore, stuid) values (?, ?, ?)
//        这里Hibernate发送了两条语句,第一条确定主键的最大值,这里的主键值是来自Hibernate的
        
        transaction.commit();//提交事务
        session.close();
    }
}
