package job;

import java.util.*;

public class NumberFactorial {
//	写一个方法求一个小于10的数的阶乘
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("您想要计算几的阶乘?");
        int number = input.nextInt();
        System.out.println(number + "的阶乘为：" + numberFactorial(number));

    }

    private static long numberFactorial(int number) {
        if (number >= 1 && number < 10) {
            long product = 1;
            for (int i = 2; i <= number; i++) {
                product *= i;
            }
            return product;
        } else {
            System.out.println("该函数只能求小于10的数的阶乘");
            return -1;
        }

    }

}
