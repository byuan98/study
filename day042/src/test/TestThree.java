package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestThree {
//    �����쳣����
    public static void main(String[] args) {
//        NumberFormatExceptionTest();
//        NullPointExceptionTest();
//        concurrentModificationExceptionTest();
//        indexOutOfBoundsExceptionTest();
//        arithmeticExceptionTest();
        parseExceptionTest();

    }

    private static void numberFormatExceptionTest() {// NumberFormatException�쳣
//        ���ָ�ʽ�쳣
//        ��Ӧ�ó�����ͼ���ַ���ת����һ����ֵ���ͣ������ַ�������ת��Ϊ�ʵ���ʽʱ���׳����쳣
//        �쳣���֣�
        String str = "123a";
        Integer i = Integer.valueOf(str);
    }

    private static void nullPointExceptionTest() {// NullPointException�쳣
//        ��ָ���쳣
//        ��Ӧ�ó�����ͼ����Ҫ����ĵط�ʹ�� null ʱ���׳����쳣��������������� 
//            ���� null �����ʵ�������� 
//            ���ʻ��޸� null ������ֶΣ� 
//            �� null ��Ϊһ�����飬����䳤�ȣ� 
//            �� null ��Ϊһ�����飬���ʻ��޸���ʱ��Ƭ��
//            �� null ��Ϊ Throwable ֵ�׳���
//        �쳣���֣�
        ArrayList al = new ArrayList();
        al.addAll(null);

    }

    private static void concurrentModificationExceptionTest() {// ConcurrentModificationException�쳣
//        ͬʱ�����ĸı��쳣
//        ��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣
//        �쳣���֣�
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(3);
        al.add(5);
        for (Object obj : al) {
            al.remove(obj);
        }
    }

    private static void indexOutOfBoundsExceptionTest() {// IndexOutOfBoundsException�쳣
//        ����Խ���쳣
//        ָʾĳ��������������Χʱ�׳�
        ArrayList al = new ArrayList();
        System.out.println(al.get(1));
    }

    private static void arithmeticExceptionTest() {// ArithmeticException�쳣
//        �����쳣
//        �������쳣����������ʱ���׳����쳣
//        �쳣����
        System.out.println(1 / 0);

    }

    private static void parseExceptionTest() {// ParseException�쳣
//        �����쳣
//        ����ʱ�����������
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