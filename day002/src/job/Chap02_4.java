package job;

import java.util.*;

public class Chap02_4 {

    public static void main(String[] args) {
        int number, product = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个小于10的正整数");
        number = input.nextInt();
        if (number < 10) {
            for (int multiplier = 1; multiplier <= number; multiplier++) {
                product *= multiplier;
            }
            System.out.println("1-" + number + "的乘积为：" + product);
        } else {
            System.out.println("您输入的不是一个小于10的正整数");
        }
    }
}
