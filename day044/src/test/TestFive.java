package test;

public class TestFive {

    public static void main(String[] args) {
        MyThread my = new MyThread();// 3�������Զ����̶߳���
        my.start();// 4�������̶߳����start�����������߳�
    }
}

class MyThread extends Thread {// 1��������̳�Thread��
    public void run() {// 2����дrun����
        System.out.println("��д��run�����ѱ�ִ��");
    }
}