package test;

import java.io.*;

public class TestTwo {
//  IO��������֮�ֽ�������
    public static void main(String[] args) {
        try {
            fileInputStreamTest();// �������ܸ÷�����������IOException�쳣,����ѡ�񲶻�
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileInputStreamTest() throws IOException {
//        1�������ļ�
        File file = new File("D:\\Code\\FileTest\\FileTest�ļ���˵��.txt");
//        2����������Դ�ļ�����
        FileInputStream in = new FileInputStream(file);// �ù��췽�����׳�FileNotFoundException�쳣
//        3��ѡ����ķ�ʽ:��������ѡ������ֽ�����Ķ�
        byte[] date = new byte[10];
        while (true) {
            int size;
            if (in.read(date) == -1) {// �÷������׳�IOException�쳣
                break;
            }
            System.out.println(new String(date, "utf-8"));
        }
//        4���ر����ͷ���Դ
        in.close();

//        ����д����һ��ȱ��,���ڴ���Ļ����ĵ�λ���ֽ�,�������׳��������������,��������δ�������
        /*
         * ���ļ�? ??����? ?�Բ�ͬ �����? ? ?��io�� �� io��
         */
    }

}