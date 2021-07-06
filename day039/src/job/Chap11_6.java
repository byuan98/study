package job;

import java.util.*;

public class Chap11_6 {

    public static void main(String[] args) {// Ĭ����throws MyException2
        int n;
        // ����n
        n = new Scanner(System.in).nextInt();
        try {
            m(n);
        } catch (MyException1 ex1) {
            // ���ex1��ϸ�ķ�������ջ��Ϣ
            // System.out.println(ex1.getStackTrace());
            ex1.printStackTrace();// ���ex1��ϸ�ķ�������ջ��Ϣ
        } catch (MyException2 ex2) {
            // ���ex2����ϸ��Ϣ
            System.out.println(ex2.getMessage());
            // ��ex2�����׳�
            throw ex2;
        }

    }

    public static void m(int n) throws MyException1, MyException2 { // �����׳�MyException1,MyException2
        if (n == 1) {
            throw new MyException1("n==1");
        } else {
            throw new MyException2("n==2");
        }
    }
}

//MyException1����Ϊ�Ѽ���쳣
class MyException1 extends Exception {
    MyException1() {// �޲εĹ��캯��

    }

    MyException1(String message) {// ���ַ��������Ĺ��췽��
        super(message);// ���������븸��Ĺ��췽��,�����쳣����ϸ��Ϣ
    }
}

//MyException2����Ϊδ����쳣
class MyException2 extends RuntimeException {
    MyException2() {// �޲εĹ��캯��

    }

    MyException2(String message) {// ���ַ��������Ĺ��췽��
        super(message);// ���������븸��Ĺ��췽��,�����쳣����ϸ��Ϣ
    }
}