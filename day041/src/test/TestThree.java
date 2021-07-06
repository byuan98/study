package test;

import java.io.*;

public class TestThree {
//  IO��������֮�ֽ������
    public static void main(String[] args) {
        fileOutputStreamTest();

    }

    private static void fileOutputStreamTest() {
//        1�������ļ�
        File file = new File("fileOutputStreamtest.txt");
        try {
            System.out.println(file.createNewFile());// createNewFile()�����ᱨһ��IOException�쳣
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        2����������Ŀ���ļ�����;
        try {
            FileOutputStream out = new FileOutputStream(file);
//        3��ѡ��д�ķ�ʽ:һ��дһ���ֽ�/һ��дһ���ַ�����/һ��дһ���ַ������һ����
            try {
//                out.write(49);//һ��дһ���ֽ�
//                out.write("������磬HelloWorld".getBytes("GBK"));//һ��дһ���ֽ�����
                out.write("������磬HelloWorld".getBytes("gbk"), 2, 5);// 2,5:������;2,6:������;һ��дһ���ַ������һ����
            } catch (IOException e) {// writ���׳�һ��IOException�쳣
                e.printStackTrace();
            } finally {
                try {
//                4���ر����ͷ���Դ
                    out.close();
                } catch (IOException e) {// writ���׳�һ��IOException�쳣
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {// FileOutputStream��Ĺ��췽���ᱨһ��FileNotFoundException�쳣
            e.printStackTrace();
        }
    }
}