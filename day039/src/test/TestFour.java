package test;

import java.io.UnsupportedEncodingException;

public class TestFour {
//  异常之子类的异常继承机制
    public static void main(String[] args) {
//		try {
//			可能产生异常的代码块;
//		}catch(定义引用接受产生的异常对象) {
//			异常处理的代码;
//		}finally {
//			不论是否出现异常都会执行的代码;
//		}
    }
}

class Father {
    void show() throws Exception {

    }
}

class Son extends Father {
    void show() throws UnsupportedEncodingException {

    }
}