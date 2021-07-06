package job;

import java.util.*;

public class Chap01_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, max;
        System.out.println("请输入第一个数：");
        number1 = input.nextInt();
        System.out.println("请输入第二个数：");
        number2 = input.nextInt();
        System.out.println("请输入第三个数：");
        number3 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("三个数之中最大的数是" + number1);
            } else {
                System.out.println("三个数之中最大的数是" + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("三个数之中最大的数是" + number2);
            } else {
                System.out.println("三个数之中最大的数是" + number3);
            }
        }
    }
}
