package job;

import java.util.*;

public class Chap_02_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个需要进行判断的三位正整数：");
        int number = input.nextInt();

        if (number >= 100 && number <= 999) {
            int unit, decade, hundreds, kilobit;
            unit = number / 1 % 10;
            decade = number / 10 % 10;
            hundreds = number / 100 % 10;
            if (((unit * unit * unit) + (decade * decade * decade) + (hundreds * hundreds * hundreds)) == number) {
                System.out.println("您输入的数字是一个水仙花数");
            } else {
                System.out.println("您输入的数字不是一个水仙花数");
            }
        } else {
            System.out.println("您输入的不是一个三位正整数");
        }
    }
}
