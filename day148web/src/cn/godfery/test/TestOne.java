package cn.godfery.test;

public class TestOne {
//    创建线程方式一：
//    1、新建一个类继承Thread类
//    2、重新run方法
//    3、实例化新建类
//    4、使用start启动线程
    public static void main(String[] args) {
        ThreadTestOne threadTestOne=new ThreadTestOne();
        threadTestOne.start();
    }

}

class ThreadTestOne extends Thread{
    public void run() {
        for(int count=0; count<10; count++) {
            System.out.println("count="+count);
        }
    }
}
