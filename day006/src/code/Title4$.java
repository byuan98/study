package code;

import java.util.*;

public class Title4$ {
//	将一个正整数分解质因数。例如:输入90,打印出90=2*3*3*5
    public static void main(String[] args) {
        System.out.println("请输入需要进行分解质因数的一个正整数");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factor = 2;
        while (number <= number) {
            if (number == factor) {
                System.out.println(factor);
                break;
            } else if (number % factor == 0) { // 是素数就输出
                System.out.print(factor + "*");
                number = number / factor;
            } else {
                factor++; // 不是素数就++
            }
        }
    }
}
