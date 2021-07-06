//package job;
//
//import java.util.*;
//
//public class Chap11_5 {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println("请输入一个正整数");
//			int number=new Scanner(System.in).nextInt();
//			if(number>0) {//当输入的数字大于0时抛出MyException1异常
//				throw new MyException1("测试MyException1");
//			}else if(number<0) {//当输入的数字大于0时抛出MyException2异常
//				throw new MyException2("测试MyException2");
//			}
//		}catch(MyException1 e1) {
//			System.out.println(e1.getMessage());//测试异常详细信息是否传入无误
//		}catch(MyException2 e2) {
//			System.out.println(e2.getMessage());//同上
//		}
//	}
//}
//
////MyException1设置为已检查异常
//class MyException1 extends Exception{
//	MyException1() {//无参的构造函数
//		
//	}
//	MyException1(String message){//带字符串参数的构造方法
//		super(message);//将参数传入父类的构造方法,产生异常的详细信息
//	}
//}
//
////MyException2设置为未检查异常
//class MyException2 extends RuntimeException{
//    MyException2() {//无参的构造函数
//		
//	}
//	MyException2(String message){//带字符串参数的构造方法
//		super(message);//将参数传入父类的构造方法,产生异常的详细信息
//	}
//}