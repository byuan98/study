package job;

import java.util.*;

public class CollectJob {

    public static void main(String[] args) throws Exception {
        Teacher teacher = Teacher.getTeacher();// 实例化一个老师类

        Student student1 = new Student(teacher);// 实例化五个学生类
        Student student2 = new Student(teacher);
        Student student3 = new Student(teacher);
        Student student4 = new Student(teacher);
        Student student5 = new Student(teacher);

        Thread stu1 = new Thread(student1, "赵同学");// 创建五个线程类，通过构造方法参数关联实现类对象；
        Thread stu2 = new Thread(student2, "钱同学");
        Thread stu3 = new Thread(student3, "孙同学");
        Thread stu4 = new Thread(student4, "李同学");
        Thread stu5 = new Thread(student5, "周同学");

        stu1.start();// 启动线程
        stu2.start();
        stu3.start();
        stu4.start();
        stu5.start();
    }
}

class Teacher {
    private static Teacher teacher = new Teacher();// 饿汉式实例化一个唯一的teacher类
    private List<String> jobs = new ArrayList();// 一个作业集合存放单个同学的所有的作业

    private Teacher() {// 私有化构造方法

    }

    public static Teacher getTeacher() {// 提供一个公共的方法返回已实例化的对象
        return teacher;
    }

    public void setJobs(String job) {// 定义一个方法往作业集合中存放作业
        jobs.add(job);// 往作业集合中存放作业
        System.out.println("老师收取了" + job + "作业总数：" + jobs.size());// 输出作业本名字和大小
    }
}

class Student implements Runnable {
    private static Teacher teacher;// 成员变量老师类

    Student(Teacher tercher) {// 通过构造方法给Teacher类赋值，指定学生向谁交作业
        this.teacher = tercher;
    }

    public void run() {
        for (int count = 97; count <= 100; count++) {
            String job = Thread.currentThread().getName() + "的作业" + (char) count;// 作业名字
            teacher.setJobs(job);// 循环四次，调用teacher的交作业方法
        }
    }
}