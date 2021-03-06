package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Student;

public class TestOne {
    
    public static void main(String[] args) throws Exception {
//        1、创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//        2、通过SqlSessionFactoryBuilder对象(builder)获取核心配置文件，以此来创建SqlSessionFactory对象
        File file=new File("src/xml/mybatis_configure.xml");
        SqlSessionFactory factory=builder.build(new FileInputStream(file));
        
//        3、通过SqlSessionFactory(factory)对象获取SqlSession(类似于Jdbc中的connection)
        SqlSession session=factory.openSession(true);//参数可选,如果为true则为自动提交
        
        Student stu=session.selectOne("getOne", 1);//获取id为1的学生
        System.out.println(stu);
                
        Integer row=session.insert("addOne", new Student(null,"Ali",87.5,new Date()));//添加一个学生
        System.out.println("添加"+row+"行成功");
        
        List<Student> stuList=session.selectList("getAll");//获取所有学生
        System.out.println(stuList);
        
        row=session.update("updateOne",new Student(4,"Ali",80.0,new Date()));//修改学号为4的学生
        System.out.println("修改"+row+"行成功");
        
        row=session.delete("deleteOne",4);//删除学号为4的学生
        System.out.println("删除"+row+"行成功");
        
//        session.commit();//提交以上的DML语句的事务(只有DML才有事务),如果openSession(true)内不为true则需要加上该语句
        
//        4、关闭SqlSession(session)
        session.close(); 
    }
}
