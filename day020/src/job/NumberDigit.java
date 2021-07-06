package job;

import java.util.*;

public class NumberDigit {
//	写一个方法判断参数int数 是几位数
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个需要判断数位的数字：");
        int number = input.nextInt();
        System.out.println(number + "是一个" + numberDigit(number) + "位数");

    }

    private static int numberDigit(int number) {
        int digit = 0;
        while (true) {
            number /= 10;
            digit++;
            if (number == 0) {
                return digit;
            }
        }
    }
}
