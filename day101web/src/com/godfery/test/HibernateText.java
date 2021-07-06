package com.godfery.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.godfery.entity.AutoTable;
import com.godfery.entity.Community;
import com.godfery.entity.Student;
import com.godfery.entity.Teacher;
import com.godfery.util.HibernateSessionFactory;

public class HibernateText {
    public static void main(String[] args) {
        Session session=HibernateSessionFactory.getSession();
        Transaction transaction=session.getTransaction();
        
        transaction.begin();//开启事务
        
        session.get(Student.class, 1);
        
        transaction.commit();//提交事务
        session.close();
        
        
    }
}
