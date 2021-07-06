package job;

import java.util.*;

public class Chap01_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要判断是否为闰年的年份：");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
