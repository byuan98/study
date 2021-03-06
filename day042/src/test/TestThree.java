package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestThree {
//    常见异常测试
    public static void main(String[] args) {
//        NumberFormatExceptionTest();
//        NullPointExceptionTest();
//        concurrentModificationExceptionTest();
//        indexOutOfBoundsExceptionTest();
//        arithmeticExceptionTest();
        parseExceptionTest();

    }

    private static void numberFormatExceptionTest() {// NumberFormatException异常
//        数字格式异常
//        当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常
//        异常复现：
        String str = "123a";
        Integer i = Integer.valueOf(str);
    }

    private static void nullPointExceptionTest() {// NullPointException异常
//        空指针异常
//        当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括： 
//            调用 null 对象的实例方法； 
//            访问或修改 null 对象的字段； 
//            将 null 作为一个数组，获得其长度； 
//            将 null 作为一个数组，访问或修改其时间片；
//            将 null 作为 Throwable 值抛出；
//        异常复现：
        ArrayList al = new ArrayList();
        al.addAll(null);

    }

    private static void concurrentModificationExceptionTest() {// ConcurrentModificationException异常
//        同时发生的改变异常
//        当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常
//        异常复现：
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(3);
        al.add(5);
        for (Object obj : al) {
            al.remove(obj);
        }
    }

    private static void indexOutOfBoundsExceptionTest() {// IndexOutOfBoundsException异常
//        索引越界异常
//        指示某排序索引超出范围时抛出
        ArrayList al = new ArrayList();
        System.out.println(al.get(1));
    }

    private static void arithmeticExceptionTest() {// ArithmeticException异常
//        算术异常
//        当出现异常的运算条件时，抛出此异常
//        异常复现
        System.out.println(1 / 0);

    }

    private static void parseExceptionTest() {// ParseException异常
//        解析异常
//        解析时出现意外错误
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2021";
        try {
            Date date = sdf.parse(str);
            System.out.println(date.toLocaleString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
