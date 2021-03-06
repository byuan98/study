package job;

import java.io.*;

public class Statistics {

    public static void main(String[] args) {
//        遍历文件夹获取文件夹的总字节数
        File fileClass = new File("D:\\Code\\34作业");
        File[] fileStudents = fileClass.listFiles();
        for (File student : fileStudents) {
            System.out.println(student.getName());
            File[] studentAll = student.listFiles();
            for (File studentPart : studentAll) {
                System.out.println(
                        studentPart.getName() + "作业总字节数：" + statisticsStudentJob(studentPart.getAbsoluteFile(), 0));
            }
        }
//        System.out.println(statisticsStudentJob(new File("D:\\Code\\34作业"),0));
    }

    private static long statisticsStudentJob(File file, long length) {
        if (file.isFile()) {
            return file.length();
        } else if (file.isDirectory()) {
            File[] fileAll = file.listFiles();
            for (File part : fileAll) {
                long filePart = statisticsStudentJob(part.getAbsoluteFile(), 0);
                length += filePart;
            }
            return length;
        } else {
            return 0;
        }

//        13,851,900
    }
}
