package job;

import java.util.*;

public class Chap01_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("�������һ������");
        number1 = input.nextInt();
        System.out.println("������ڶ�������");
        number2 = input.nextInt();
        System.out.println("���������������");
        number3 = input.nextInt();
        System.out.println("�������Ӵ�С���Ϊ��");
        if (number1 > number2 && number1 > number3) {
            System.out.print(number1 + " ");
            if (number2 > number3) {
                System.out.print(number2 + " " + number3);
            } else {
                System.out.print(number3 + " " + number2);
            }
        } else if (number2 > number1 && number2 > number3) {
            System.out.print(number2 + " ");
            if (number1 > number3) {
                System.out.print(number1 + " " + number3);
            } else {
                System.out.print(number3 + " " + number1);
            }
        } else if (number3 > number1 && number3 > number2) {
            System.out.print(number3 + " ");
            if (number1 > number2) {
                System.out.print(number1 + " " + number2);
            } else {
                System.out.print(number2 + " " + number1);
            }
        }

    }

}
