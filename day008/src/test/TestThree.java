package test;

import static java.lang.System.currentTimeMillis;

public class TestThree {

    public static void main(String[] args) {
        long time = currentTimeMillis();
        long days = time / 1000 / 60 / 60 / 24; // 总天数
        long year = 1970, month = 1, day = 1;
        for (; days >= 365;) {
            if (leapYear(year)) {
                days -= 366;
                year++;
            } else {
                days -= 365;
                year++;
            }
        }
        switch ((int) month) {
        case 1:
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 2:
            month = 2;
            if (leapYear(year)) {
                if (days < 29) {
                    day = days;
                    break;
                } else {
                    days -= 29;
                }
            } else {
                if (days < 28) {
                    day = days;
                    break;
                } else {
                    days -= 28;
                }
            }
        case 3:
            month = 3;
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 4:
            month = 4;
            if (days < 30) {
                day = days;
                break;
            }
            days -= 30;
        case 5:
            month = 5;
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 6:
            month = 6;
            if (days < 30) {
                day = days;
                break;
            }
            days -= 30;
        case 7:
            month = 7;
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 8:
            month = 8;
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 9:
            month = 9;
            if (days < 30) {
                day = days;
                break;
            }
            days -= 30;
        case 10:
            month = 10;
            if (days < 31) {
                day = days;
                break;
            }
            days -= 31;
        case 11:
            month = 11;
            if (days < 30) {
                day = days;
                break;
            }
            days -= 30;
        case 12:
            month = 12;
            day = days;
        }
        double hour = time / 1000.0 / 60 / 60 % 60;
        double minute = 0;
        double second = 0;
        System.out.println(year + "年" + month + "月" + (day + 1) + "日" + hour + "时");
    }

    private static boolean leapYear(long year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
