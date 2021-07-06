package job;

import java.util.*;

public class LeapYear {
//	判断一个年是不是闰年
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要进行闰年判断的年份:");
        int year = input.nextInt();
        if (leapYear(year)) { // 根据方法返回的布尔值进行判断,如果返回true,则说明是闰年
            System.out.println("您输入的年份是闰年");
        } else { // 反之,则说明不是闰年
            System.out.println("您输入的年份不是闰年");
        }

    }

    private static boolean leapYear(int year) {
        // 闰年判断标准:能被4和400整除但不能被100整除
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // 如果成立则说明是闰年,方法结束,返回true
        }
        return false; // 如果方法到这里还没有结束,则说明不是闰年
    }
}
