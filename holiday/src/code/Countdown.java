package code;

import java.util.Date;
import java.util.Scanner;

public class Countdown {
//	写一个方法获：public static int getDays(int year,int month,int day);
//	获取指定年指定月指定日 距离过阳历年(xxxx-12-31)还有多少天	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入日：");
        int day = input.nextInt();

        System.out.println(
                year + "年" + month + "月" + day + "日距离过阳历年(" + year + "-12-31)还有" + getDays(year, month, day) + "天");

    }

    public static int getDays(int year, int month, int day) {
        Date begin = new Date(year, month, day);
        Date end = new Date(year, 12, 31);
        long time = end.getTime() - begin.getTime();
        return (int) (time / 1000 / 3600 / 24);
    }
}
