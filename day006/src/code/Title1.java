package code;

import java.util.*;

public class Title1 {
//	古典问题:有一对兔子，从出生后第3个月起每个月都生一对兔子,
//	小兔子长到第三个月后每个月又生一对兔子,
//	假如兔子都不死，问每个月的兔子总数为多少?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rabbitPair = 1;// 第一个月,兔子的对数(1-3月);
        int rabbitPairNext = 1;// 下个月兔子的对数(1-3月);
        System.out.println("请输入截至的月数:");
        int endMonth = input.nextInt();
        if (endMonth < 3) {
            System.out.println(endMonth + "月的兔子总数为" + rabbitPair * 2 + "只");
        } else if (endMonth == 3) {
            System.out.println(endMonth + "月的兔子总数为" + rabbitPairNext * 2 + "只");
        } else {
            for (int beginMonth = 4; beginMonth <= endMonth; beginMonth++) {
                int rabbitPairSum = rabbitPair + rabbitPairNext;
                rabbitPairNext = rabbitPair;
                rabbitPair = rabbitPairSum;
                System.out.println(beginMonth + "月的兔子总数为" + rabbitPairSum * 2 + "只");
            }

        }

    }
}
