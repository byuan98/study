package code;

import java.util.*;

public class NarcissisticNumber {
//	判断一个数是不是水仙花数
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个需要判断的数字:");
        int number = input.nextInt();
        if (narcissisticNumberJudge(number)) {
            System.out.println("是水仙花数");
        } else {
            System.out.println("不是水仙花数");
        }
    }

    private static boolean narcissisticNumberJudge(int number) {
        if (number <= 100 && number >= 999) {// 水仙花数是一个三位数,不是三位数一定不是水仙花数
            return false;
        }
        // 分解出这个水仙花数的个位、十位、百位
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        if (Math.pow(unit, 3) + Math.pow(decade, 3) + Math.pow(hundreds, 3) == number) {
            // 如果数字各位的立方相加等于这个数字,说明这是一个水仙花数
            return true;
        }
        // 上面的return true没有执行,便说明不是一个水仙花数
        return false;
    }

}
