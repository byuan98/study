package job;

import java.util.*;

public class Chap01_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, max;
        System.out.println("�������һ������");
        number1 = input.nextInt();
        System.out.println("������ڶ�������");
        number2 = input.nextInt();
        System.out.println("���������������");
        number3 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("������֮����������" + number1);
            } else {
                System.out.println("������֮����������" + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("������֮����������" + number2);
            } else {
                System.out.println("������֮����������" + number3);
            }
        }
    }
}
