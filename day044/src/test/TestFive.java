package test;

public class TestFive {

    public static void main(String[] args) {
        MyThread my = new MyThread();// 3、创建自定义线程对象
        my.start();// 4、调用线程对象的start方法，启动线程
    }
}

class MyThread extends Thread {// 1、创建类继承Thread类
    public void run() {// 2、重写run方法
        System.out.println("重写的run方法已被执行");
    }
}