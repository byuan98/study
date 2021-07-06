package code;

import java.util.*;

public class PerMonthDays {
//	 根据年和月判断此年此月有多少天
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入进行判断天数的年份:");
        int year = input.nextInt();
        System.out.println("请输入进行判断天数的月份:");
        int month = input.nextInt();
        int days = monthDays(year, month);
        if (days != -1) {
            System.out.println(year + "年" + month + "月共" + days + "天");
        } else {
            System.out.println("您输入的年份或月份有误,年份必须大于0,月份必须在1-12月之间");
        }
    }

    private static int monthDays(int year, int month) {
        // 使用表查询法,将一年12个月的天数写入一个数组中,月份从1开始,数组下标从0开始,为了方便调用,数组0号位留空,赋值为-1
        int[] monthDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month >= 1 && month <= 12 && year > 0) { // 进行月份和年份的合理性判断,年份必须大于0,月份必须在1和12之间
            monthDays[2] = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28; // 闰年和平年的2月天数是不一样的,通过三目运算符判断一年是否是闰年,如果是,2月的取值为29
            return monthDays[month]; // 将月份作为数组下标直接返回数组内对应的天数
        }
        return -1; // 如果没有进入上面的if判断,则说明年份或月份不合理,直接返回-1;
    }
}
