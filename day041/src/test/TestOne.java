package test;

import java.io.*;

public class TestOne {
//  File������ļ��д�����ɾ��
//  ע��:delete��������Σ����,ʹ����Ϻ���ע�͸���
    public static void main(String[] args) {
        createFolder();
        createFile();
//        deleteAll("D:\\Study\\FileTest\\FileTest\\FileTest\\FileTest\\FileTes");

    }

    private static File[] createFolder() {
//		��Folder�ļ����´��������ļ���
        File folder_FolderA = new File("D:\\Code\\FileTest\\Folder\\FolderA");
        File folder_FolderB = new File("D:\\Code\\FileTest\\Folder\\FolderB\\FolderBB");
        File folder_FolderC = new File("D:\\Code\\FileTest\\Folder\\FolderC\\FolderCC\\FolderCCC");
        File folder_FolderD = new File("D:\\Code\\FileTest\\Folder\\FolderD\\FolderDD\\FolderDDD\\FolderDDDD");
        File[] files = { folder_FolderA, folder_FolderB, folder_FolderC, folder_FolderD };
        for (File file : files) {
            System.out.println(file + "����" + (file.mkdirs() ? "�ɹ�" : "ʧ��"));
        }
        return files;
    }

    private static File[] createFile() {
//		��Folder�ļ����´��������ļ����ļ�
        File folder = new File("D:\\Code\\FileTest\\Folder\\file1");
        File folder_FolderA_fileA1 = new File("D:\\Code\\FileTest\\Folder\\FolderA\\fileA1");
        File folder_FolderA_fileA2 = new File("D:\\Code\\FileTest\\Folder\\FolderA\\fileA2");
        File folder_FolderA_fileA3 = new File("D:\\Code\\FileTest\\Folder\\FolderA\\fileA3");
        File folder_FolderA_fileA4 = new File("D:\\Code\\FileTest\\Folder\\FolderA\\fileA4");
        File folder_FolderB = new File("D:\\Code\\FileTest\\Folder\\FolderB\\file");
        File folder_FolderC = new File("D:\\Code\\FileTest\\Folder\\FolderC\\FolderCC\\FolderCCC");
        File folder_FolderD = new File("D:\\Code\\FileTest\\Folder\\FolderD\\FolderDD\\FolderDDD\\FolderDDDD");
        File[] files = { folder_FolderA_fileA1, folder_FolderA_fileA2, folder_FolderA_fileA3, folder_FolderA_fileA4 };
        for (File file : files) {
            try {
                System.out.println(file + "����" + (file.createNewFile() ? "�ɹ�" : "ʧ��"));
            } catch (IOException e) {// createNewFile()�����ᱨһ��IOException�쳣
                e.printStackTrace();
            }
        }
        return files;
    }

    private static void deleteAll(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            System.out.println(file + "�ļ�" + (file.delete() ? "��ɾ��" : "δɾ��"));
//            System.out.println(file);
        }
        if (file.isDirectory()) {
            File[] fileAll = file.listFiles();
            if (fileAll == null) {
                return;
            }
            if (fileAll.length != 0) {
                for (File part : fileAll) {
                    deleteAll(part.getAbsolutePath());
                }

            } else {
                System.out.println(file + "�ļ���" + (file.delete() ? "��ɾ��" : "δɾ��"));
//                System.out.println(file);
            }
            System.out.println(file + "�ļ���" + (file.delete() ? "��ɾ��" : "δɾ��"));
//            System.out.println(file);
        }
    }
}