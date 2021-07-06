package test;

import java.util.Date;

public class TestOne {
//  date类
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
        String weeks = "日一二三四五";
        myDate = year + "年" + month + "月" + day + "日" + "星期" + weeks.charAt(week) + hour + "时" + minute + "分" + second
                + "秒";
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
        String weeks = "日一二三四五";
        myDate = year + "年" + month + "月" + day + "日" + "星期" + weeks.charAt(week) + hour + "时" + minute + "分" + second
                + "秒";
        return myDate;
    }
}
