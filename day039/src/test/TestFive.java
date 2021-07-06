package test;

import java.util.*;

public class TestFive {
//  �Զ����쳣��ϰ
//	�Զ����쳣�Ĳ��裺
//	1������һ���̳����쳣��ϵ���ࣨ�̳����쳣��ϵ���ܱ���֮Ϊ�쳣�ࣩ;
//	2���ṩһ���в����Ĺ��췽������ͨ������super(message)�������쳣ԭ��;
//	3���ڷ�����ͨ��throw������һ���Զ����쳣���;
//	4�����쳣������д���;
    public static void main(String[] args) {
        System.out.println("��������������:");
//		AgeException a=new AgeException();//����ֱ�Ӵ�����һ���쳣����,�������쳣���󲢲���ζ�ŷ������쳣
        int age;
//		4�����쳣������д���
        try {
            age = new Scanner(System.in).nextInt();
            if (age < 0) {
//				throw �쳣����  ��ʾ����������쳣���
                throw new AgeException("���������С��0��˶Ժ��ٴ�����");// 3��ͨ��throw����һ���Զ������͵��쳣���
            } else if (age > 150) {
                throw new AgeException("������������150��˶Ժ��ٴ�����");
            }
        } catch (AgeException e) {
            System.out.println("e.toString():-->" + e.toString());// ���ش� throwable �ļ������
//			e.toString():-->test.AgeException: ���������С��0��˶Ժ��ٴ�����
            System.out.println("e.getMessage():-->" + e.getMessage());// ���ش� throwable ����ϸ��Ϣ�ַ���
//			e.getMessage():-->���������С��0��˶Ժ��ٴ�����		
            System.out.println("e.getStackTrace():-->" + e.getStackTrace());
//			e.getStackTrace():-->[Ljava.lang.StackTraceElement;@15aeb7ab
            e.printStackTrace();
//		    test.AgeException: ���������С��0��˶Ժ��ٴ�����
//			at test.TestFive.main(TestFive.java:21)
            System.out.println("age������ΪĬ��ֵ:1");
            age = 1;
        }
        System.out.println("age=" + age);
    }
}

//1������һ���̳����쳣��ϵ�е��쳣��
class AgeException extends Throwable {
    public AgeException() {

    }

    // 2��ͨ�����췽���Ĳ����б�ָ���쳣ԭ��
    AgeException(String message) {
        // ͨ�����ø����в����Ĺ��췽���������쳣ԭ��
        super(message);
    }
}