package job;

import java.util.*;

public class Chap02_4 {

    public static void main(String[] args) {
        int number, product = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("������һ��С��10��������");
        number = input.nextInt();
        if (number < 10) {
            for (int multiplier = 1; multiplier <= number; multiplier++) {
                product *= multiplier;
            }
            System.out.println("1-" + number + "�ĳ˻�Ϊ��" + product);
        } else {
            System.out.println("������Ĳ���һ��С��10��������");
        }
    }
}
