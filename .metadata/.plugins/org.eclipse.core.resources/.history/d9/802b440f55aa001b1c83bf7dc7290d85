package job;

import java.util.*;

public class Chap01_15 {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数的正整数：");
        number = input.nextInt();
        if (100 <= number && number <= 999) {
            int unit = number / 1 % 10;
            int decade = number / 10 % 10;
            int hundred = number / 100 % 10;
            System.out.println(number + "三位数各位数字之和为" + (unit + decade + hundred));
        } else {
            System.out.println("您输入的不是一个三位数的正整数");
        }
    }
}
