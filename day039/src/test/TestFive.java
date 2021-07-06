package test;

import java.util.*;

public class TestFive {
//  自定义异常练习
//	自定义异常的步骤：
//	1、创建一个继承了异常体系的类（继承了异常体系才能被称之为异常类）;
//	2、提供一个有参数的构造方法，并通过调用super(message)来传递异常原因;
//	3、在方法中通过throw来产生一个自定义异常情况;
//	4、对异常情况进行处理;
    public static void main(String[] args) {
        System.out.println("请输入您的年龄:");
//		AgeException a=new AgeException();//这里直接创建了一个异常对象,但创建异常对象并不意味着发生了异常
        int age;
//		4、对异常情况进行处理
        try {
            age = new Scanner(System.in).nextInt();
            if (age < 0) {
//				throw 异常对象  表示程序出现了异常情况
                throw new AgeException("输入的年龄小于0请核对后再次输入");// 3、通过throw产生一个自定义类型的异常情况
            } else if (age > 150) {
                throw new AgeException("输入的年龄大于150请核对后再次输入");
            }
        } catch (AgeException e) {
            System.out.println("e.toString():-->" + e.toString());// 返回此 throwable 的简短描述
//			e.toString():-->test.AgeException: 输入的年龄小于0请核对后再次输入
            System.out.println("e.getMessage():-->" + e.getMessage());// 返回此 throwable 的详细消息字符串
//			e.getMessage():-->输入的年龄小于0请核对后再次输入		
            System.out.println("e.getStackTrace():-->" + e.getStackTrace());
//			e.getStackTrace():-->[Ljava.lang.StackTraceElement;@15aeb7ab
            e.printStackTrace();
//		    test.AgeException: 输入的年龄小于0请核对后再次输入
//			at test.TestFive.main(TestFive.java:21)
            System.out.println("age已设置为默认值:1");
            age = 1;
        }
        System.out.println("age=" + age);
    }
}

//1、创建一个继承自异常体系中的异常类
class AgeException extends Throwable {
    public AgeException() {

    }

    // 2、通过构造方法的参数列表指定异常原因
    AgeException(String message) {
        // 通过调用父类有参数的构造方法来传递异常原因
        super(message);
    }
}