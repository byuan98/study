package test;

public class TestOne {

    public static void main(String[] args) {

        final int s = test(0);// ����ջ�����������η������һ�ε�200
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
//		System.out.println("text()");//java�в����������Զ���޷�ִ�еĴ���
    }

}
