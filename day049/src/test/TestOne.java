package test;

import java.io.*;

public class TestOne {

    public static void main(String[] args) {
        deleteFile("D:\\Code\\FileTest");
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.isFile()) {
            file.delete();
            System.out.println(file.getName() + "�ļ���ɾ��");
        }
        if (file.isDirectory()) {
            File[] fileAll = file.listFiles();
            for (File filePart : fileAll) {
                deleteFile(filePart.getAbsolutePath().toString());
            }
            file.delete();
            System.out.println(file.getName() + "�ļ�����ɾ��");
        }
    }

}