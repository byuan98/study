//package job;
//
//import java.util.*;
//
//public class Chap11_5 {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println("������һ��������");
//			int number=new Scanner(System.in).nextInt();
//			if(number>0) {//����������ִ���0ʱ�׳�MyException1�쳣
//				throw new MyException1("����MyException1");
//			}else if(number<0) {//����������ִ���0ʱ�׳�MyException2�쳣
//				throw new MyException2("����MyException2");
//			}
//		}catch(MyException1 e1) {
//			System.out.println(e1.getMessage());//�����쳣��ϸ��Ϣ�Ƿ�������
//		}catch(MyException2 e2) {
//			System.out.println(e2.getMessage());//ͬ��
//		}
//	}
//}
//
////MyException1����Ϊ�Ѽ���쳣
//class MyException1 extends Exception{
//	MyException1() {//�޲εĹ��캯��
//		
//	}
//	MyException1(String message){//���ַ��������Ĺ��췽��
//		super(message);//���������븸��Ĺ��췽��,�����쳣����ϸ��Ϣ
//	}
//}
//
////MyException2����Ϊδ����쳣
//class MyException2 extends RuntimeException{
//    MyException2() {//�޲εĹ��캯��
//		
//	}
//	MyException2(String message){//���ַ��������Ĺ��췽��
//		super(message);//���������븸��Ĺ��췽��,�����쳣����ϸ��Ϣ
//	}
//}