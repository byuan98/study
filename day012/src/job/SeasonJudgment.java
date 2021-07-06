package job;

import java.util.*;

public class SeasonJudgment {
//	根据月份判断季节
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要判断季节的月份:");
        int month = input.nextInt();
        String season = seasonJudgment(month); // 使用一个String类型的变量来接受结果;
        if (season != null) { // 如果返回的不是一个空引用,则说明输入的月份存在,将返回值输出即可
            System.out.println(month + "月对应的月份是" + season);
        } else { // 反之,返回了一个空引用则说明输入的月份不存在;
            System.out.println("一年只有1-12个月,没有" + month + "月");
        }
    }

    private static String seasonJudgment(int month) {
        // 使用表查询法来进行判断,穷举出所有可能,将其放入对应的数组下标中,
        // 数组下标的数字对应月份,因为没有0月所以位置0留空;
        String[] season = { null, "冬季", "冬季", "春季", "春季", "春季", "夏季", "夏季", "夏季", "秋季", "秋季", "秋季", "冬季" };
        if (month >= 1 && month <= 12) { // 月份只有1-12,在这个范围内才能进行判断
            return season[month]; // 通过月份对应的数组下标从数组中找出对应结果,直接返回
        }
        return null; // 不在1-12月范围内的直接返回null;
    }

}
