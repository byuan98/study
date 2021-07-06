package test;

public class TestTwo {
//  包装类
    public static void main(String[] args) {
        // 基本数据类型--->包装类
        Integer i1 = new Integer(10); // 构造方法
        Integer i2 = Integer.valueOf(20); // 静态方法
        Integer i3 = 30; // 自动装箱:自动创建256个对象[-128，127]

        // 包装类--->基本数据类型
        int n = i1.intValue(); // 普通方法
        n = i2; // 自动拆箱
        System.out.println(n);

        // 字符串对象--->包装类对象
        String s = "12345";
        Integer i4 = new Integer(s);
        System.out.println(i4);
        i4 = Integer.valueOf(s, 6);
        System.out.println(i4);
        System.out.println(12345 + "");

    }

}
