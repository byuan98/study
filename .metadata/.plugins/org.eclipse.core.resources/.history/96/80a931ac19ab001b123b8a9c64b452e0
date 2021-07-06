package job;

import java.util.*;

public class Chap_02_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean divisible = false;
        System.out.println("请输入一个大于1的数进行素数判断：");
        int number = input.nextInt();
        if (number >= 1) {
            for (int product = 2; product <= number / 2; product++) {
                if (number % product == 0) {
                    divisible = true;
                    break;
                }
            }
            if (divisible) {
                System.out.println("您输入的数字不是素数");
            } else {
                System.out.println("您输入的数字是素数");
            }
        } else {
            System.out.println("您输入的不是一个大于1的数");
        }
    }
}
