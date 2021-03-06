package test;

import java.io.*;

public class TestTwo {
//  IO操作测试之字节输入流
    public static void main(String[] args) {
        try {
            fileInputStreamTest();// 这里会接受该方法传出来的IOException异常,我们选择捕获
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileInputStreamTest() throws IOException {
//        1、创建文件
        File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明.txt");
//        2、创建流与源文件关联
        FileInputStream in = new FileInputStream(file);// 该构造方法会抛出FileNotFoundException异常
//        3、选择读的方式:这里我们选择逐个字节数组的读
        byte[] date = new byte[10];
        while (true) {
            int size;
            if (in.read(date) == -1) {// 该方法会抛出IOException异常
                break;
            }
            System.out.println(new String(date, "utf-8"));
        }
//        4、关闭流释放资源
        in.close();

//        这种写法有一个缺点,由于传输的基本的单位是字节,所以容易出现输出错误的情况,如上面这段代码会输出
        /*
         * 该文件? ??用于? ?试不同 编程语? ? ?的io操 作 io操
         */
    }

}
