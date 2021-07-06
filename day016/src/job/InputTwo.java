package job;

import java.util.*;

public class InputTwo {
//	定义两个变量n和m  打印如下效果的矩阵
//    如n=5 m=6
//	1  6  11  16  21  26
//	2  7  12  17  22  27
//	3  8  13  18  23  28
//	4  9  14  19  24  29
//	5  10 15  20  25  30
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number(n):");
        int n = input.nextInt();
        System.out.println("Please enter a number(n):");
        int m = input.nextInt();

        for (int numberA = 1; numberA <= n; numberA++) {
            int number = numberA;
            for (int numberB = 0; numberB < m; numberB++) {
                System.out.print(number + "\t");
                number += n;
            }
            System.out.println();
        }

    }

}
