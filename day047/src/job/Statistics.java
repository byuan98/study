package job;

import java.io.*;

public class Statistics {

    public static void main(String[] args) {
//        �����ļ��л�ȡ�ļ��е����ֽ���
        File fileClass = new File("D:\\Code\\34��ҵ");
        File[] fileStudents = fileClass.listFiles();
        for (File student : fileStudents) {
            System.out.println(student.getName());
            File[] studentAll = student.listFiles();
            for (File studentPart : studentAll) {
                System.out.println(
                        studentPart.getName() + "��ҵ���ֽ�����" + statisticsStudentJob(studentPart.getAbsoluteFile(), 0));
            }
        }
//        System.out.println(statisticsStudentJob(new File("D:\\Code\\34��ҵ"),0));
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