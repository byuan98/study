package test;

import java.util.Date;

public class TestOne {
//  date��
    public static void main(String[] args) {
        Date d1 = new Date();
        while (true) {
            System.out.println(myDate());
        }
    }

    private static String myDate() {
        java.util.Date d = new Date();
        String myDate = "";

        int year = d.getYear() + 1900;
        int month = d.getMonth() + 1;
        int day = d.getDate();
        int hour = d.getHours();
        int minute = d.getMinutes();
        int second = d.getSeconds();

        int week = d.getDay();
        String weeks = "��һ��������";
        myDate = year + "��" + month + "��" + day + "��" + "����" + weeks.charAt(week) + hour + "ʱ" + minute + "��" + second
                + "��";
        return myDate;
    }

    private static String myDate(Date d) {
        String myDate = "";

        int year = d.getYear() + 1900;
        int month = d.getMonth() + 1;
        int day = d.getDate();
        int hour = d.getHours();
        int minute = d.getMinutes();
        int second = d.getSeconds();

        int week = d.getDay();
        String weeks = "��һ��������";
        myDate = year + "��" + month + "��" + day + "��" + "����" + weeks.charAt(week) + hour + "ʱ" + minute + "��" + second
                + "��";
        return myDate;
    }
}
