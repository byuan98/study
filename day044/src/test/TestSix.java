package test;

public class TestSix {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();// 3������ʵ�������
        Thread t = new Thread(my);// 4�������̶߳��󣬲�ͨ�����췽����������ʵ�������
        t.start();// 5�������߳�
    }
}

class MyRunnable implements Runnable {// 1������Runnable��ʵ����
    public void run() {// 2��ʵ��run��������װ�߳�����
        System.out.println("ʵ�ֵ�run�����ѱ�ִ��");
    }
}