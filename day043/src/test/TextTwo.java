package test;

import java.io.*;
import java.util.*;

public class TextTwo {
//    ��սIO
    public static void main(String[] args) throws IOException {
//        IO������������ݴ���ĳ���I��in��O��out
//        ����һ������ģ��������յ���ֽڼ��ϣ��ǶԼ���������ݴ�����ܳƻ���󣬼������������豸֮��Ĵ����֮Ϊ�������ı��������ݴ���
//        �����Ĵ��䷽����ࣨ�ο����󣺼�����ڴ棩��
//            ����������Դ�ļ��е���Ϣ�����ڴ��У�
//                ���ࣺInputStream/Reader
//            ����������ڴ��е���Ϣд��Ŀ���ļ��У�
//                ���ࣺOutputStream/Writer
//        ���������Ļ�����λ���ࣺ
//            �ֽ���������Ļ�����λ���ֽڣ�
//                ���ࣺInputStream/OutputStream
//            �ַ���������Ļ�����λ���ַ���
//                ���ࣺReader/Writer
//        ���������Ķ�����ࣺ
//            �ڵ�����������ʱ������ʱ�ļ�����
//            ������/װ������������ʱ������ʱ�ļ�����
//       
//        1���ֽ����������ֽ������
//            1.1�ֽ���������FileInputStream
//            ���췽����
//                FileInputStream(File file);
//                FileInputStream(String fileName);
//            ��ͨ������
//                void close();//�ر����ͷ���Դ
//                int read();//һ�ζ�ȡһ���ֽ�,�����ļ�ĩβ����-1;
//                int read(byte[] b);//ÿ�ζ�ȡһ���ַ�����,���ض�ȡ���ַ��������Ч����;����Ѿ�����ĩβ�򷵻�-1
//                int read(byte[] b, int off, int len);//�Ӵ��������н����len���ֽڵ����ݶ���һ�� byte������
//                IO��ʹ������������
//                    1����������Դ�ļ�������
//                    2��ѡ���/д��ʽ��
//                    3���ر����ͷ���Դ��
//        fileInputStreamTest();
//        
//            1.2�ֽ��������FileOutputStream
//            ���췽����
//                FileOutputStream(File file);//
//                FileOutputStream(File file, boolean append);//
//                FileOutputStream(String fileName);//
//                FileOutputStream(String fileName, boolean append);//
//            ��ͨ������
//                void close();//�ر���
//                void write(byte b);//һ��дһ���ֽ�
//                void write(byte[] b);//һ��дһ���ֽ�����
//                void write(byte[] b, int off,int len);//һ��дһ���ֽ������һ����
//        fileOutputStreamTest();
//        
//        2���ַ����������ַ������
//            2.1�ַ���������FileReader
//            ���췽����
//                FileReader(File file);
//                FileReader(String fileName);
//            ��ͨ������
//                void close();//�ر���
//                String getEncoding();//��ȡ���뼯
//                int read();//ÿ�ζ�ȡһ���ַ�����������ļ�ĩβ������-1
//                int read(char[] cbuf);//��ȡ���length���ַ�װ��cbuf�У����ر��ζ�ȡ����Ч�ַ�������ﵽ�ļ�ĩβ�򷵻�-1
//        fileReaderTest();
//
//            2.2�ַ��������FileWriter
//            ���췽����
//                FileWriter(File file);
//                FileWriter(File file, boolean append);
//                FileWriter(String fileName);
//                FileWriter(String fileName, boolean append);
//            ��ͨ������
//                void close();//�ر����ͷ���Դ
//                void flush();//ˢ�£�����FileOutputStream�����������Ҫ
//                void write(int c);//һ��дһ���ַ�
//                void write(char[] cbuf);//һ��дһ���ַ�����
//                void write(char[] cbuf, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ�����
//                void write(String str);//һ��дһ���ַ���
//                void write(String str, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ���
//        fileWriterTest();
//  
//        3��ת���������ݱ�������ֽ���ת�����ַ���
//            3.1���ֽ�������ת��Ϊ�ַ���������InputStreamReader
//            ���췽����
//                InputStreamReader(InputStream in);
//                InputStreamReader(InputStream in, String charsetName);
//            ��ͨ��������FileReader��ȫ��ͬ����
//                void close();//�ر���
//                String getEncoding();//��ȡ���뼯
//                int read();//ÿ�ζ�ȡһ���ַ�����������ļ�ĩβ������-1
//                int read(char[] cbuf);//��ȡ���length���ַ�װ��cbuf�У����ر��ζ�ȡ����Ч�ַ�������ﵽ�ļ�ĩβ�򷵻�-1
//
//            3.2���ֽ������ת��Ϊ�ַ��������OutputStreamWrite
//            ���췽����
//                OutputStreamWrite(OutputStream out);
//                OutputStreamWrite(OutputStream out, String charsetName);
//            ��ͨ��������FileWrite��ȫ��ͬ����
//                void close();//�ر����ͷ���Դ
//                void flush();//ˢ�£�����FileOutputStream�����������Ҫ
//                void write(int c);//һ��дһ���ַ�
//                void write(char[] cbuf);//һ��дһ���ַ�����
//                void write(char[] cbuf, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ�����
//                void write(String str);//һ��дһ���ַ���
//                void write(String str, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ���
//
//        4����Ч��������װ�����������������������ص㣺��Ч
//            4.1��Ч�ֽ�����
//                4.1.1��Ч�ֽ���������BufferedInputStream
//                    ��FileInputStream�ķ�װ��������FileInputStream��ȫ��ͬ
//                    ���췽����
//                        BufferedInputStream(InputStream in);
//                        BufferedInputStream(InputStream in, int size);
//                    ��ͨ������
//                        void close();//�ر����ͷ���Դ
//                        int read();//һ�ζ�ȡһ���ֽ�,�����ļ�ĩβ����-1;
//                        int read(byte[] b);//ÿ�ζ�ȡһ���ַ�����,���ض�ȡ���ַ��������Ч����;����Ѿ�����ĩβ�򷵻�-1
//                        int read(byte[] b, int off, int len);//�Ӵ��������н����len���ֽڵ����ݶ���һ�� byte������
//                4.1.2��Ч�ֽ��������BufferedOutputStream
//                    ��FileOutputStream�ķ�װ��������FileOutputStream��ȫ��ͬ
//                    ���췽����
//                        BufferedOutputStream(OutputStream out);
//                        BufferedOutputStream(OutputStream out, int size);
//                    ��ͨ������
//                        void close();//�ر���
//                        void write(byte b);//һ��дһ���ֽ�
//                        void write(byte[] b);//һ��дһ���ֽ�����
//                        void write(byte[] b, int off,int len);//һ��дһ���ֽ������һ����       
//
//            4.2��Ч�ַ�����
//                4.2.1��Ч�ַ���������BufferedReader
//                    ��FileReader�ķ�װ��������FileReader������ͬ
//                    ���췽����
//                        BufferedReader(Reader in);
//                        BufferedReader(Reader in, int sz);
//                    ��ͨ������
//                        void close();//�ر���
//                        String getEncoding();//��ȡ���뼯
//                        int read();//ÿ�ζ�ȡһ���ַ�����������ļ�ĩβ������-1
//                        int read(char[] cbuf);//��ȡ���length���ַ�װ��cbuf�У����ر��ζ�ȡ����Ч�ַ�������ﵽ�ļ�ĩβ�򷵻�-1
//                    ���з�����
//                        String readLine();//һ�ζ�һ�У�����null�����ļ�ĩβ
//                4.2.2��Ч�ַ��������BufferedWriter
//                    ��FileWriter�ķ�װ��������FileWriter������ͬ
//                    ���췽����
//                        BufferedWriter(Writer out);
//                        BufferedWriter(Writer out, int sz);
//                    ��ͨ������
//                        void close();//�ر����ͷ���Դ
//                        void flush();//ˢ�£�����FileOutputStream�����������Ҫ
//                        void write(int c);//һ��дһ���ַ�
//                        void write(char[] cbuf);//һ��дһ���ַ�����
//                        void write(char[] cbuf, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ�����
//                        void write(String str);//һ��дһ���ַ���
//                        void write(String str, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ���
//                    ���з�����
//                        void newLine();//дһ���зָ������ȼ���write("\r\n");
//
//        5����ӡ�����
//            �ص�1�����������ǳɶԵģ�����ӡ��������ǣ�
//            �ص�2��PrintWrite�ȿ�����װ����Ҳ�����ǽڵ�����
//            �ص�3�����Ա�֤���ݵ�ԭ�и�ʽ��
//            ���췽����
//                PrintWriter(File file);//ʹ��ָ���ļ������������Զ���ˢ�µ��� PrintWriter
//                PrintWriter(String fileName);//��������ָ���ļ������Ҳ����Զ���ˢ�µ��� PrintWriter
//            ��ͨ��������ͨ������FileWriter��ȫ��ͬ����
//                void close();//�ر����ͷ���Դ
//                void flush();//ˢ�£�����FileOutputStream�����������Ҫ
//                void write(int c);//һ��дһ���ַ�
//                void write(char[] cbuf);//һ��дһ���ַ�����
//                void write(char[] cbuf, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ�����
//                void write(String str);//һ��дһ���ַ���
//                void write(String str, int off, int len);//һ��дһ����off��ʼ����Ϊlen���ַ���
//            ���з�����
//                void print(boolean b);//��ӡ����ֵ
//                void print(char c);//��ӡ�ַ�
//                
    }

    private static void fileInputStreamTest() throws IOException {// �ֽ���������ͨ��������
        {// 1��һ�ζ�ȡһ���ַ�
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��.txt");
            FileInputStream fin = new FileInputStream(file);
            while (fin.read() != -1) {
                System.out.print((char) fin.read());
            }
            fin.close();
        }

        {// 2��һ�ζ�ȡһ���ַ�����
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��.txt");
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
        {// 1��һ��дһ���ֽ�
            File file = new File("D:\\Code\\FileTest\\1.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            fout.write(43);
            fout.write(44);
            fout.write(45);
            fout.close();
        }
        {// 2��һ��дһ���ֽ�����
            File file = new File("D:\\Code\\FileTest\\2.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            byte[] array = { 43, 44, 45, 46, 47, 48 };
            fout.write(array);
            fout.close();
        }
        {// 3��һ��дһ���ֽ������һ����
            File file = new File("D:\\Code\\FileTest\\3.txt");
            FileOutputStream fout = new FileOutputStream(file);// FileNotFoundException
            byte[] bytes = { 43, 44, 45, 46, 47, 48 };
            fout.write(bytes, 1, 3);
            fout.close();
        }
    }

    private static void fileReaderTest() throws IOException {
        {// 1��һ�ζ�һ���ֽ�
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��.txt");
            FileReader fin = new FileReader(file);// FileNotFoundException
            while (fin.read() != -1) {// fin.read()//IOException
                System.out.print((char) fin.read());
            }
            fin.close();
        }
        {// 2��һ�ζ�һ���ֽ�����
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��.txt");
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
        {// 1��һ��дһ���ַ�
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��1.txt");
            FileWriter fout = new FileWriter(file);
            fout.write(48);
            fout.flush();
            fout.write(49);
            fout.flush();
            fout.write(50);
            fout.flush();
            fout.close();
        }
        {// 2��һ��дһ���ַ�����
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��1.txt");
            FileWriter fout = new FileWriter(file);
            char[] array = { 48, 49, 50, 51, 52 };
            fout.write(array);
            fout.flush();
            fout.close();
        }
        {// 3��һ��дһ���ַ������һ����
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��1.txt");
            FileWriter fout = new FileWriter(file);
            char[] array = { 48, 49, 50, 51, 52 };
            fout.write(array, 1, 2);
            fout.flush();
            fout.close();
        }
        {// 4��һ��дһ���ַ���
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��1.txt");
            FileWriter fout = new FileWriter(file);
            String str = "1234567";
            fout.write(str);
            fout.flush();
            fout.close();
        }
        {// 5��һ��дһ���ַ�����һ����
            File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��1.txt");
            FileWriter fout = new FileWriter(file);
            String str = "1234567";
            fout.write(str, 4, 2);
            fout.flush();
            fout.close();
        }
    }
}