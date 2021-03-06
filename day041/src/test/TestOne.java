package test;

import java.io.*;

public class TestOne {
//  File类测试文件夹创建与删除
//  注意:delete操作具有危险性,使用完毕后请注释覆盖
    public static void main(String[] args) {
        createFolder();
        createFile();
//        deleteAll("D:\\Study\\FileTest\\FileTest\\FileTest\\FileTest\\FileTes");

    }

    private static File[] createFolder() {
//		在Folder文件夹下创建若干文件夹
        File folder_FolderA = new File("D:\\Code\\FileTest\\Folder\\FolderA");
        File folder_FolderB = new File("D:\\Code\\FileTest\\Folder\\FolderB\\FolderBB");
        File folder_FolderC = new File("D:\\Code\\FileTest\\Folder\\FolderC\\FolderCC\\FolderCCC");
        File folder_FolderD = new File("D:\\Code\\FileTest\\Folder\\FolderD\\FolderDD\\FolderDDD\\FolderDDDD");
        File[] files = { folder_FolderA, folder_FolderB, folder_FolderC, folder_FolderD };
        for (File file : files) {
            System.out.println(file + "创建" + (file.mkdirs() ? "成功" : "失败"));
        }
        return files;
    }

    private static File[] createFile() {
//		在Folder文件夹下创建若干文件夹文件
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
                System.out.println(file + "创建" + (file.createNewFile() ? "成功" : "失败"));
            } catch (IOException e) {// createNewFile()方法会报一个IOException异常
                e.printStackTrace();
            }
        }
        return files;
    }

    private static void deleteAll(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            System.out.println(file + "文件" + (file.delete() ? "已删除" : "未删除"));
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
                System.out.println(file + "文件夹" + (file.delete() ? "已删除" : "未删除"));
//                System.out.println(file);
            }
            System.out.println(file + "文件夹" + (file.delete() ? "已删除" : "未删除"));
//            System.out.println(file);
        }
    }
}
