package code;

public class IntegralCode {
//包装类之Integer
    public static void main(String[] args) {
        // 1 基本数据类型-->包装类对象
        // 1.1 构造方法
        Integer i1 = new Integer(10);
        // 1.2 静态方法
        Integer i2 = Integer.valueOf(20);
        // 1.3 自动装箱
        Integer i3 = 30;// 编译器自动实现i3=new Integer(30);
        for (int number = -150; number <= 150; number++) {
            Integer i4 = number, i5 = number;
            System.out.println(number + "的比较结果为:" + (i4 == i5));
        } // 自动装箱时,当取值范围在[-128,127]之间使用的是相同对象,
          // 在这个范围之外每装箱一次就是一个新的对象

        // 2 包装类对象-->基本数据类型
        // 2.1 普通方法
        int n1 = i1.intValue();
        // 2.2 自动拆箱
        int n2 = i2;

        // 3 字符串对象-->包装类对象
        // 3.1 构造方法
        String s1 = "10";
        i1 = new Integer(s1);
        // 3.2 静态方法
        // static Integer valueOf(String s);
        // Static Integer valueOf(String s,int radix);//将字符串s转化为radix进制的数字
        i1 = Integer.valueOf("10");
        i2 = Integer.valueOf("20", 2); // 10的2进制

        // 4 包装类对象-->字符串对象
        // 4.1 普通方法
        s1 = i1.toString();
        // 4.2 使用""连接
        s1 = i1 + "";

        // 5 基本数据类型-->字符串
        // 5.1 静态方法
        // static String toBinaryString(int i);
        // static String toHexString(int i);
        // static String toOctalString(int i);
        // static String toString(int i,int radix);//将数字i转化为radix进制的字符串
        // 5.2 使用""连接
        s1 = 10 + "";

        // 6 字符串-->基本数据类型
        // 6.1 静态方法
        // static int parseInt(String s);
        n1 = Integer.parseInt("10");
        n2 = Integer.parseInt("20a");// NumberFormatException
    }

}
