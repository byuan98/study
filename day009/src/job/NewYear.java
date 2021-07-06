package job;

import java.util.Date;

public class NewYear {
//	写一个方法打印：当前时间xxxx年xx月xx日 星期x xx点xx分xx秒  
//	过年(阴历年2021-2-12)倒计时：xx天
    public static void main(String[] args) {
        myDate();
    }

    static void myDate() {
        Date now = new Date();
        Date future = new Date(2021 - 1900, 2 - 1, 12);
        int year = now.getYear() + 1900;
        int month = now.getMonth() + 1;
        int day = now.getDate();
        int week = now.getDay();
        int hour = now.getHours();
        int minutes = now.getMinutes();
        int seconds = now.getSeconds();
        String weeks = "日一二三四五";

        long interval = future.getTime() - now.getTime();
        System.out.println(year + "年" + month + "月" + day + "日 星期" + weeks.charAt(week) + " " + hour + "点" + minutes
                + "分" + seconds + "秒");
        System.out.println("据过年(阴历年2021-2-12)还有" + interval / 1000 / 60 / 60 / 24 + "天");
    }
}
