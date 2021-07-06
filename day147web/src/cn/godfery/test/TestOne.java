package cn.godfery.test;

public class TestOne {
//    创建线程方式一：
//    1、创建类继承Thread类
//    2、重写run方法
//    3、创建实现类
//    4、调用start启动线程
    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        threadTest.start();

    }
}

class ThreadTest extends Thread{
    public void run() {
        for(int count=0;count<10;count++) {
            System.out.println("count="+count);
        }
    }
}
