package test;

public class TestOne {

    public static void main(String[] args) {

        final int s = test(0);// 方法栈区复制了两次返回最后一次的200
        System.out.println(test(0));

    }

    public static int test(int number) {
        try {
            return 10 / number;
        } catch (Exception e) {
            return 100;
        } finally {
            return 200;
        }
//		System.out.println("text()");//java中不允许存在永远都无法执行的代码
    }

}
