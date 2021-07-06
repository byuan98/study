package job;

import java.util.*;

public class Chap_02_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入任意一个正整数：");
        int sum = 0;
        int number = input.nextInt();
        if (number >= 0) {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("您输入的整数各位相加和为" + sum);
        } else {
            System.out.println("您输入的不是一个正整数");
        }
    }
}
