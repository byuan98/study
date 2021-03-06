package test;

import java.io.*;

public class TestThree {
//  IO操作测试之字节输出流
    public static void main(String[] args) {
        fileOutputStreamTest();

    }

    private static void fileOutputStreamTest() {
//        1、创建文件
        File file = new File("fileOutputStreamtest.txt");
        try {
            System.out.println(file.createNewFile());// createNewFile()方法会报一个IOException异常
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        2、创建流与目的文件关联;
        try {
            FileOutputStream out = new FileOutputStream(file);
//        3、选择写的方式:一次写一个字节/一次写一个字符数组/一次写一个字符数组的一部分
            try {
//                out.write(49);//一次写一个字节
//                out.write("你好世界，HelloWorld".getBytes("GBK"));//一次写一个字节数组
                out.write("你好世界，HelloWorld".getBytes("gbk"), 2, 5);// 2,5:好世？;2,6:好世界;一次写一个字符数组的一部分
            } catch (IOException e) {// writ会抛出一个IOException异常
                e.printStackTrace();
            } finally {
                try {
//                4、关闭流释放资源
                    out.close();
                } catch (IOException e) {// writ会抛出一个IOException异常
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {// FileOutputStream类的构造方法会报一个FileNotFoundException异常
            e.printStackTrace();
        }
    }
}
