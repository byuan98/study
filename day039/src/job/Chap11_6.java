package job;

import java.util.*;

public class Chap11_6 {

    public static void main(String[] args) {// 默认有throws MyException2
        int n;
        // 读入n
        n = new Scanner(System.in).nextInt();
        try {
            m(n);
        } catch (MyException1 ex1) {
            // 输出ex1详细的方法调用栈信息
            // System.out.println(ex1.getStackTrace());
            ex1.printStackTrace();// 输出ex1详细的方法调用栈信息
        } catch (MyException2 ex2) {
            // 输出ex2的详细信息
            System.out.println(ex2.getMessage());
            // 将ex2重新抛出
            throw ex2;
        }

    }

    public static void m(int n) throws MyException1, MyException2 { // 声明抛出MyException1,MyException2
        if (n == 1) {
            throw new MyException1("n==1");
        } else {
            throw new MyException2("n==2");
        }
    }
}

//MyException1设置为已检查异常
class MyException1 extends Exception {
    MyException1() {// 无参的构造函数

    }

    MyException1(String message) {// 带字符串参数的构造方法
        super(message);// 将参数传入父类的构造方法,产生异常的详细信息
    }
}

//MyException2设置为未检查异常
class MyException2 extends RuntimeException {
    MyException2() {// 无参的构造函数

    }

    MyException2(String message) {// 带字符串参数的构造方法
        super(message);// 将参数传入父类的构造方法,产生异常的详细信息
    }
}