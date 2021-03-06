package com.godfery.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactroy {
    private static SessionFactory factory;
    private static Session session;
    
    static {
        Configuration configuration=new Configuration();//创建一个config对象
//        加载核心配置文件+读取核心配置文件中指定的所有mapper文件
//        不是指定文件名字默认为src下的hibernate.cfg.xml或者hibernate.properties
        configuration.configure();
//        configuration.configure("text/hibernate.cfg.xml")//如果不在src下的例子
        factory=configuration.buildSessionFactory();//获取factory对象
    }
    
    public static Session getSession() {
        if(session==null || !session.isOpen()) {//如果session为空或者session没有被打开
            session=factory.openSession();//打开session
        }
        return session;//返回session
    }
    
    public static void close() {
        if(session!=null || session.isOpen()) {
            session.close();//只有session不为空或者session打开时才关闭
        }
    }
}
