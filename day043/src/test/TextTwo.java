package test;

import java.io.*;
import java.util.*;

public class TextTwo {
//    再战IO
    public static void main(String[] args) throws IOException {
//        IO流：计算机数据传输的抽象，I：in、O：out
//        流是一组有序的，有起点和终点的字节集合；是对计算机中数据传输的总称或抽象，即数据在两个设备之间的传输称之为流，流的本质是数据传输
//        按流的传输方向分类（参考对象：计算机内存）：
//            输入流：把源文件中的信息读到内存中；
//                父类：InputStream/Reader
//            输出流：把内存中的信息写到目的文件中；
//                父类：OutputStream/Writer
//        按流操作的基本单位分类：
//            字节流：传输的基本单位是字节；
//                父类：InputStream/OutputStream
//            字符流：传输的基本单位是字符；
//                父类：Reader/Writer
//        按流关联的对象分类：
//            节点流：创建流时关联的时文件对象；
//            过滤流/装饰流：创建流时关联的时文件对象；
//       
//        1、字节输入流与字节输出流
//            1.1字节输入流：FileInputStream
//            构造方法：
//                FileInputStream(File file);
//                FileInputStream(String fileName);
//            普通方法：
//                void close();//关闭流释放资源
//                int read();//一次读取一个字节,到达文件末尾返回-1;
//                int read(byte[] b);//每次读取一个字符数组,返回读取的字符数组的有效长度;如果已经到达末尾则返回-1
//                int read(byte[] b, int off, int len);//从此输入流中将最多len个字节的数据读入一个 byte数组中
//                IO流使用铁打三步：
//                    1、创建流与源文件关联；
//                    2、选择读/写方式；
//                    3、关闭流释放资源；
//        fileInputStreamTest();
//        
//            1.2字节输出流：FileOutputStream
//            构造方法：
//                FileOutputStream(File file);//
//                FileOutputStream(File file, boolean append);//
//                FileOutputStream(String fileName);//
//                FileOutputStream(String fileName, boolean append);//
//            普通方法：
//                void close();//关闭流
//                void write(byte b);//一次写一个字节
//                void write(byte[] b);//一次写一个字节数组
//                void write(byte[] b, int off,int len);//一次写一个字节数组的一部分
//        fileOutputStreamTest();
//        
//        2、字符输入流与字符输出流
//            2.1字符输入流：FileReader
//            构造方法：
//                FileReader(File file);
//                FileReader(String fileName);
//            普通方法：
//                void close();//关闭流
//                String getEncoding();//获取编码集
//                int read();//每次读取一个字符，如果到达文件末尾，返回-1
//                int read(char[] cbuf);//读取最多length个字符装入cbuf中，返回本次读取的有效字符，如果达到文件末尾则返回-1
//        fileReaderTest();
//
//            2.2字符输出流：FileWriter
//            构造方法：
//                FileWriter(File file);
//                FileWriter(File file, boolean append);
//                FileWriter(String fileName);
//                FileWriter(String fileName, boolean append);
//            普通方法：
//                void close();//关闭流释放资源
//                void flush();//刷新，处理FileOutputStream其他输出流都要
//                void write(int c);//一次写一个字符
//                void write(char[] cbuf);//一次写一个字符数组
//                void write(char[] cbuf, int off, int len);//一次写一个从off开始长度为len的字符数组
//                void write(String str);//一次写一个字符串
//                void write(String str, int off, int len);//一次写一个从off开始长度为len的字符串
//        fileWriterTest();
//  
//        3、转换流：根据编码表把字节流转换成字符流
//            3.1把字节输入流转换为字符输入流：InputStreamReader
//            构造方法：
//                InputStreamReader(InputStream in);
//                InputStreamReader(InputStream in, String charsetName);
//            普通方法（和FileReader完全相同）：
//                void close();//关闭流
//                String getEncoding();//获取编码集
//                int read();//每次读取一个字符，如果到达文件末尾，返回-1
//                int read(char[] cbuf);//读取最多length个字符装入cbuf中，返回本次读取的有效字符，如果达到文件末尾则返回-1
//
//            3.2把字节输出流转换为字符输出流：OutputStreamWrite
//            构造方法：
//                OutputStreamWrite(OutputStream out);
//                OutputStreamWrite(OutputStream out, String charsetName);
//            普通方法（和FileWrite完全相同）：
//                void close();//关闭流释放资源
//                void flush();//刷新，处理FileOutputStream其他输出流都要
//                void write(int c);//一次写一个字符
//                void write(char[] cbuf);//一次写一个字符数组
//                void write(char[] cbuf, int off, int len);//一次写一个从off开始长度为len的字符数组
//                void write(String str);//一次写一个字符串
//                void write(String str, int off, int len);//一次写一个从off开始长度为len的字符串
//
//        4、高效流：输入装饰流，关联的是其他流；特点：高效
//            4.1高效字节流：
//                4.1.1高效字节输入流：BufferedInputStream
//                    对FileInputStream的封装，方法和FileInputStream完全相同
//                    构造方法：
//                        BufferedInputStream(InputStream in);
//                        BufferedInputStream(InputStream in, int size);
//                    普通方法：
//                        void close();//关闭流释放资源
//                        int read();//一次读取一个字节,到达文件末尾返回-1;
//                        int read(byte[] b);//每次读取一个字符数组,返回读取的字符数组的有效长度;如果已经到达末尾则返回-1
//                        int read(byte[] b, int off, int len);//从此输入流中将最多len个字节的数据读入一个 byte数组中
//                4.1.2高效字节输出流：BufferedOutputStream
//                    对FileOutputStream的封装，方法和FileOutputStream完全相同
//                    构造方法：
//                        BufferedOutputStream(OutputStream out);
//                        BufferedOutputStream(OutputStream out, int size);
//                    普通方法：
//                        void close();//关闭流
//                        void write(byte b);//一次写一个字节
//                        void write(byte[] b);//一次写一个字节数组
//                        void write(byte[] b, int off,int len);//一次写一个字节数组的一部分       
//
//            4.2高效字符流：
//                4.2.1高效字符输入流：BufferedReader
//                    对FileReader的封装，方法和FileReader基本相同
//                    构造方法：
//                        BufferedReader(Reader in);
//                        BufferedReader(Reader in, int sz);
//                    普通方法：
//                        void close();//关闭流
//                        String getEncoding();//获取编码集
//                        int read();//每次读取一个字符，如果到达文件末尾，返回-1
//                        int read(char[] cbuf);//读取最多length个字符装入cbuf中，返回本次读取的有效字符，如果达到文件末尾则返回-1
//                    特有方法：
//                        String readLine();//一次读一行，读到null到达文件末尾
//                4.2.2高效字符输出流：BufferedWriter
//                    对FileWriter的封装，方法和FileWriter基本相同
//                    构造方法：
//                        BufferedWriter(Writer out);
//                        BufferedWriter(Writer out, int sz);
//                    普通方法：
//                        void close();//关闭流释放资源
//                        void flush();//刷新，处理FileOutputStream其他输出流都要
//                        void write(int c);//一次写一个字符
//                        void write(char[] cbuf);//一次写一个字符数组
//                        void write(char[] cbuf, int off, int len);//一次写一个从off开始长度为len的字符数组
//                        void write(String str);//一次写一个字符串
//                        void write(String str, int off, int len);//一次写一个从off开始长度为len的字符串
//                    特有方法：
//                        void newLine();//写一个行分隔符，等价于write("\r\n");
//
//        5、打印输出流
//            特点1：所有流都是成对的，但打印输出流不是；
//            特点2：PrintWrite既可以是装饰流也可以是节点流；
//            特点3：可以保证数据的原有格式；
//            构造方法：
//                PrintWriter(File file);//使用指定文件创建不具有自动行刷新的新 PrintWriter
//                PrintWriter(String fileName);//创建具有指定文件名称且不带自动行刷新的新 PrintWriter
//            普通方法（普通方法与FileWriter完全相同）：
//                void close();//关闭流释放资源
//                void flush();//刷新，处理FileOutputStream其他输出流都要
//                void write(int c);//一次写一个字符
//                void write(char[] cbuf);//一次写一个字符数组
//                void write(char[] cbuf, int off, int len);//一次写一个从off开始长度为len的字符数组
//                void write(String str);//一次写一个字符串
//                void write(String str, int off, int len);//一次写一个从off开始长度为len的字符串
//            特有方法：
//                void print(boolean b);//打印布尔值
//                void print(char c);//打印字符
//                
    }

    private static void fileInputStreamTest() throws IOException {// 字节输入流普通方法测试
        {// 1、一次读取一个字符
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明.txt");
            FileInputStream fin = new FileInputStream(file);
            while (fin.read() != -1) {
                System.out.print((char) fin.read());
            }
            fin.close();
        }

        {// 2、一次读取一个字符数组
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明.txt");
            FileInputStream fin = new FileInputStream(file);
            ArrayList<Byte> al = new ArrayList();
            byte[] array = new byte[1024];
            while (fin.read(array) != -1) {
                System.out.print(new String(array, "utf-8"));
            }
            fin.close();
        }
    }

    private static void fileOutputStreamTest() throws IOException {
        {// 1、一次写一个字节
            File file = new File("D:\\Code\\FileTest\\1.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            fout.write(43);
            fout.write(44);
            fout.write(45);
            fout.close();
        }
        {// 2、一次写一个字节数组
            File file = new File("D:\\Code\\FileTest\\2.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            byte[] array = { 43, 44, 45, 46, 47, 48 };
            fout.write(array);
            fout.close();
        }
        {// 3、一次写一个字节数组的一部分
            File file = new File("D:\\Code\\FileTest\\3.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            byte[] bytes = { 43, 44, 45, 46, 47, 48 };
            fout.write(bytes, 1, 3);
            fout.close();
        }
    }

    private static void fileReaderTest() throws IOException {
        {// 1、一次读一个字节
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明.txt");
            FileReader fin = new FileReader(file);// FileNotFoundException
            while (fin.read() != -1) {// fin.read()//IOException
                System.out.print((char) fin.read());
            }
            fin.close();
        }
        {// 2、一次读一个字节数组
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明.txt");
//            File file=new File("D:\\Code\\Java\\study\\day43\\test1");
            FileReader fin = new FileReader(file);// FileNotFoundException
            char[] array = new char[1024];
            while (fin.read(array) != -1) {// fin.read()//IOException
                System.out.print(new String(new String(array).getBytes(), "utf-8"));
            }
            fin.close();
        }
    }

    private static void fileWriterTest() throws IOException {
        {// 1、一次写一个字符
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明1.txt");
            FileWriter fout = new FileWriter(file);
            fout.write(48);
            fout.flush();
            fout.write(49);
            fout.flush();
            fout.write(50);
            fout.flush();
            fout.close();
        }
        {// 2、一次写一个字符数组
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明1.txt");
            FileWriter fout = new FileWriter(file);
            char[] array = { 48, 49, 50, 51, 52 };
            fout.write(array);
            fout.flush();
            fout.close();
        }
        {// 3、一次写一个字符数组的一部分
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明1.txt");
            FileWriter fout = new FileWriter(file);
            char[] array = { 48, 49, 50, 51, 52 };
            fout.write(array, 1, 2);
            fout.flush();
            fout.close();
        }
        {// 4、一次写一个字符串
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明1.txt");
            FileWriter fout = new FileWriter(file);
            String str = "1234567";
            fout.write(str);
            fout.flush();
            fout.close();
        }
        {// 5、一次写一个字符串的一部分
            File file = new File("D:\\Code\\FileTest\\FileTest文件夹说明1.txt");
            FileWriter fout = new FileWriter(file);
            String str = "1234567";
            fout.write(str, 4, 2);
            fout.flush();
            fout.close();
        }
    }
}