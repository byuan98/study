package cn.godfery.test;

public class TestOne {
//    Lambda表达式案例一：定义两个线程打印0-500
    public static void main(String[] args) throws InterruptedException{
        new Thread(()->{
            for (int count=0; count <= 500; count++) {
                System.out.println("count："+count);
                try {
                    Thread.sleep(1);
//                    if (count == 250) {
//                        throw new InterruptedException();                        
//                    }
                } catch (InterruptedException e) {
//                    InterruptedException的正确处理方式
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
        new Thread(()->{
            for (int count=0; count<=500; count++) {
                System.out.println("c："+count);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}