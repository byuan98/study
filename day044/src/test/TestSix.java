package test;

public class TestSix {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();// 3、创建实现类对象
        Thread t = new Thread(my);// 4、创建线程对象，并通过构造方法参数关联实现类对象
        t.start();// 5、启动线程
    }
}

class MyRunnable implements Runnable {// 1、创建Runnable的实现类
    public void run() {// 2、实现run方法（封装线程任务）
        System.out.println("实现的run方法已被执行");
    }
}
